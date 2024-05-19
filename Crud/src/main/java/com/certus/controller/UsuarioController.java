package com.certus.controller;

import com.certus.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.certus.services.UsuarioServices;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {
	
	
	@Autowired
	private UsuarioServices services;
	
	@GetMapping({"/usuario","/"})
	public String listarUsuario(Model modelo) {
		modelo.addAttribute("usuario",services.listarUsuarios());
		return "usuario";
	}

	@GetMapping({"/usuario/nuevo"})
	public String mostrarUsuarioFormulario(Model modelo) {
		Usuario usuarios = new Usuario();
		modelo.addAttribute("usuario",usuarios);
		return "crearUsuario";
	}

	@PostMapping({"/usuario"})
	public String guardarUsuario(@ModelAttribute("usuario") Usuario usuario) {
		services.guardarUsuario(usuario);
		return "redirect:/usuario";
	}

	@GetMapping("usuario/editar/{id}")
	public String editarUsuario(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("usuario",services.obtenerUsuario(id));
		return "editarUsuario";
	}

	@PostMapping("/usuario/{id}")
	public String actualizarUsuario(@PathVariable Long id, @ModelAttribute("usuario") Usuario usuario,Model modelo) {
		Usuario usuarioActual = services.obtenerUsuario(id);
		usuarioActual.setId(usuario.getId());
		usuarioActual.setNombre(usuario.getNombre());
		usuarioActual.setApellido(usuario.getApellido());
		usuarioActual.setEdad(usuario.getEdad());
		usuarioActual.setEmail(usuario.getEmail());


		services.guardarUsuario(usuarioActual);
		return "redirect:/usuario";

	}

	@GetMapping("/usuario/{id}")
	public String eliminarUsuario(@PathVariable Long id) {
		services.eliminarUsuario(id);
		return "redirect:/usuario";
	}



}

