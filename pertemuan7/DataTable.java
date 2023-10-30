package pertemuan7;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;

public class DataTable {
    private ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();

    public void setData(ArrayList<String> data) {
        this.data.add(data);
    }

    public void remove(int row) {
        if (row >= 0 && row < data.size()) {
            data.remove(row);
        }
    }

    public String getData(int row, int col) {
        if (row >= 0 && row < data.size() && col >= 0 && col < data.get(row).size()) {
            return data.get(row).get(col);
        } else {
            return null; // Handle index out of bounds
        }
    }

    public ArrayList<String> getDataRow(int row) {
        if (row >= 0 && row < data.size()) {
            return data.get(row);
        } else {
            return null; // Handle index out of bounds
        }
    }

    public void setDataRow(int row, int col, String value) {
        if (row >= 0 && row < data.size() && col >= 0 && col < data.get(row).size()) {
            data.get(row).set(col, value);
        }
    }

    public int getSize(int row) {
        if (row >= 0 && row < data.size()) {
            return data.get(row).size();
        } else {
            return 0; // Handle index out of bounds
        }
    }

    public int getSizeAll() {
        return data.size();
    }
}
