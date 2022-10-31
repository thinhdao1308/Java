/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package balo;

import java.util.Objects;

/**
 *
 * @author hxt
 */
public class DoVat {
    
    private static Integer dem = 0;
    private Integer id;
    private String ten;
    private Double klg;
    private Double giaTri;

    public DoVat() {
        dem++;
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public DoVat(String ten, Double klg, Double giaTri) {
        dem++;
        this.id = dem;
        this.ten = ten;
        this.klg = klg;
        this.giaTri = giaTri;
    }

    public DoVat(Integer id, String ten, Double klg, Double giaTri) {
        dem++;
        this.id = id;
        this.ten = ten;
        this.klg = klg;
        this.giaTri = giaTri;
    }
    

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Double getKlg() {
        return klg;
    }

    public void setKlg(Double klg) {
        this.klg = klg;
    }

    public Double getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(Double giaTri) {
        this.giaTri = giaTri;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DoVat other = (DoVat) obj;
        return Objects.equals(this.id, other.id);
    }
    
    
}
