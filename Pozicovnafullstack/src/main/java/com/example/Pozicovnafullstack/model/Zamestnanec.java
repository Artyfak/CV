package com.example.Pozicovnafullstack.model;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Zamestnanec {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String meno;
    private String priezvisko;
    private LocalDate datum_narodenia;
    private String sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private LocalDate datum_zalozenia = LocalDate.now();

    public LocalDate getDatum_zalozenia() {
        return datum_zalozenia;
    }

    public void setDatum_zalozenia(LocalDate datum_zalozenia) {
        this.datum_zalozenia = datum_zalozenia;
    }

    public Zamestnanec() {
    }
    

    
}
