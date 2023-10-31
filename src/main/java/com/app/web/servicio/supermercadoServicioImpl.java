package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.ListaDeFrutas;
import com.app.web.repositorio.FrutasRepositorio;

@Service
public class supermercadoServicioImpl implements SupermercadoServicio{
	
	@Autowired
	private FrutasRepositorio repositorio;

	@Override
	public List<ListaDeFrutas> listarTodasLasFrutas() {
		return repositorio.findAll();
	}

	@Override
	public ListaDeFrutas guardarFruta(ListaDeFrutas fruta) {
		return repositorio.save(fruta);
	
	}

	@Override
	public ListaDeFrutas obtenerFrutaId(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public ListaDeFrutas actualizarFruta(ListaDeFrutas fruta) {
		return repositorio.save(fruta);
		
	}

	@Override
	public void eliminarFruta(Long id) {
		repositorio.deleteById(id);
	}
	
}
