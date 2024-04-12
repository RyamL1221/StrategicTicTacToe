package StrategicTicTacToe.service;

import StrategicTicTacToe.exception.GameNotFoundException;
import StrategicTicTacToe.model.Game;
import StrategicTicTacToe.repo.GameRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class GameService {

    private final GameRepo gameRepo;

    @Autowired
    public GameService(GameRepo gameRepo) {
        this.gameRepo = gameRepo;
    }

    public Game addGame(Game game) {
        return gameRepo.save(game);
    }
    
    public List<Game> findAllGames() {
        return gameRepo.findAll();
    }

    public Game editGame(Game game) {
        return gameRepo.save(game);
    }

    public Game findGameById(String id) {
        return gameRepo.findGameById(id)
            .orElseThrow(() -> new GameNotFoundException());
    }

    public void deleteGame(String id) {
        gameRepo.deleteGameById(id);
    }
}
