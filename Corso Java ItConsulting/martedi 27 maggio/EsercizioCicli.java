import java.util.Scanner;

public class EsercizioCicli {
    
    public static void main(String[] args) {
       System.out.println("dammi un numero");
       Scanner myScanner = new Scanner(System.in);
       int num = myScanner.nextInt();
       
       //verifico se il numero in ingresso sia compreso tra 1 e 10
       if(num>0 && num <=10){

            for(int i = 1; i<=10;i++){//itero usando un cilo for 
                System.out.println(num * i); //stampo la moltiplicazione della variabile num * il valore della variabile di iterazione i
            }
       } else {
        System.out.println("valore non valido");
       }
        myScanner.close();
    }
    
}