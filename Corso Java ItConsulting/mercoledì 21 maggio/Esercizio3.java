import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in); // istanza scanner per input

        System.out.println("dammi il primo numero");
        int x = numScan.nextInt(); //legge primo input int

        System.out.println("dammi il secondo numero");
        int y = numScan.nextInt(); //legge secondo input int

        System.out.println("dammi il terzo numero");
        int z = numScan.nextInt(); //legge terzo input int


        if((x == y) || (x == z) || (y == z)){ //controllo per vedere se ci sono almeno due numeri uguali
            System.out.println("Ci sono almeno due numeri uguali");

        }else if(x > y && x > z){ // controlli per vedere quale numero dei tre è il più grande
            System.out.println("il numero maggiore è: "+ x);

        }else if(y > x && y > z){
            System.out.println("il numero maggiore è: "+ y);

        }else if(z > x && z > y ){
            System.out.println("il numero maggiore è: "+ z);
        }

        numScan.close();
    }
}
