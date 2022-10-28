package modeloExamen;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) throws IOException {
		
		Scanner obj = new Scanner (new File("C:\\Users\\ffernandez\\Desktop\\Curso Udemy\\Entorno de trabajo curso Udemy\\ModeloExamen\\entrada.txt"), "UTF-8");
		List<String> texto = new ArrayList<>();
		while (obj.hasNextLine()) {
			if(!texto.contains(obj.nextLine())) {
			texto.add(obj.nextLine());
			}
		}
		int i = 0;
		List<String> res = new ArrayList<>();
		while(i<texto.size()) {
			String[] s = texto.get(i).split(",");
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       		LocalDate fecha = LocalDate.parse(s[1], fmt);
			Paciente p = new Paciente(s[0],fecha,i,s[2],s[3],Double.valueOf(s[4]),s[5]);
			res.add(p.toString());
			i++;
		}
		System.out.println(res);
		String nombreArchivo = "pacientesEstado.txt";
 	    try{
 	        Path archivo = Paths.get(nombreArchivo);
 	        Files.write(archivo,res , StandardCharsets.UTF_8); 
 	    }catch(IOException e) {
 	        System.out.println("Tuviste un error");
 	        e.printStackTrace();
 	    }
	}

}
