package com.certus.services;


import com.certus.model.Game;
import com.certus.model.Usuario;
import com.certus.repositorio.GameRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServicesImpl implements GameServices {

    @Autowired
    private GameRepositorio repositorio;

    public List<Game> listarGame() {
        return repositorio.findAll();
    }

    @Override
    public Game guardarGame(Game game) {
        return repositorio.save(game);
    }

    @Override
    public Game obtenerGame(long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Game ActualizarGame(Game game) {
        return repositorio.save(game);
    }

    @Override
    public void eliminarGame(long id) {
        repositorio.deleteById(id);
    }
}
