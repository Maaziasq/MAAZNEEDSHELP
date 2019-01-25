/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko3_t4;

/**
 *
 * @author s709068
 */
public class LeasingTieto {
    Tietokone tietokone;
    private Kayttaja kayttaja;
    private String paivamaara;

    public LeasingTieto() {
    }

    public LeasingTieto(Tietokone tietokone, Kayttaja kayttaja, String paivamaara) {
        this.tietokone = tietokone;
        this.kayttaja = kayttaja;
        this.paivamaara = paivamaara;
    }

    public Tietokone getTietokone() {
        return tietokone;
    }

    public void setTietokone(Tietokone tietokone) {
        this.tietokone = tietokone;
    }

    public Kayttaja getKayttaja() {
        return kayttaja;
    }

    public void setKayttaja(Kayttaja kayttaja) {
        this.kayttaja = kayttaja;
    }

    public String getPaivamaara() {
        return paivamaara;
    }

    public void setPaivamaara(String paivamaara) {
        this.paivamaara = paivamaara;
    }

    @Override
    public String toString() {
        return "LeasingTieto{" + "tietokone=" + tietokone + ", kayttaja=" + kayttaja + ", paivamaara=" + paivamaara + '}' + '\n';
    }
    
    
    
}
