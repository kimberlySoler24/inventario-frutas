package com.app.web.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.web.entidad.ListaDePedidos;
import com.app.web.repositorio.PedidoRepositorio;

@Service
public class PedidoServicioImpl implements PedidoServicio{
	
	@Autowired
	private PedidoRepositorio repositorioPedido;

	@Override
	public List<ListaDePedidos> listarTodasLosPedidos() {
		// TODO Auto-generated method stub
		return repositorioPedido.findAll();
	}

}
