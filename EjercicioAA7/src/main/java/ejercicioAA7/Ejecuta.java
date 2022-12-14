package ejercicioAA7;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejecuta 
{
public static void main(String []args)throws IOException{
	
	Provincia Sevilla = new Provincia("Sevilla", "41", "", true);
	List<String> texto = new ArrayList<String>();
	texto.add("pipeline{");
	texto.add("agent any");
	texto.add("stages {");
	texto.add("stage('Tiempo'){");
	texto.add("steps{");
	texto.add("println(\"el tiempo para hoy es:\")");
	
	
	String tiempo = "";
	
		try{
			URL url = new URL ("https://www.el-tiempo.net/api/json/v2/provincias/"
								+Sevilla.getCod());
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET"); 
			conn.connect(); 
			int codigoRespuesta = conn.getResponseCode();
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
				tiempo = Sevilla.getNombre()+" tiene un tiempo acutal: "+b[4];					
			}
			
			
			
		} 
		catch (MalformedURLException e) {
			e.printStackTrace();
		}	
		texto.add("println (\""+tiempo+"\")");
		texto.add("}");texto.add("}");
		texto.add("}");texto.add("}");
		System.out.println(texto);
		 String nombreArchivo = "Jenkinsfile";
	 	    try{
	 	        Path archivo = Paths.get(nombreArchivo);
	 	        Files.write(archivo,texto , StandardCharsets.UTF_8);    
	 	    }catch(IOException e) {
	 	        System.out.println("Tuviste un error");
	 	        e.printStackTrace();
	 	    }
}
	
}
