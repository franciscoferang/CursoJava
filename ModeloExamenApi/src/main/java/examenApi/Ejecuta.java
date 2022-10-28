package examenApi;

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

import org.json.JSONObject;

public class Ejecuta {

	public static void main(String[] args) throws IOException {

		
		try{
			URL url = new URL ("https://rickandmortyapi.com/api/character");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET"); 
			conn.connect(); 		
			StringBuilder informacionEnString = new StringBuilder();
			Scanner sc = new Scanner(url.openStream());
			while (sc.hasNext()){
				informacionEnString.append(sc.nextLine());
			}
			sc.close();
			String[] a = informacionEnString.toString().split("id");
			List<String> texto = new ArrayList<String>();
			for(int i=1;i<a.length;i++) {
				String [] b = a[i].split("\"");
				texto.add("El id es = "+i+ ", El nombre es "+b[4]
						+", el status es "+b[8]+", la species es "+b[12]
						+", el type es "+b[16]+ ", el gender es "+b[20]
						+", el origin-name es "+b[26]+", la url-origin es "+b[30]);
			}
			System.out.println(texto);
			String nombreArchivo = "personajes_Rick&Morty.txt";
			try{
		 	       Path archivo = Paths.get(nombreArchivo);
		 	       Files.write(archivo,texto , StandardCharsets.UTF_8);    
		 	   }catch(IOException e) {
		 	       System.out.println("Tuviste un error");
		 	       e.printStackTrace();
		 	   }
		} 
	catch (MalformedURLException e) {
		e.printStackTrace();
	}	      
	}

}
