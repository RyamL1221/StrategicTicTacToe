package main.java.StrategicTicTacToe.service;

import org.springframework.*;
import jakarta.transaction.transactional;

import main.java.StrategicTicTacToe.*;

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
