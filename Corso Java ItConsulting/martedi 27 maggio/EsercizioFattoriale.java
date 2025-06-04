import java.util.Scanner;

public class EsercizioFattoriale {
    public static void main(String[] args) {
        System.out.println("dammi un numero");
        Scanner scannerStr = new Scanner(System.in);
        String str = scannerStr.nextLine();
        

       try{//utilizzo blocco try/catch per gestire eventuali eccezioni di input
         int numero = Integer.parseInt(str); //provo il parsing in intero della stringa input
         System.out.println(calcoloFattoriale(numero));//se riesce utilizzo il primo metodo per il calcolo del fattoriale
       } catch(NumberFormatException e){
        //se il parsing non funziona gestisco l'eccezione con il catch e utilizzo il secondo metodo che stampa la stringa di valore errato
         System.out.println(calcoloFattoriale(str));
       }
       scannerStr.close();
    }
    //metodo che calcola il fattoriale di un numero
    public static int calcoloFattoriale(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int fattoriale = 1;
        for(int i = n;i>0;i--){
            fattoriale *=i;
        }
        return fattoriale;
    }
    //metodo che torna una stringa in caso di input non numerico
    //utilizzato overloading per chiamare due metodi con lo stesso nome ma con argomenti diversi
     public static String calcoloFattoriale(String str){
        return "inserisci valore valido";
    }
}
