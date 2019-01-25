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
public class LeasingUtils {

    
    public static LeasingTieto KopioiTieto(LeasingTieto tiedot){
        
        
        //Tietokone t = tiedot.getTietokone();
        Kayttaja k = new Kayttaja();
        Tietokone t = new Tietokone();
        String nro = "";
        LeasingTieto kopio = new LeasingTieto(t,k,nro);
        //Tietokone tkopio = new Tietokone(t.getMerkki(),t.getMalli());
        //kopio.setTietokone(tkopio);
        //kopio.setKayttaja(k);
        //kopio.getTietokone().getMalli();*/
        
        
        kopio.getTietokone().setMalli(tiedot.getTietokone().getMalli());
        kopio.getTietokone().setMerkki(tiedot.getTietokone().getMerkki());
        kopio.setKayttaja(k);
        

        
        return kopio;
    }

}
