/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;

/**
 *
 * @author frado
 */
public class Igra implements Serializable{
    
    private RezultatIgre igraID;
    private int rb;
    private String kombinacija;
    private int pogodjeniNaMestu;
    private int pogodjeniNisuNaMestu;

    public Igra() {
    }

    public Igra(RezultatIgre igraID, int rb, String kombinacija, int pogodjeniNaMestu, int pogodjeniNisuNaMestu) {
        this.igraID = igraID;
        this.rb = rb;
        this.kombinacija = kombinacija;
        this.pogodjeniNaMestu = pogodjeniNaMestu;
        this.pogodjeniNisuNaMestu = pogodjeniNisuNaMestu;
    }

    public int getPogodjeniNisuNaMestu() {
        return pogodjeniNisuNaMestu;
    }

    public void setPogodjeniNisuNaMestu(int pogodjeniNisuNaMestu) {
        this.pogodjeniNisuNaMestu = pogodjeniNisuNaMestu;
    }

    public RezultatIgre getIgraID() {
        return igraID;
    }

    public void setIgraID(RezultatIgre igraID) {
        this.igraID = igraID;
    }

    public int getRb() {
        return rb;
    }

    public void setRb(int rb) {
        this.rb = rb;
    }

    public String getKombinacija() {
        return kombinacija;
    }

    public void setKombinacija(String kombinacija) {
        this.kombinacija = kombinacija;
    }

    public int getPogodjeniNaMestu() {
        return pogodjeniNaMestu;
    }

    public void setPogodjeniNaMestu(int pogodjeniNaMestu) {
        this.pogodjeniNaMestu = pogodjeniNaMestu;
    }
    
    
    
}
