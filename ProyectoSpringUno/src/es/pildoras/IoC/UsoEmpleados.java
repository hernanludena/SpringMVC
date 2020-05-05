package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
	
		//Creacion de objetos de tipo Empleado
		//Empleados Empleado1 = new JefeEmpleado();		
		//Empleados Empleado1 = new SecretarioEmpleado();		
		//Empleados Empleado1 = new DirectorEmpleado();
		//uso de los objetos creados		
		//System.out.println(Empleado1.getTareas());
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DirectorEmpleado Juan = contexto.getBean("miEmpleado",DirectorEmpleado.class);		
		System.out.println(Juan.getTareas());		
		System.out.println(Juan.getInforme());
		System.out.println(Juan.getEmail());
		System.out.println(Juan.getNombreEmpresa());
		
		
		SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);		
		System.out.println(Maria.getTareas());		
		System.out.println(Maria.getInforme());
		System.out.println(Maria.getEmail());
		System.out.println(Maria.getNombreEmpresa());
		
		SecretarioEmpleado Pablo = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		System.out.println(Pablo.getEmail());
		
		
		
		
		contexto.close();

	}

}
