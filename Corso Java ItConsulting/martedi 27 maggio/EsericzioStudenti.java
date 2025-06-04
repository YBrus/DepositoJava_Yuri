import java.util.ArrayList;
import java.util.Scanner;

public class EsericzioStudenti {

    public static void main(String[] args) {
        Scanner scannerStr = new Scanner(System.in);
        ArrayList<String> studenti = new ArrayList<>();//dichiaro Arraylist di strighe per contenere gli studenti da inserire tramite scanner
        
        
        System.out.println("inserisci studenti");
        while(true){//ciclo infinito per inserimento studenti che va avanti finché l'utente non inserisce la parola fine
          
            String nomeStudente = scannerStr.nextLine().toLowerCase(); //utilizzo il metodo toLowerCase() per impostare input in minuscolo
            if(nomeStudente.equals("fine")){
                break;
            }
            studenti.add(nomeStudente);//utilizzo il metodo add delle ArrayList per aggiungere la stringa input all'ArrayList
        }
        studenti.sort(null);//utilizzo il metodo sort() delle ArrayList per ordinare i valori dell'ArrayList in ordine alfabetico
        for(String studente : studenti){
            System.out.println("Nome: "+ studente);
        }
        System.out.println("sono stati inseriti "+studenti.size()+" studenti");//con il metodo size() stampo il numero dei valori inseriti nell'ArrayList

        System.out.println("vuoi rimuovere degli studenti?");
        String scelta = scannerStr.nextLine();
        
        if(scelta.equals("si")){
           System.out.println("inserisci studente da rimuovere");
            while(studenti.size()!= 0){//ciclo while utilizzato per eliminare gli studenti che va avanti finché ArrayList ha elementi
              
                String rimuoviStudenti = scannerStr.nextLine();

                if(rimuoviStudenti.equals("fine")){//se la stringa input è fine, si esce dal ciclo while 
                    break;
                }
                System.out.println("Hai rimosso: "+ rimuoviStudenti);
                studenti.remove(rimuoviStudenti); //metodo remove utilizzato per eliminare i valori corrispondenti alla stringa input
            
            }
        }
        
        //se l'ArrayList ha elementi, stampa il numero degli elementi presenti nell'ArrayList e il nome degli studenti tramite il ciclo forEach
        if(studenti.size()>0){ 
            System.out.println("Studenti rimanenti: "+studenti.size());
            for(String studente : studenti){
                    
                System.out.println("Nome: "+ studente);
            
            }
        }else{
            System.out.println("Nessuno studente rimasto");
        }
        
        scannerStr.close();
       
    }
}