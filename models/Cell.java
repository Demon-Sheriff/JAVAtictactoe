package models;

public class Cell {

    private int row;
    private int column;
    // Which player has played on this cell
    private Player player;
    // enum to check if the cell is empty or not
    private enum CellState{
        EMPTY, FILLED
    }
}