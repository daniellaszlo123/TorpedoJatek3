
package main;

import java.util.Random;


public class Hajo {
    private int[] pozicio;
    private Random rnd = new Random();

    public Hajo() {
        this.pozicio=new int [3];
        this.pozicio[0]=rnd.nextInt(4)+1;
        this.pozicio[1]=this.pozicio[0]+1;
        this.pozicio[2]=this.pozicio[0]+2;
    }
    
    public String talalat(int poz){
        int i=0;
        while (i<this.pozicio.length && !(this.pozicio[i]==poz)){
            i++;
        }
        return i<this.pozicio.length ? "talált":"mellé";
    }
}
