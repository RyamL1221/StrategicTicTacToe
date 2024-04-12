package StrategicTicTacToe.exception;

public class GameNotFoundException extends RuntimeException{
    
    public GameNotFoundException() {
        throw new RuntimeException("The game cannot be found.");
    }
    public GameNotFoundException(String message) {
        throw new RuntimeException(message);
    }
}
