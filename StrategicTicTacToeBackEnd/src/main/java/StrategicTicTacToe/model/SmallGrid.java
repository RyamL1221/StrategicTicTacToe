package main.java.StrategicTicTacToe.model;

public class SmallGrid {
    private char[][] grid;

    public SmallGrid() {}

    public SmallGrids(char[][] grid) {
        this.grid = grid;
    }

    public char[][] getGrid() {
        return grid;
    }

    public void setGrid(char[][] grid) {
        this.grid = grid;
    }

    public String toString() {
        return "Grid: " + grid.toString();
    }
}
