package Schiffeversenken;
import java.util.Scanner;
import java.util.Random;


public class Schiffeversenken {
    public static void main (String [] args) {

        int trefferf1 = 0;
        int trefferf2 = 0;

        int hits = 2;
        int x = 7;
        int field = firstfield(x);
        int secondfield = field + 1;


        // Lösungen der "versteckten" Boote
        System.out.println(field);
        System.out.println(secondfield);


         while (hits >= 1){

                int i = eingabe();
                error(i, x);
                int h1f1 = hitf1(field, i, trefferf1);
                int h2f2= hitf2(secondfield, i, trefferf2);
                vorbei(field,secondfield,i);


                hits = hits - h1f1 - h2f2;

                }
        if (hits == 0){
            System.out.printf("Glückwunsch!\nAlles getroffen");
        }

    }

    public static int eingabe(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Welches Feld wählen sie aus: ");
        int i = scr.nextInt();
        return i;
    }

    public static void error(int choosenNumber, int x){
        if (choosenNumber <= -1) {
            System.out.println("Error! Nur positive Zahlen");
        }
        if (choosenNumber >= x+1) {
            System.out.println("Error! Zahl darf nicht größer als " + (x+1) + " sein");
        }
    }

    public static int firstfield(int x){
        Random rand = new Random();
        int field = rand.nextInt(x);

        if (field == 0) {
            field = field + 1;
        }
        return field;
    }

    public static int hitf1 (int f1, int eingabeNum, int trefferf1){
        if (eingabeNum == f1) {
            System.out.println("Treffer");
            trefferf1 = 1;
        }
        return trefferf1;

    }

    public static int hitf2 (int f2, int eingabeNum, int trefferf2){
        if (eingabeNum == f2) {
            System.out.println("Treffer");
            trefferf2++;
        }
        return trefferf2;
    }

    public static void vorbei (int f1, int f2, int eingabeNum){
        if (eingabeNum != f1 && eingabeNum == f2 || eingabeNum == f1) {
        } else {
            System.out.println("Vorbei!");
        }
    }
}


