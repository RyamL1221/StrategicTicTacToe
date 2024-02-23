package main.java.StrategicTicTacToe.model;

import main.java.StrategicTicTacToe.exception.GridSizeException;

public class SmallGrid {
    private char[][] grid;

    public SmallGrid() {
        this.grid = new char[3][3];
    }

    public SmallGrids(char[][] grid) {
        if(grid.length != 3 || grid[0].length != 3 || grid[1].length != 3 || grid[2].length != 3) {
            throw new GridSizeException();
        }
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

    public boolean gameOver() {
        if(grid[0][0] == 'X' && grid[0][1] == 'X' && grid[0][2] == 'X' || grid[0][0] == 'O' && grid[0][1] == 'O' && grid[0][2] == 'O') { // top row
            return true;
        } else if(grid[0][0] == 'X' && grid[0][1] == 'X' && grid[0][2] == 'X' || grid[0][0] == 'O' && grid[0][1] == 'O' && grid[0][2] == 'O') {
            return true;
        } else {
            return false;
        }
         
    }
}
