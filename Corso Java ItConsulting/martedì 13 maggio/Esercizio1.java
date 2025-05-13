import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        //istanziamo oggetto Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Dammi una Stringa");
        //input utente stringa con il metodo input.nextLine()
        String inputTesto = input.nextLine();
        System.out.println("stringa di testo: "+ inputTesto);


        System.out.println("Dammi un numero");
        //input utente intero con il metodo input.nextInt()
        int inputNumerico = input.nextInt();
        System.out.println("stringa numerica: "+ inputNumerico);


        System.out.println("Dammi un numero decimale double");
         //input utente double con il metodo input.nextDouble();
        double inputDecimale = input.nextDouble();
        System.out.println("numero decimale double: " + inputDecimale);


        System.out.println("Dammi un numero decimale float");
         //input utente float con il metodo input.nextDouble();
        double inputDecimaleFloat = input.nextFloat();
        System.out.println("numero decimale float: " + inputDecimaleFloat);


        System.out.println("Dammi un booleano");
         //input utente boolean con il metodo input.nextBoolean();
        boolean inputBool = input.nextBoolean();
        System.err.println("booleano: "+ inputBool);

    }
}
