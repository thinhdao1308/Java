/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package balo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author hxt
 */
public class BangDoVat extends AbstractTableModel {
    private String name[] = {"Ten", "Khoi luong", "Gia tri"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[] = {String.class, Double.class, Double.class};
    ArrayList<DoVat> ds;

    public BangDoVat(ArrayList<DoVat> ds) {
        this.ds = ds;
    }

    @Override
    public int getRowCount() {
        return ds.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            //Cột mã
            case 0:
                return ds.get(rowIndex).getTen();
            case 1:
                return ds.get(rowIndex).getKlg();
            case 2:
                return ds.get(rowIndex).getGiaTri();

            default:
                return null;
        }
    }
    @Override
    public Class getColumnClass(int columnIndex) {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return name[column];
    }
}
