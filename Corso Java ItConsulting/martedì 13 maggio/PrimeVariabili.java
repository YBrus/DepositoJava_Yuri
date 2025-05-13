public class PrimeVariabili {
    public static void main(String[] args) {

        // dichiarazione e inizializzazione di tre variabili di tipo int,String e booelan
        int provaNumero = 10;
        String provaTesto = "Hello World";
        boolean provaBool = true;

        System.out.println(provaNumero);
        System.out.println(provaTesto);
        System.out.println(provaBool);

        //dichiarazione variabile boolean
        boolean provBool;
        //inizializzazione variabile boolean
        provBool =true;
        provBool = false;

        //dichairazione e assegnazione costante, la costante è immutabile
        final int provaCostante = 15;
        System.out.println(provaCostante);
        
        String testo = "Mondo";
        //stampa la concatenazione della string ciao e la variabile stringa testo
        System.out.println("Ciao "+testo);

        String firstPart = "Ciao ";
        String lastPart = "Mondo";
        //dichiarazione stringa risultante della somma(concatenazione) del valore delle variabili firstpart e lastpart
        String fullPart = firstPart+lastPart;
        System.out.println(fullPart);

        /* 
        commento questa dichiarazione per evitare errore di nomi variabili duplicate
        dichiarazione referr

         int x=5;,y=6 ,z=50;
         System.out.println(x+y+z);
        */

        //dichiarazione a cascata (la più ottimale)
        int x, y, z;
        x = y = z = 50;
        System.out.println(x + y + z);


        //dichiarazione e assegnazione di una variabile double
        double myDouble = 19.99d;
        System.out.println(myDouble);

       

    }
}
