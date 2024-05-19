package com.certus.controller;


import com.certus.model.Comentario;
import com.certus.model.Game;
import com.certus.services.ComentarioServices;
import com.certus.services.GameServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ComentarioController {

    @Autowired
    private ComentarioServices services;


    @GetMapping("/comentario")
    public String listarComentario(Model modelo) {
        modelo.addAttribute("comentario", services.listarComentario());
        return "comentario";
    }

    @GetMapping({"/comentario/nuevo"})
    public String mostrarComentarioForm(Model modelo) {
        Comentario comentario = new Comentario();
        modelo.addAttribute("comentario",comentario);
        return "crearComentario";
    }

    @PostMapping({"/comentario"})
    public String guardarComentario(@ModelAttribute("comentario") Comentario comentario) {
        services.guardarComentario(comentario);
        return "redirect:/comentario";
    }

    @GetMapping("/comentario/editar/{id}")
    public String editarComentario(@PathVariable Long id, Model modelo) {
        modelo.addAttribute("comentario",services.obtenerComentario(id));
        return "editarComentario";
    }

    @PostMapping("/comentario/{id}")
    public String ActualizarComentario(@PathVariable Long id, @ModelAttribute("comentario") Comentario comentario,Model modelo) {
        Comentario comentarioActual = services.obtenerComentario(id);
        comentarioActual.setId(comentario.getId());
        comentarioActual.setNombre(comentario.getNombre());
        comentarioActual.setComentario(comentario.getComentario());

        services.guardarComentario(comentarioActual);
        return "redirect:/comentario";

    }

    @GetMapping("/comentario/{id}")
    public String eliminarComentario(@PathVariable Long id) {
        services.eliminarComentario(id);
        return "redirect:/comentario";
    }

}
