import java.util.Scanner;

public class Esercizio {
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);//istanziamo scanner per input utente

   System.out.println("inserisci nome");
   String nome = sc.nextLine(); //legge input string per inserimento nome

   System.out.println("Inserisci anno di nascita");
   int eta = sc.nextInt(); //legge input int per inserimento anno di nascita

   System.out.println("Inserisci giorno della settimana");
   int giornoSettimana = sc.nextInt(); //legge input int per inserimento giorno della settimana
   
   sc.close(); //chiudiamo scanner



   System.out.println("Il tuo nome è "+ nome+ " hai "+ (2025-eta)+" anni e mancano "+(6-giornoSettimana)+" al weekend");
 }
}