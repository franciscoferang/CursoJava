package ejercicioAA1;
import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ejecuta {

	public static void main(String[] args) throws IOException{

		AnnotationConfigApplicationContext ca = new AnnotationConfigApplicationContext(ConfiguradorAOP.class);
		Servicio servicio = ca.getBean(Servicio.class);
		servicio.salvar();
	}

}
