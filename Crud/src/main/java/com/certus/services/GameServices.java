package com.certus.services;

import com.certus.model.Game;
import com.certus.model.Usuario;

import java.util.List;

public interface GameServices {
    public List<Game> listarGame();
    public Game guardarGame(Game game);
    public Game obtenerGame(long id);
    public Game ActualizarGame(Game game);
    public void eliminarGame(long id);
}
