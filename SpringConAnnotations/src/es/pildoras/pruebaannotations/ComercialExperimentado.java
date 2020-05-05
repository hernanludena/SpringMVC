package es.pildoras.pruebaannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
//@Component("ComercialExperimentado")
public class ComercialExperimentado implements Empleados {
	
	
	//ejecucion de codigo despues de creacion del Bean
	@PostConstruct
	public void ejecutarDespuesCreacion() {
		System.out.println("Ejecutado tras creacion de Bean");
	}
	
	//ejecucion de codigo despues de apagado contenedor Spring
	@PreDestroy
	public void ejecutarAntesDestruccion() {
		System.out.println("Ejecutado antes de la destruccion");
	}
	

	public ComercialExperimentado() {		
	}
	
	/*@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {		
		this.nuevoInforme = nuevoInforme;
	}*/
	
	/*@Autowired
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}	*/

	@Override
	public String getTareas() {		
		return "Vender, vender y vender más!";
	}

	

	@Override
	public String getInforme() {
		//return "Informe generado por el comercial";
		return nuevoInforme.getInformeFinanciero();
	}
	
	@Autowired
	@Qualifier("informeFinancieroTrim2")  //bean id que dbe utilizar en minuscula
	private CreacionInformeFinanciero nuevoInforme;

}
