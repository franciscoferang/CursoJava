package ejercicioAA1;
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
		Format f = new SimpleDateFormat("yy-mm-dd hh:mm:ss");
		String str = f.format(new Date());
		System.out.println(str);
	}
	
}
