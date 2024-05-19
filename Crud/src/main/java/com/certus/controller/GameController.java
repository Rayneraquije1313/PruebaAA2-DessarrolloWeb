package com.certus.controller;


import com.certus.model.Game;
import com.certus.model.Usuario;
import com.certus.services.GameServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GameController {

    @Autowired
    private GameServices services;


    @GetMapping("/game")
    public String listarGame(Model modelo) {
        modelo.addAttribute("game", services.listarGame());
        return "game";
    }

    @GetMapping({"/game/nuevo"})
    public String mostrarGameForm(Model modelo) {
        Game game = new Game();
        modelo.addAttribute("game",game);
        return "crearGame";
    }

    @PostMapping({"/game"})
    public String guardarGames(@ModelAttribute("game") Game game) {
        services.guardarGame(game);
        return "redirect:/game";
    }

    @GetMapping("/game/editar/{id}")
    public String editarGame(@PathVariable Long id, Model modelo) {
        modelo.addAttribute("game",services.obtenerGame(id));
        return "editarGame";
    }

    @PostMapping("/game/{id}")
    public String actualizarGame(@PathVariable Long id, @ModelAttribute("game") Game game,Model modelo) {
        Game gameActual = services.obtenerGame(id);
        gameActual.setId(game.getId());
        gameActual.setNombre(game.getNombre());
        gameActual.setCreador(game.getCreador());
        gameActual.setConsola(game.getConsola());
        gameActual.setGenero(game.getGenero());

        services.guardarGame(gameActual);
        return "redirect:/game";

    }

    @GetMapping("/game/{id}")
    public String eliminarGames(@PathVariable Long id) {
        services.eliminarGame(id);
        return "redirect:/game";
    }

}
