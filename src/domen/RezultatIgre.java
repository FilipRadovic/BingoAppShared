/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author frado
 */
public class RezultatIgre implements Serializable{
    
    private int rezultatIgreId;
    private Date datumVreme;
    private String zadataKombinacija;
    private int brojPokusaja;
    private String rezultat;
    private ArrayList<Igra> listaIgara;

    public RezultatIgre() {
    }

    public RezultatIgre(int rezultatIgreId, Date datumVreme, String zadataKombinacija, int brojPokusaja, String rezultat, ArrayList<Igra> listaIgara) {
        this.rezultatIgreId = rezultatIgreId;
        this.datumVreme = datumVreme;
        this.zadataKombinacija = zadataKombinacija;
        this.brojPokusaja = brojPokusaja;
        this.rezultat = rezultat;
        this.listaIgara = listaIgara;
    }

    public ArrayList<Igra> getListaIgara() {
        return listaIgara;
    }

    public void setListaIgara(ArrayList<Igra> listaIgara) {
        this.listaIgara = listaIgara;
    }

    public int getRezultatIgreId() {
        return rezultatIgreId;
    }

    public void setRezultatIgreId(int rezultatIgreId) {
        this.rezultatIgreId = rezultatIgreId;
    }

    public Date getDatumVreme() {
        return datumVreme;
    }

    public void setDatumVreme(Date datumVreme) {
        this.datumVreme = datumVreme;
    }

    public String getZadataKombinacija() {
        return zadataKombinacija;
    }

    public void setZadataKombinacija(String zadataKombinacija) {
        this.zadataKombinacija = zadataKombinacija;
    }

    public int getBrojPokusaja() {
        return brojPokusaja;
    }

    public void setBrojPokusaja(int brojPokusaja) {
        this.brojPokusaja = brojPokusaja;
    }

    public String getRezultat() {
        return rezultat;
    }

    public void setRezultat(String rezultat) {
        this.rezultat = rezultat;
    }
    
    
}
