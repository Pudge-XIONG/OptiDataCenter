package io.pudge;

/**
 * Created by xq on 20/02/2017.
 */
public class Slot {
    int id;
    int row;
    int colunm;
    boolean available;

    public Slot(int row, int colunm) {
        this.row = row;
        this.colunm = colunm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColunm() {
        return colunm;
    }

    public void setColunm(int colunm) {
        this.colunm = colunm;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
