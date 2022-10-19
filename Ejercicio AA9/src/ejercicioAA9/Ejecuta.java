package ejercicioAA9;
import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ejecuta {

	public static void main(String[] args) throws IOException{

		AnnotationConfigApplicationContext ca = new AnnotationConfigApplicationContext(ConfiguradorAOP.class);
		Vuelos_Aerolineas servicio = ca.getBean(Vuelos_Aerolineas.class);
		servicio.salvar();
	}

}
