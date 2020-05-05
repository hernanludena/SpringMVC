package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Carga de Xml de configuración
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//peticion de beans al contenedor spring		
		SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);		
		SecretarioEmpleado Pedro = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		SecretarioEmpleado Juan = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		System.out.println(Maria);
		System.out.println(Pedro);
		System.out.println(Juan);
		
		if(Maria==Pedro)
			System.out.println("Apuntan al mismo objeto");
		else
			System.out.println("No se trata del mismo objeto");

	}

}

