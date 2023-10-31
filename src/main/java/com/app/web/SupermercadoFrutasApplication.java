package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entidad.ListaDeFrutas;
import com.app.web.repositorio.FrutasRepositorio;

@SpringBootApplication
public class SupermercadoFrutasApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SupermercadoFrutasApplication.class, args);
	}

	@Autowired
	private FrutasRepositorio repositorio;
	
	@Override
	public void run(String... args) throws Exception {
//		ListaDeFrutas fruta1 = new ListaDeFrutas("Manzana", 10, 2500);
//		repositorio.save(fruta1);
//		
//		ListaDeFrutas fruta2 = new ListaDeFrutas("Naranja", 35, 800);
//		repositorio.save(fruta2);
	}

}
