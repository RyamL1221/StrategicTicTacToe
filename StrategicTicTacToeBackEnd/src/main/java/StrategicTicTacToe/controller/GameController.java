package StrategicTicTacToe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import StrategicTicTacToe.model.Game;
import StrategicTicTacToe.service.GameService;

import java.util.*;

@RestController
@RequestMapping("/game")
public class GameController {
    
    private final GameService gameService; 

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Game>> getAllGames() {
        List<Game> games = gameService.findAllGames();
        return new ResponseEntity<>(games, HttpStatus.OK);
    }

    @GetMapping("find/{id}")
    public ResponseEntity<Game> findGame(@PathVariable("id") String id) {
        Game game = gameService.findGameById(id);
        return new ResponseEntity<>(game, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Game> addGame(@RequestBody Game game) {
        Game addGame = gameService.addGame(game);
        return new ResponseEntity<>(addGame, HttpStatus.CREATED);
    }

    @PutMapping("/edit")
    public ResponseEntity<Game> editGame(@RequestBody Game game) {
        Game editGame = gameService.editGame(game);
        return new ResponseEntity<>(editGame, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteGame(@PathVariable("id") String id) {
        gameService.deleteGame(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
