package com.certus;

import com.certus.model.Comentario;
import com.certus.model.Game;
import com.certus.repositorio.ComentarioRepositorio;
import com.certus.repositorio.GameRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.certus.model.Usuario;
import com.certus.repositorio.UsuarioRepositorio;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}


	
	@Override
	public void run(String... args) throws Exception {
		
/*
		Comentario usuario1 = new Comentario("Que buen juego el resident evil y lo enconte en la mejor tienda theGameZone","Manuel");
		repositorio.save(usuario1);
		
		Comentario usuario2 = new Comentario("buenos precios y el envio de super rapido 10/10","Juliana");
		repositorio.save(usuario2);
*/
		
	}

}
