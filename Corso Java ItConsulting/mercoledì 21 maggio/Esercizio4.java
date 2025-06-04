import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in);
        Scanner strScan = new Scanner(System.in);

        int prezzoAssicurazione = 500;

        System.out.println("inserisci eta'");
        int eta = numScan.nextInt();
        if(eta < 18){
            System.out.println("non idoneo per l'assicurazione");
            return;

        } 
            System.out.println("Inserisci anni esperienza");
            int anniEsperienza = numScan.nextInt();

            if(anniEsperienza < 2){
                prezzoAssicurazione += prezzoAssicurazione*  0.30;
                System.out.println(prezzoAssicurazione);
            }
            System.out.println("dammi numero incidenti");
            int incidenti = numScan.nextInt();

            if(incidenti == 0){
                System.out.println("no maggiorazione");

            } else if(incidenti == 1){
                prezzoAssicurazione += prezzoAssicurazione * 0.15;
                System.out.println(prezzoAssicurazione);

            } else if(incidenti >= 2 && incidenti < 4){
                prezzoAssicurazione += prezzoAssicurazione * 0.30;
                System.out.println(prezzoAssicurazione);

            } else{
                System.out.println("non idoneo all'assicurazione");
                strScan.close();
                numScan.close();
                return;
            }

            System.out.println("dammi pacchetto assicurativo");
            String tipoAssicurazione = strScan.nextLine();

            switch (tipoAssicurazione) {
                case "base":
                    System.out.println("prezzo assicurazione= "+prezzoAssicurazione);
                    break;
                case "intermedio":
                    prezzoAssicurazione+= prezzoAssicurazione*0.20;
                    System.out.println("prezzo assicurazione= "+prezzoAssicurazione);
                    break;
                case "premium":
                    prezzoAssicurazione+= prezzoAssicurazione*0.5;
                    System.out.println("prezzo assicurazione= "+prezzoAssicurazione);
                    break;
                
            }
        

            numScan.close();
            strScan.close();
        
        
    }
}
