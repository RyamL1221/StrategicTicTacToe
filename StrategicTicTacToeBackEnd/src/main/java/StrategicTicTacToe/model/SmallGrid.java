package StrategicTicTacToe.model;

import StrategicTicTacToe.exception.*;

public class SmallGrid {
    private char[][] grid;
    private char winner;

    public SmallGrid() {
        this.grid = new char[3][3];
    }

    public SmallGrid(char[][] grid) {
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

    public char getWinner() {
        return winner;
    }

    public void setWinner(char winner) {
        this.winner = winner;
    }

    public String toString() {
        return "Grid: " + grid.toString();
    }

    public boolean gameOver() {
        if(grid[0][0] == 'X' && grid[0][1] == 'X' && grid[0][2] == 'X') { // top row X
            winner = 'X';
            return true;
        } else if(grid[0][0] == 'O' && grid[0][1] == 'O' && grid[0][2] == 'O') { // top row O
            winner = 'O';
            return true;
        } else if(grid[1][0] == 'X' && grid[1][1] == 'X' && grid[1][2] == 'X') { // middle row X
            winner = 'X';
            return true;
        } else if(grid[1][0] == 'O' && grid[1][1] == 'O' && grid[1][2] == 'O') { // middle row O
            winner = 'O';
            return true;
        } else if(grid[2][0] == 'X' && grid[2][1] == 'X' && grid[2][2] == 'X') { // bottom row X
            winner = 'X';
            return true;
        } else if(grid[2][0] == 'O' && grid[2][1] == 'O' && grid[2][2] == 'O') { // bottom row O
            winner = 'O';
            return true;
        } else if(grid[0][0] == 'X' && grid[1][0] == 'X' && grid[2][0] == 'X') { // left col X
            winner = 'X';
            return true;
        } else if(grid[0][0] == 'O' && grid[1][0] == 'O' && grid[2][0] == 'O') { // left col O
            winner = 'O';
            return true;
        } else if(grid[0][1] == 'X' && grid[1][1] == 'X' && grid[2][1] == 'X') { // middle col X
            winner = 'X';
            return true; 
        } else if(grid[0][1] == 'O' && grid[1][1] == 'O' && grid[2][1] == 'O') { // middle col O
            winner = 'O';
            return true;
        } else if(grid[0][2] == 'X' && grid[1][2] == 'X' && grid[2][2] == 'X') { // right col X
            winner = 'X';
            return true;
        } else if (grid[0][2] == 'O' && grid[1][2] == 'O' && grid[2][2] == 'O') { // right col O
            winner = 'O';
            return true;
        }else if(grid[0][0] == 'X' && grid[1][1] == 'X' && grid[2][2] == 'X') { // top left to bottom right X
            winner = 'X';
            return true;
        } else if(grid[0][0] == 'O' && grid[1][1] == 'O' && grid[2][2] == 'O') { // top left to bottom right O
            winner = 'O';
            return true;
        }else if(grid[2][0] == 'X' && grid[1][1] == 'X' && grid[0][2] == 'X') { // bottom left to top right X
            winner = 'X';
            return true;
        } else if(grid[2][0] == 'O' && grid[1][1] == 'O' && grid[0][2] == 'O') { // bottom left to top right O
            winner = 'O';
            return true;
        } else {
            return false;
        } 
    }
}
