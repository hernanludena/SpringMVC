package com.pruebas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/secundario")
public class TirarControlador {
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() { //proporciona el formulario
		
		return "HolaAlumnosFormulario";
	}

	@RequestMapping("/procesarFormulario2")	
	public String otroProcesoFormulario(@RequestParam("nombreAlumno") String nombre, Model modelo) {
				
		nombre+=" es el peor alumno";
		
		String mensajeFinal = "Quien es el peor alumno ?" + nombre; 
		
		//agregando info al modelo
		
		modelo.addAttribute("mensajeClaro", mensajeFinal);
		
		return "HolaAlumnosSpring";
	}
}
