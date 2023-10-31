package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.ListaDeFrutas;

public interface SupermercadoServicio {
	
	public List<ListaDeFrutas> listarTodasLasFrutas();
	
	public ListaDeFrutas guardarFruta(ListaDeFrutas fruta);
	
	public ListaDeFrutas obtenerFrutaId(Long id);
	
	public ListaDeFrutas actualizarFruta(ListaDeFrutas fruta);
	
	public void eliminarFruta(Long id);
	
}
