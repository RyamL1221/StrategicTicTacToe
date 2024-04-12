package StrategicTicTacToe.model;

public class Move {
    private Coordinate coordinate;
    private char player;

    public Move() {}

    public Move(Coordinate coordinate, char player) {
        this.coordinate = coordinate;
        this.player = player;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public char getPlayer() {
        return player;
    }

    public void setPlayer(char player) {
        this.player = player;
    }

    public boolean equals(Move move) {
        if(coordinate.equals(coordinate) && player == move.getPlayer()) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Coordinate: " + coordinate + "\tPlayer: " + player;
    }
}
