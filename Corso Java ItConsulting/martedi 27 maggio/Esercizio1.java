import java.util.Scanner;

public class Esercizio1 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserisci una parola");

        String parola = myScanner.nextLine().toLowerCase();
       
        for(int i = 0; i<parola.length();i++){// itero usando la variabile i che parte da zero fino alla lunghezza della stringa parola
            
            //inizializzo una variabile char che conterrà la lettera della stringa parola alla posizione i-esima utilizzando il metodo charAt(i) 
            char vocale = parola.charAt(i); 
            if (vocale == 'a' || vocale == 'e' || vocale == 'i' || vocale == 'o' || vocale == 'u') {//controllo se la variabile vocale è una vocale
                System.out.println("vocale: " +vocale + " posizione: " + i); 
            }
        }

        myScanner.close();
    }
}