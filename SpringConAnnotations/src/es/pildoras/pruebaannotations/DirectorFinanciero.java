package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {

	
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {		
		this.informeFinanciero = informeFinanciero;
	}
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestion y Direccion de las operaciones financieras de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}
	
	private CreacionInformeFinanciero informeFinanciero;
	
	@Value("${email}")
	private String email;
	
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;

	public String getEmail() {
		return email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	
	
	

}
