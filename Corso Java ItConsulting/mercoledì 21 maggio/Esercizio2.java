import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner boolscan = new Scanner(System.in); //istanza oggetto scanner per input boolean
        Scanner numscan = new Scanner(System.in); //istanza oggetto scanner per input int
        
        System.out.println("Dammi la tua eta'");
        int eta = numscan.nextInt(); //lettura input int

        System.out.println("Hai la patente? ");
        boolean patente = boolscan.nextBoolean(); //lettura input boolean

        System.out.println("Hai bevuto?");
        boolean drink = boolscan.nextBoolean(); //lettura input boolean

        if(eta<18){ // controllo valori e output personalizzati in base ai valori ricevuti
            System.out.println("non puoi guidare, sei minorenne");
        } else if(patente == false){
            System.out.println("non puoi guidare, non hai la patente");
        } else if(drink == true){
            System.out.println("non puoi guidare, hai bevuto");
        } else{
            System.out.println("puoi guidare");
        }
        
        boolscan.close();
        numscan.close();
    }
}
