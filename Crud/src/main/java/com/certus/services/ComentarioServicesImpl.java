package com.certus.services;


import com.certus.model.Comentario;
import com.certus.model.Game;
import com.certus.repositorio.ComentarioRepositorio;
import com.certus.repositorio.GameRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComentarioServicesImpl implements ComentarioServices {

    @Autowired
    private ComentarioRepositorio repositorio;

    public List<Comentario> listarComentario() {
        return repositorio.findAll();
    }

    @Override
    public Comentario guardarComentario(Comentario comentario) {
        return repositorio.save(comentario);
    }

    @Override
    public Comentario obtenerComentario(long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Comentario ActualizarComentario(Comentario comentario) {
        return repositorio.save(comentario);
    }

    @Override
    public void eliminarComentario(long id) {
        repositorio.deleteById(id);
    }
}
