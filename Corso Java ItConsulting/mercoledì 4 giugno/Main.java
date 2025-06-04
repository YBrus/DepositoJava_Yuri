import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerNum = new Scanner(System.in);
        Aereo a1 = new Aereo("Boeing", 150,"BG001" );
        Aereo a2 = new Aereo("Charter", 50,"CH002" );

        Pilota p1 = new Pilota("Mimmo", "A001", 200);
        Pilota p2 = new Pilota("Pino", "A002", 350);

        CompagniaAerea compagnia = new CompagniaAerea("Emirates");

        compagnia.addAereo(a1);
        compagnia.addAereo(a2);
        compagnia.addPilota(p1);
        compagnia.addPilota(p2);


        compagnia.stampa();
        
       
        boolean flag = true;
        while(flag){
           
            System.out.println("Cosa vuoi cercare?");
            System.out.println("1 = cerca pilota per nome");
            System.out.println("2 = cerca pilota per brevetto");
            System.out.println("3 = cerca pilota per ore di volo");
            System.out.println("4 = cerca aereo per modello");
            System.out.println("5 = cerca aereo per numero di posti");
            System.out.println("6 = cerca aereo per codice");
            System.out.println("7 = esci");
             int scelta = scannerNum.nextInt();
        
            switch(scelta){
            case 1: System.out.println("Inserisci il nome del pilota da cercare:");
                           String nomePilota = scannerStr.nextLine().toLowerCase();
                           System.out.println(compagnia.cercaPilotaPerNome(nomePilota));
            break;
            case 2: System.out.println("Inserisci brevetto pilota da cercare:");
                          String brevetto = scannerStr.nextLine().toLowerCase();
                          System.out.println(compagnia.cercaPilotaPerBrevetto(brevetto));
            break;
            case 3: System.out.println("Inserisci ore di volo del pilota cercare:");
                          int ore = scannerNum.nextInt();
                          System.out.println(compagnia.cercaPilotaPerOreVolo(ore));
            break;
            case 4: System.out.println("Inserisci modello Aereo da cercare:");
                          String modelloAereo = scannerStr.nextLine().toLowerCase();
                          System.out.println(compagnia.cercaAereiPerModello(modelloAereo));
            break;
            case 5: System.out.println("Inserisci numero posti dell Aereo da cercare:");
                          int numeroPosti= scannerNum.nextInt();
                          System.out.println(compagnia.cercaAereiPerNumeroPosti(numeroPosti));
            break;
            case 6: System.out.println("Inserisci codice Aereo da cercare:");
                          String codice = scannerStr.nextLine().toLowerCase();
                          System.out.println(compagnia.cercaAereiPerCodice(codice));
            break;
            case 7: System.out.println("Arrivederci!"); 
                    flag = false;
            break;
            }
            
        }
        

    }
}