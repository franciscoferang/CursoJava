package ejercicio15;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

public class Ejecuta {

	public static void main(String[] args) {

		
		PeliculaRecaudacion p1 = new PeliculaRecaudacion(1,"Avatar",2009
				,"$2,920,357,254","$784,744,482","$2,135,612,772");
		PeliculaRecaudacion p2 = new PeliculaRecaudacion(2,"Avengers: Endgame",2019
				,"$2,797,501,328","$858,373,000","$1,939,128,328");
		PeliculaRecaudacion p3 = new PeliculaRecaudacion(3,"Titanic",1997
				,"$2,201,647,264","$659,363,944","$1,542,283,320");
		PeliculaRecaudacion p4 = new PeliculaRecaudacion(4,"Star Wars: Episode VII - The Force Awakens"
				,2015,"$2,069,521,700","$936,662,225","$1,132,859,475");
		PeliculaRecaudacion p5 = new PeliculaRecaudacion(5,"Avengers: Infinity War",2018
				,"$2,048,359,754","$678,815,482","$1,369,544,272");
		PeliculaRecaudacion p6 = new PeliculaRecaudacion(6,"Spider-Man: No Way Home",2021
				,"$1,916,050,911","$814,115,070","$1,101,935,841");
		PeliculaRecaudacion p7 = new PeliculaRecaudacion(7,"Jurassic World",2015
				,"$1,671,537,444","$653,406,625","$1,018,130,819");
		PeliculaRecaudacion p8 = new PeliculaRecaudacion(8,"The Lion King",2019
				,"$1,663,250,487","$543,638,043","$1,119,612,444");
		PeliculaRecaudacion p9 = new PeliculaRecaudacion(9,"The Avengers",2012
				,"$1,518,815,515","$623,357,910","$895,457,605");
		PeliculaRecaudacion p10 = new PeliculaRecaudacion(10,"Furious 7",2015
				,"$1,515,341,399","$353,007,020","$1,162,334,379");
				
		List<PeliculaRecaudacion> l = new ArrayList<PeliculaRecaudacion>();
		l.add(p1);l.add(p2);l.add(p3);l.add(p4);l.add(p5);
		l.add(p6);l.add(p7);l.add(p8);l.add(p9);l.add(p10);
		
		JSONObject objeto = new JSONObject();
		
		for(int i=0;i<l.size();i++) {
			objeto.put("Pelicula - "+l.get(i).getNombre(), l.get(i));
		}
        
        String nombreArchivo = "informaciónPeliculas.txt";
	    try{
	    	System.out.println(objeto.toString());
	        Path archivo = Paths.get(nombreArchivo);
	        Files.writeString(archivo,objeto.toString() , StandardCharsets.UTF_8);    
	    }catch(IOException e) {
	        System.out.println("Tuviste un error");
	        e.printStackTrace();
	    }
		
	}

}
