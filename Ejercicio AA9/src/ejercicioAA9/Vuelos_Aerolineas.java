package ejercicioAA9;
import java.io.File;
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

import org.springframework.stereotype.Service;
@Service
public class Vuelos_Aerolineas{
	
	public void salvar()throws IOException{
		//Cojo los datos del txt de Barcelona
		Scanner obj1 = new Scanner (new File("C:\\Users\\ffernandez\\Desktop\\Curso Udemy\\Entorno de trabajo curso Udemy\\Ejercicio AA9\\Barcelona.txt"), "UTF-8");
		List<String> texto1 = new ArrayList<>();
		while (obj1.hasNextLine()) {
			texto1.add(obj1.nextLine());
		}
		String[] pasajes1 = texto1.get(1).split(": ");
		String[] vuelo1 = texto1.get(2).split(": ");
		
		// Creo un vuelo a partir de los datos
		Vuelos vuelos1 = new Vuelos(texto1.get(0),Integer.valueOf(pasajes1[1]), vuelo1[1]);
		
		//Cojo los datos del txt de Berlin
		Scanner obj2 = new Scanner (new File("C:\\Users\\ffernandez\\Desktop\\Curso Udemy\\Entorno de trabajo curso Udemy\\Ejercicio AA9\\Berlin.txt"), "UTF-8");
		List<String> texto2 = new ArrayList<>();
		while (obj2.hasNextLine()) {
			texto2.add(obj2.nextLine());
		}
		String[] pasajes2 = texto2.get(1).split(": ");
		String[] vuelo2 = texto2.get(2).split(": ");
		
		// Creo un vuelo a partir de los datos
		Vuelos vuelos2 = new Vuelos(texto2.get(0),Integer.valueOf(pasajes2[1]), vuelo2[1]);

		//Cojo los datos del txt de Buenos Aires
		Scanner obj3 = new Scanner (new File("C:\\Users\\ffernandez\\Desktop\\Curso Udemy\\Entorno de trabajo curso Udemy\\Ejercicio AA9\\Buenos Aires.txt"), "UTF-8");
		List<String> texto3 = new ArrayList<>();
		while (obj3.hasNextLine()) {
			texto3.add(obj3.nextLine());
		}
		String[] pasajes3 = texto3.get(1).split(": ");
		String[] vuelo3 = texto3.get(2).split(": ");
		
		// Creo un vuelo a partir de los datos
		Vuelos vuelos3 = new Vuelos(texto3.get(0),Integer.valueOf(pasajes3[1]), vuelo3[1]);
		
		//Cojo los datos del txt de Madrid
		Scanner obj4 = new Scanner (new File("C:\\Users\\ffernandez\\Desktop\\Curso Udemy\\Entorno de trabajo curso Udemy\\Ejercicio AA9\\Madrid.txt"), "UTF-8");
		List<String> texto4 = new ArrayList<>();
		while (obj4.hasNextLine()) {
			texto4.add(obj4.nextLine());
		}
		String[] pasajes4 = texto4.get(1).split(": ");
		String[] vuelo4 = texto4.get(2).split(": ");
		
		// Creo un vuelo a partir de los datos
		Vuelos vuelos4 = new Vuelos(texto4.get(0),Integer.valueOf(pasajes4[1]), vuelo4[1]);
		
		//Creo una lista con todos los vuelos
		List<Vuelos> vuelos = new ArrayList<>();
		vuelos.add(vuelos1);vuelos.add(vuelos2);
		vuelos.add(vuelos3);vuelos.add(vuelos4);
		
		//Creo la aerolinea
		Aerolineas aerolinea = new Aerolineas("Iberia", "Madrid", "Francisco", vuelos);
		
		//Creo una lista con las ganancias para calcular la ganancia total
		List<Integer> sumaGanancias= new ArrayList<>();
		sumaGanancias.add(vuelos1.getGanancia());
		sumaGanancias.add(vuelos1.getGanancia());
		sumaGanancias.add(vuelos1.getGanancia());
		sumaGanancias.add(vuelos1.getGanancia());
		Integer gananciaTotal = vuelos1.getGananciaNeta(sumaGanancias);
		
		List<String> texto = new ArrayList<>();
		texto.add("La aerolínea "+aerolinea.getNombre()+", con sede en "+aerolinea.getUbicacion()
				+", con su CEO: "+aerolinea.getCeo());
		texto.add("Dispone de los siguientes Vuelos:");
		texto.add("");
		for(int i=0; i<vuelos.size();i++) {
			texto.add("Destino: "+vuelos.get(i).getDestino());
			texto.add("Cantidad de pasajes vendidos: "+vuelos.get(i).getPasajesVendidos());
			texto.add("Vuelo: "+vuelos.get(i).getVuelo());
			texto.add("Ganancia neta: "+vuelos.get(i).getGanancia());
			texto.add("Cantidad de pasajeros que asistieron al vuelo: "+vuelos.get(i).getPasajeros());
			texto.add("");
		}
		texto.add("Ganancia total: "+gananciaTotal+"€");
		System.out.println(texto);
		
		String nombreArchivo = "resumenVentas_MesAño.txt";
	    try{
	        Path archivo = Paths.get(nombreArchivo);
	        Files.write(archivo,texto , StandardCharsets.UTF_8);    
	    }catch(IOException e){
	        System.out.println("Tuviste un error");
	        e.printStackTrace();
	    }
	}
	
}
