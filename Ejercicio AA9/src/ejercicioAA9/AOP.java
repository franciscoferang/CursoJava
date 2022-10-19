package ejercicioAA9;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component 

public class AOP 
{
	@Before("execution(* salvar())")
	public void log()
	{
		System.out.println("Se va a generar un archivo con los datos de los vuelos");
	}
	
}
