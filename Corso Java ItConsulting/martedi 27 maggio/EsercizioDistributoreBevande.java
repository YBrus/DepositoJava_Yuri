import java.util.Scanner;

public class EsercizioDistributoreBevande {
    public static void main(String[] args) {
        double credito = 10; //credito inziale per effettuare acquisti

        Scanner myScanner = new Scanner(System.in);
        double prezzo = 0; //variabile di appoggio usata all'interno dello switch per il prezzo delle bevande
        boolean flag = true; //variabile booleana da utilizzare all'interno dello switch per gestire l'uscita dal distributore

        while(credito >= 0 && flag){
            //stampe utilizzate per simulare il menù del distributore automatico
            System.out.println("Benvenuto! Seleziona la tua bevanda!");
            System.out.println("1. Caffè - 1.50€");
            System.out.println("2. Cappuccino - 2.00€");
            System.out.println("3. Tè - 1.00€");
            System.out.println("4.Acqua - 0.50€");
            System.out.println("5. Uscire");

            int scelta = myScanner.nextInt();
           //switch su input scanner scelta per la simulazione della scelta e acquisto della bevanda con i prezzi e nomi delle bevande selezionate  
           switch(scelta){
            case 1: prezzo = 1.50; 
                    System.out.println("hai scelto caffè");
            break;
            case 2: prezzo = 2.00;
                    System.out.println("hai scelto cappuccino");
            break;
            case 3: prezzo = 1.00; 
                    System.out.println("hai scelto tè");
            break;
            case 4: prezzo = 0.5; 
                    System.out.println("hai scelto acqua");
            break;
            case 5: flag = false; 
                    System.out.println("arrivederci!");
            break;
           }
           //logica per la simulazione del pagamento delle bevande selezionate
           if(credito>=prezzo){
            credito-=prezzo;
            System.out.println("il tuo credito rimanente è: "+ credito);//stampa del credito rimanente dopo l'acquisto
            //logica per gestire il credito esaurito con possibilità di effettuare un'altra scelta e
            //logica per gestire il credito insufficiente per l'acquisto di prodotti con prezzo maggiore rispetto al credito residuo
           } else if(credito == 0 && flag || credito<prezzo && flag) { 
            System.out.println("Credito insufficiente! Effettua una nuova scelta! [ credito residuo: "+ credito+" ]" );
           }
        }
        
        myScanner.close();
    }
}
