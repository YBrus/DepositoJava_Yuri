import java.util.Scanner;

public class EsercizioCicli2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Giocatore 1 inserisci un numero da 1 a 100");
        int numGiocatore1 = myScanner.nextInt();
       
        int tentativi = 1; //inizializzo un contatore per i tentativi del giocatore 2
        //controllo se l'input del giocatore 1 che setta il numero da indovinare non sia minore di 1 o maggiore di 100
        if(numGiocatore1 <1 || numGiocatore1 >100){ 
            System.out.println("Giocatore1 hai inserito valori errati");
            return;
        }
        //utilizzo il ciclo while per il gioco, finché i tentativi sono minori di 5 il gioco continua
        while(tentativi <=5){ 
            System.out.println("Giocatore 2 indovina il del giocatore 1, tentativo n°: "+tentativi);
            int numGiocatore2 = myScanner.nextInt();
            //controllo se l'input del giocatore 1 che setta il numero da indovinare non sia minore di 1 o maggiore di 100
            //se lo è con il continue viene ignorato tutto il resto e il giocatore 2 dovrà inserire un numero idoneo
            if(numGiocatore2<1 || numGiocatore2>100){
                System.out.println("Giocatore2 hai inserito valori errati");
                continue;
            }
            //controlli per verificare se il giocatore ha vinto + stampa del tentativo corrente
            if(numGiocatore2 == numGiocatore1){
                System.out.println("HAI VINTO al tentativo n°: "+tentativi );
                break;

            }else if(numGiocatore2 >= 1 && numGiocatore2 < numGiocatore1){ //suggerimenti per il giocatore se il numero è troppo alto o troppo basso
                System.out.println("numero troppo basso");

            }else if(numGiocatore2 <= 100 && numGiocatore2 > numGiocatore1){
                System.out.println("numero troppo alto");
            }
             //controllo se il numero di tentativi è maggiore di 5 nel caso lo sia il giocatore 2 ha terminato i tentativi e il gioco termina
            if(tentativi > 5){
                System.out.println("tentativi esauriti, riprova!");
            }   
            
            tentativi++; //incremento della variabile tentativi per far scorrere il gioco
            
            
        }
       
        myScanner.close();
        
    }
}
