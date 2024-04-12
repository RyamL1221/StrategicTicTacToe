package StrategicTicTacToe.model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Document(collection = "game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private String id;
    private LargeGrid largeGrid;
}
