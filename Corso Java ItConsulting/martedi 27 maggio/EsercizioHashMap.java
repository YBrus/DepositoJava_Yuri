import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EsercizioHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dammi una stringa");
        String parola = scanner.nextLine();
        //dichiarazione hashmap che usa come chiave i caratteri della stringa parola
        //e come valori numeri interi che rappresentano quante volte il carattere si ripete nella stringa parola
        HashMap<Character,Integer> frequenzaCaratteri = new HashMap<>(); 

        //trasformo la stringa parola in un array di char utilizzando il metodo toCharArray()
        char[] caratteri = parola.toCharArray();
        for(char c : caratteri){//ciclo forEach per iterare sull'array di char
            if(!frequenzaCaratteri.containsKey(c)){ // controllo se la mappa contiene la chiave
                frequenzaCaratteri.put(c, 1); //se non ha la chiave la aggiungo e assegno un valore
            }else{
                frequenzaCaratteri.put(c,frequenzaCaratteri.get(c)+1); // se ha già la chiave, aggiorno il valore +1
            }
        }
        //stampo la mappa utilizzando Map.Entry 
        for(Map.Entry<Character,Integer> mappa : frequenzaCaratteri.entrySet()){
            
            System.out.println(mappa.getKey() + ": "+mappa.getValue());
        }

        scanner.close();

    }
}
