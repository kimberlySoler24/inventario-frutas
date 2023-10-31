package com.app.web.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="frutas")
public class ListaDePedidos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProducto;
	
	@Column(name = "lista de frutas", nullable = false,length = 50)
	private String listaFrutas;
	
	@Column(name = "Valor total", nullable = false)
	private  int total;
	

	public ListaDePedidos() {

	}

	public ListaDePedidos(long idProducto, String listaFrutas, int total) {
		super();
		this.idProducto = idProducto;
		this.listaFrutas = listaFrutas;
		this.total = total;
	}
	
	public ListaDePedidos(String listaFrutas, int total) {
		super();
		this.listaFrutas = listaFrutas;
		this.total = total;
	}

	public long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
	}

	public String getListaFrutas() {
		return listaFrutas;
	}

	public void setListaFrutas(String listaFrutas) {
		this.listaFrutas = listaFrutas;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "ListaDePedidos [idProducto=" + idProducto + ", listaFrutas=" + listaFrutas + ", total=" + total + "]";
	}
	
	
	
	
	
	
	
}
