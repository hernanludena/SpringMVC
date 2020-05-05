package es.pildoras.IoC;

public class SecretarioEmpleado implements Empleados {
		
	@Override
	public String getTareas() {
		
		return "Gestionar la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el secretario " + informeNuevo.getInforme();
	}
	
	private CreacionInformes informeNuevo;
	private String email;
	private String nombreEmpresa;
	
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	

}
