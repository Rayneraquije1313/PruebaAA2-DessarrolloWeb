package com.certus.services;

import java.util.List;

import com.certus.model.Usuario;


public interface UsuarioServices {
	public List<Usuario>listarUsuarios();
	public Usuario guardarUsuario(Usuario usuario);
	public Usuario obtenerUsuario(long id);
	public Usuario ActualizarUsuario(Usuario usuario);
	public void eliminarUsuario(long id);

}
