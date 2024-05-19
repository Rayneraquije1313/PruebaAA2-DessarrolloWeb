package com.certus.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.certus.model.Usuario;
import com.certus.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServicesImpl implements UsuarioServices {

	@Autowired
	private UsuarioRepositorio repositorio;
	
	public List<Usuario> listarUsuarios() {
		
		return repositorio.findAll();
	}

	@Override
	public Usuario guardarUsuario(Usuario usuario) {
		return repositorio.save(usuario);
	}

	@Override
	public Usuario obtenerUsuario(long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Usuario ActualizarUsuario(Usuario usuario) {
		return repositorio.save(usuario);
	}

	@Override
	public void eliminarUsuario(long id) {
		repositorio.deleteById(id);
	}

}
