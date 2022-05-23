
package main;


public class Hajo {
    private int[] pozicio;

    public Hajo(int[] pozicio) {
        this.pozicio=pozicio;
    }
    
    public String talalat(int poz){
        int i=0;
        while (i<this.pozicio.length && !(this.pozicio[i]==poz)){
            i++;
        }
        return i<this.pozicio.length ? "talált":"mellé";
    }
}
