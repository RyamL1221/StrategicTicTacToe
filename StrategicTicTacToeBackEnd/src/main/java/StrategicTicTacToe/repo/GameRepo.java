package StrategicTicTacToe.repo;

import org.springframework.stereotype.Repository;
import java.util.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import StrategicTicTacToe.model.Game;

@Repository
public interface GameRepo extends MongoRepository<Game, Long>{
    
    Optional<Game> findGameById(String id);
    void deleteGameById(String Id);

}
