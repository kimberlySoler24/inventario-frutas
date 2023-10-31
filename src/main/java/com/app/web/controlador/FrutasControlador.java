package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entidad.ListaDeFrutas;
import com.app.web.servicio.SupermercadoServicio;

@Controller
public class FrutasControlador {
	@Autowired
	private SupermercadoServicio servicio;
	
	@GetMapping({"/frutas", "/"})
	public String listadoDeFrutas(Model modelo) {
		modelo.addAttribute("frutas", servicio.listarTodasLasFrutas());
		return "frutas"; //nos retorna al archivo frutas
	};
	
	@GetMapping("/frutas/agregarFruta")
	public String AlmacenarFruta(Model modelo) {
		ListaDeFrutas fruta= new ListaDeFrutas();
		modelo.addAttribute("fruta", fruta);
		return "crear_fruta";
	}
	
	@PostMapping("/frutas")
	public String guardarFruta(@ModelAttribute("fruta") ListaDeFrutas fruta){
		servicio.guardarFruta(fruta);
		return "redirect:/frutas";
	}
	
	@GetMapping("/frutas/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("fruta", servicio.obtenerFrutaId(id));
		return "editar_fruta";
	}
	
	@PostMapping("/frutas/{id}")
	public String actualizarFruta(@PathVariable Long id, @ModelAttribute("fruta") ListaDeFrutas fruta, Model modelo) {
		ListaDeFrutas frutaExistente = servicio.obtenerFrutaId(id);
		frutaExistente.setId(id);
		frutaExistente.setTipo(fruta.getTipo());
		frutaExistente.setCantidad(fruta.getCantidad());
		frutaExistente.setPrecio(fruta.getPrecio());
		
		servicio.actualizarFruta(frutaExistente);
		
		return "redirect:/frutas";
	}
	
	
	@GetMapping("/frutas/{id}")
	public String eliminarEstudiante(@PathVariable Long id) {
		servicio.eliminarFruta(id);
		return "redirect:/frutas";
	}
	
}
