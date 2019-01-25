/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko3_t4;

import java.util.*;
        
public class Viikko3_T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<LeasingTieto> lista = new ArrayList();
        Scanner s = new Scanner(System.in);
        Tietokone t = new Tietokone();
        Kayttaja k = new Kayttaja();
        String pvm ="";
        LeasingTieto tiedot = new LeasingTieto(t, k, pvm);
        
        System.out.println("Anna tietokoneen malli: ");
        tiedot.getTietokone().setMalli(s.nextLine());
        
        System.out.println("Anna tietokoneen merkki");
        tiedot.getTietokone().setMerkki(s.nextLine());
        
        System.out.println("Anna tietokoneen sarjanumero: ");
        tiedot.getTietokone().setSarjanumero(s.nextLine());
        
        System.out.println("Anna käyttäjän nimi: ");
        tiedot.getKayttaja().setNimi(s.nextLine());
        
        System.out.println("Anna käyttäjän osoite: ");
        tiedot.getKayttaja().setOsoite(s.nextLine());
        
        System.out.println("Anna päivämäärä: ");
        tiedot.setPaivamaara(s.nextLine());
        
        lista.add(tiedot);
        
        
        while(true){
            char valinta;
            System.out.println("Lisätäänkö uusi tieto?");
            valinta = s.next().charAt(0);
            s.nextLine();
            if(valinta == 'k'){
                LeasingTieto kopio = LeasingUtils.KopioiTieto(tiedot);
                
                System.out.println("Anna sarjanumero: ");
                kopio.getTietokone().setSarjanumero(s.nextLine());
                
                System.out.println("Anna käyttäjän nimi: ");
                kopio.getKayttaja().setNimi(s.nextLine());
                
                System.out.println("Anna käyttäjän osoite: ");
                kopio.getKayttaja().setOsoite(s.nextLine());
                
                System.out.println("Anna päivämäärä: ");
                kopio.setPaivamaara(s.nextLine());

                
                lista.add(kopio);
            }
            if(valinta == 'e'){
                System.out.println(lista.toString());
                break;
            }
        }

    }
    
}
