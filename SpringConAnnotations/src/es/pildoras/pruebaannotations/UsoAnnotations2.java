package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Leer el Class de Configuracion
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		Empleados Antonio = contexto.getBean("comercialExperimentado", Empleados.class);
		Empleados Lucia = contexto.getBean("comercialExperimentado", Empleados.class);
		
		if(Antonio == Lucia) {
			System.out.println("Apuntan al mismo lugar en memoria");
			System.out.println(Antonio + "\n" + Lucia);
		}else {
			System.out.println("No apuntan al mismo lugar en memoria");
			System.out.println(Antonio + "\n" + Lucia);
		}
				
		//cerrar el contexto
		contexto.close();

	}

}
