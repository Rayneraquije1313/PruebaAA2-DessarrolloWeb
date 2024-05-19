package com.certus.services;

import com.certus.model.Comentario;

import java.util.List;

public interface ComentarioServices {
    public List<Comentario> listarComentario();
    public Comentario guardarComentario(Comentario comentario);
    public Comentario obtenerComentario(long id);
    public Comentario ActualizarComentario(Comentario comentario);
    public void eliminarComentario(long id);
}
