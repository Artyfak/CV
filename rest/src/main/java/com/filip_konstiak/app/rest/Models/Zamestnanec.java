package com.filip_konstiak.app.rest.Models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Zamestnanec {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String meno;
    @Column
    private String priezvisko;
    @Column
    private LocalDate datum_narodenia;
    @Column
    private LocalDate datum_nastupu;
    @Column
    private String sex;
    
    public Zamestnanec() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMeno() {
        return meno;
    }
    public void setMeno(String meno) {
        this.meno = meno;
    }
    public String getPriezvisko() {
        return priezvisko;
    }
    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }
    public LocalDate getDatum_narodenia() {
        return datum_narodenia;
    }
    public void setDatum_narodenia(LocalDate datum_narodenia) {
        this.datum_narodenia = datum_narodenia;
    }
    public LocalDate getDatum_nastupu() {
        return datum_nastupu;
    }
    public void setDatum_nastupu(LocalDate datum_nastupu) {
        this.datum_nastupu = datum_nastupu;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    
}
