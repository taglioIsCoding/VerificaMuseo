/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificatagliani;

/**
 *
 * @author Michele Tagliani
 */
public class Stanze {
    private int lunghezza;
    private int altezza;
    private int larghezza;
    private int volume;
    private int area;

    
    public Stanze (int lunghezza, int altezza , int larghezza)
    {
        this.lunghezza=lunghezza;
        this.altezza=altezza;
        this.larghezza=larghezza;
    }
    
    
    public int getArea() {
        return area;
    }
        public int getVolume() {
        return volume;
    }
    public int getLunghezza() {
        return lunghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public int getLarghezza() {
        return larghezza;
    }
    
    public void setArea(int area) {
        this.area = area;
    }
    
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setLunghezza(int lunghezza) {
        this.lunghezza = lunghezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }
    
    public int calcolaVolume(int v1,int v2, int v3, int v4)
    {
        int vTot=this.volume*4+v2*2+v3*4+v4*2;
        return vTot;
    }
    
    public int calcolaArea(int a2, int a3, int a4)
    {
        int aTot=this.area*4+a2*2+a3*4+a4*2;
        return aTot;
    }
    
    public int costoPittura(String p, int aTot)
    {
        String a ="OTT";
        String b ="RUG";
        String c ="AME";
        int costo=0;
        if (p.equalsIgnoreCase(a))
            costo=aTot*45;
        else if (p.equalsIgnoreCase(b))
             costo=aTot*40;
        else if (p.equalsIgnoreCase(c))
             costo=aTot*50;
        
        return costo;
    }
    
    public int costoManodopera(int lav, int aTot)
    {
        int c=0;
        int i=0; // i rappresenta i giorni di lavoro
        do
        {
         c=c+lav*80;
         i++;
        }while (c<aTot);
        int man=i*lav*80;
        return man; 
    }
    
}
