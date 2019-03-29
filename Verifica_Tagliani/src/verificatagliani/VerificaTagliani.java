/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificatagliani;
import java.util.Scanner;
/**
 *
 * @author Michele Tgaliani
 */
public class VerificaTagliani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stanze s1 = new Stanze (10 , 4, 5);
        Stanze s2 = new Stanze (5 , 4, 5);
        Stanze s3 = new Stanze (16 , 6, 10);
        Stanze s4 = new Stanze (16 , 6, 5);
        Scanner s = new Scanner (System.in);
        int d;
        String p = "";
        int lavoratori;
        int costoM;
        int costoT;
        
        s1.setVolume(s1.getLarghezza()*s1.getLunghezza()*s1.getAltezza());
        s2.setVolume(s2.getLarghezza()*s2.getLunghezza()*s2.getAltezza());
        s3.setVolume(s3.getLarghezza()*s3.getLunghezza()*s3.getAltezza());
        s4.setVolume(s4.getLarghezza()*s4.getLunghezza()*s4.getAltezza());
        
        int vTot=s1.calcolaVolume(s1.getVolume(),s2.getVolume(), s3.getVolume(), s4.getVolume());
        System.out.println("il volume del museo e' di "+vTot+"m^3");
        
        
        s1.setArea(s1.getLunghezza()*s1.getAltezza()*2+s1.getLarghezza()*s1.getAltezza()*2+s1.getLarghezza()*s1.getLunghezza());
        s2.setArea(s2.getLunghezza()*s2.getAltezza()*2+s2.getLarghezza()*s2.getAltezza()*2+s2.getLarghezza()*s2.getLunghezza());
        s3.setArea(s3.getLunghezza()*s3.getAltezza()*2+s3.getLarghezza()*s3.getAltezza()*2+s3.getLarghezza()*s3.getLunghezza());
        s4.setArea(s3.getLunghezza()*s3.getAltezza()*2+s3.getLarghezza()*s3.getAltezza()*2+s4.getLarghezza()*s4.getLunghezza());
        
        int aTot=s1.calcolaArea(s2.getArea(), s3.getArea(), s4.getArea());
        System.out.println("l'area da pitturare del museo è di "+aTot+ "m^2");
        
        do
        {
        System.out.println("inserisci il tipo di pittura: 1-otanio, 2-ruggine, 3-ametista");
        d=s.nextInt();  
        }while (d!=1&&d!=2&&d!=3);
 
        if (d==1)
            p="OTT";
        else if (d==2)
            p="RUG";
        else if (d==3)
            p="AME";
        
        int costoP=s1.costoPittura(p, aTot);
        
        do
        {
        System.out.println("inserisci il numero di lavoratori");
        lavoratori=s.nextInt();   
        }while (lavoratori<=0);
                
        costoM=s1.costoManodopera(lavoratori, aTot);
        
        costoT=costoM+costoP;
        System.out.println("tinteggiate in museo utilizzando "+p+" costerebbe "+costoT+"$" );
        
    }
    
    
}
