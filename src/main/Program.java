
package main;

import java.util.Scanner;

public class Program {

    private Hajo hajo=new Hajo();
    private Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Torpedó játék");
        new Program().jatek();
    }
    
    private boolean loves(int poz){
        String t=hajo.talalat(poz);
        System.out.println(t);
        return t.equals("talált");
    }
    
    public void jatek(){
        int talalatSzam=0, lovesSzam=0;
        int egyLoves;
        do {
            System.out.print("lövés: ");
            egyLoves=sc.nextInt();
            boolean talalt=loves(egyLoves);
            if (talalt) {
                talalatSzam++;
            }
            lovesSzam++;
        } while (!(talalatSzam>2));
        System.out.printf("A hajó elsüllyedt %d lövésből\n", lovesSzam);
    }
    
}
