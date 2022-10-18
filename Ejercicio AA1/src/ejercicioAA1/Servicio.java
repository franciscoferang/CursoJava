package ejercicioAA1;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.springframework.stereotype.Service;
@Service
public class Servicio 
{
public void salvar()throws IOException{
	
	Provincia Barcelona = new Provincia("Barcelona", "08", "1.62 millones", true);
	String texto = "";
	
		try{
			URL url = new URL ("https://www.el-tiempo.net/api/json/v2/provincias/"
								+Barcelona.getCod());
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET"); 
			conn.connect(); 
			int codigoRespuesta = conn.getResponseCode();										  //o no
			if (codigoRespuesta != 200){
				throw new RuntimeException("Respuesta de error:" + codigoRespuesta);	
			}else{		
				StringBuilder informacionEnString = new StringBuilder();
				Scanner sc = new Scanner(url.openStream());
				while (sc.hasNext()){
					informacionEnString.append(sc.nextLine());
				}
				sc.close();
				String[] a = informacionEnString.toString().split("today");
				String[] b = a[1].split("\"");
				texto = Barcelona.getNombre()+" tiene un tiempo acutal: "+b[4];					
			}
			
		} 
		catch (MalformedURLException e) {
			e.printStackTrace();
		}	
		
		System.out.println(texto);
}
	
}
