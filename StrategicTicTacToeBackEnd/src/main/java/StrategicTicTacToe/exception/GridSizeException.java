package StrategicTicTacToe.exception;

public class GridSizeException extends RuntimeException{
    
    public GridSizeException() {
        throw new RuntimeException("The grid size dimensions are not valid.");
    }
    public GridSizeException(String message) {
        throw new RuntimeException(message);
    }
}
