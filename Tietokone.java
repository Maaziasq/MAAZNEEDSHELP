package viikko3_t4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s709068
 */
public class Tietokone {
    private String merkki;
    private String malli;
    private String sarjanumero;

    public Tietokone() {
    }

    public Tietokone(String merkki, String malli) {
        this.merkki = merkki;
        this.malli = malli;
    }


    public Tietokone(String merkki, String malli, String sarjanumero) {
        this.merkki = merkki;
        this.malli = malli;
        this.sarjanumero = sarjanumero;
    }

    public String getMerkki() {
        return merkki;
    }

    public void setMerkki(String merkki) {
        this.merkki = merkki;
    }

    public String getMalli() {
        return malli;
    }

    public void setMalli(String malli) {
        this.malli = malli;
    }

    public String getSarjanumero() {
        return sarjanumero;
    }

    public void setSarjanumero(String sarjanumero) {
        this.sarjanumero = sarjanumero;
    }

    @Override
    public String toString() {
        return "Tietokone{" + "merkki=" + merkki + ", malli=" + malli + ", sarjanumero=" + sarjanumero + '}';
    }
    
    
}
