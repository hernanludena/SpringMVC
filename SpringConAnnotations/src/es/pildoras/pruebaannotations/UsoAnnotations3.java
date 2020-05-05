package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations3 {

	public static void main(String[] args) {
				
		//Leer el Class de Configuracion
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		
		Empleados empleado = contexto.getBean("directorFinanciero", Empleados.class);
		
		System.out.println(empleado.getInforme());
		System.out.println(empleado.getTareas());
		
		
		DirectorFinanciero empleado2 = contexto.getBean("directorFinanciero", DirectorFinanciero.class);
		System.out.println("Email del Director: "+ empleado2.getEmail());
		System.out.println("Nombre de la Empresa: "+ empleado2.getNombreEmpresa());
		
		
		//cerrar el contexto
		contexto.close();

	}

}
