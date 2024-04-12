package StrategicTicTacToe.model;

public class Coordinate {
    private int sx;
    private int sy;
    private int lx;
    private int ly;

    public Coordinate() {}

    public Coordinate(int sx, int sy, int lx, int ly) {
        this.sx = sx;
        this.sy = sy;
        this.lx = lx;
        this.ly = ly;
    }

    public int getSx() {
        return sx;
    }

    public void setSx(int sx) {
        this.sx = sx;
    }

    public int getSy() {
        return sy;
    }

    public void getSy(int sy) {
        this.sy = sy;
    }

    public int getLx() {
        return lx;
    }

    public void setLx(int lx) {
        this.lx = lx;
    }

    public int getLy() {
        return ly;
    }

    public void setLy(int ly) {
        this.ly = ly;
    }

    public boolean equals(Coordinate coordinate) {
        if(sx == coordinate.getSx() && sy == coordinate.getSy() && lx == coordinate.getLx() && ly == coordinate.getLy()) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "SmallGrid X: " + sx + "\tSmallGrid Y: " + sy + "\tLargeGrid X: " + lx + "\tLargeGrid Y: " + ly;
    }
}
