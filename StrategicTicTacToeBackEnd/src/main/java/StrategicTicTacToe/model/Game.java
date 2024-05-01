package StrategicTicTacToe.model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;

@Document(collection = "game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private String id;
    private LargeGrid largeGrid;
    private ArrayList<Move> moves;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LargeGrid getLargeGrid() {
        return largeGrid;
    }

    public void setLargeGrid(LargeGrid largeGrid) {
        this.largeGrid = largeGrid;
    }

    public ArrayList<Move> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<Move> moves) {
        this.moves = moves;
    }

    public void addMove(Move move) {
        this.moves.add(move);
    }

    public void removeMove(Move move) {
        this.moves.remove(move);
    }

    public String toString() {
        return "Id: " + id;
    }

}
