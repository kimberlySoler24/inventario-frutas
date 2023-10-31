package com.app.web.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="frutas")
public class ListaDeFrutas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "tipo", nullable = false,length = 50)
	private String tipo;
	
	@Column(name = "Cantidad", nullable = false)
	private  int cantidad;
	
	@Column(name = "precio", nullable = false)
	private long precio;
	
	public ListaDeFrutas() {
		
	}

	public ListaDeFrutas(long id, String tipo, int cantidad, long precio) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	public ListaDeFrutas(String tipo, int cantidad, long precio) {
		super();
		this.tipo = tipo;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public long getPrecio() {
		return precio;
	}

	public void setPrecio(long precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "ListaDeFrutas [id=" + id + ", tipo=" + tipo + ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}
	
	
	
}
