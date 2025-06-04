import java.util.Scanner;

public class EsercizioRistorante {
    public static void main(String[] args) {
        Scanner numScanner = new Scanner(System.in);
        Scanner strScanner = new Scanner(System.in);

        Utente utente = new Utente();
        Ristorante ristorante = new Ristorante();
        boolean flag = true;

        while(flag){
            System.out.println("Benvenuto:");
            System.out.println("1. Crea nuovo utente");
            System.out.println("2. Stampa dati utente");
            System.out.println("3. Aggiungi piatti");
            System.out.println("4. Aggiungi voti");
            System.out.println("5. Stampa piatti e voti");
            System.out.println("6. Esci");
            
            int scelta = numScanner.nextInt();
            switch(scelta){
                case 1 : System.out.println("Creazione Utente");
                         System.out.println("Inserisci nome utente");
                         String nome = strScanner.nextLine();
                         
                         System.out.println("Inserisci email utente");
                         String email = strScanner.nextLine();

                         System.out.println("Seleziona 1 per account Chef, 2 per account Critico");
                         int tipoAccount = numScanner.nextInt();
                         if(tipoAccount == 1){
                           utente = new Chef(nome,email);
                           System.out.println("Benvenuto Chef "+utente.getNome());
                         }else if(tipoAccount ==2){
                           utente = new Critico(nome,email);
                           System.out.println("Benvenuto Critico "+utente.getNome());
                         }                 
                break;
                case 2: System.out.println("Stampa Utente");
                        utente.stampaDati();
                break;
                case 3: if(utente instanceof Chef){
                        System.out.println("Aggiungi piatto");
                        String piatto = strScanner.nextLine();
                        ristorante.aggiungiPiatto(piatto);
                        }else{
                         System.out.println("Non sei uno chef");
                        }                        
                break;
                case 4: if(utente instanceof Critico){
                        System.out.println("Aggiungi voto");
                        int voto = numScanner.nextInt();
                        ristorante.aggiungiVoti(voto);
                        }else{
                         System.out.println("Non sei un critico");       
                        }
                break;
                case 5: System.out.println("Stampa piatto e voto");
                        ristorante.stampaPiatti();
                        ristorante.stampaVoti();
                break;
                case 6: System.out.println("Arrivederci");
                        flag = false;
                break;
                default : System.out.println("Errore");
            }
        }
    }
}
