import java.util.Scanner; //importiamo classe Scanner

public class EsempioScanner {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); //creiamo l'oggetto Scanner
        System.out.println("Enter Username");

        String userName = myObj.nextLine(); //legge l'input
        
        System.out.println("Username is: "+ userName); //output dell input utente
    }
}
