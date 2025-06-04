import java.util.ArrayList;

public class Ristorante {
    private ArrayList<String> piatti = new ArrayList<>();
    private ArrayList<Integer> voti = new ArrayList<>(); 



     public void aggiungiPiatto(String piatto) {
        piatti.add(piatto);
    }

    public void aggiungiVoti(int voto) {
        if(voto>=1 && voto<=10){
            voti.add(voto);
        }else {
            System.out.println("Voto non valido!");
        }
    }

    public void stampaPiatti() {
        for(String piatto : piatti){
            System.out.println("Piatto: " + piatto);
        }
        
    }

    public void stampaVoti() {
        for(int voto : voti){
            System.out.println("Voto: " + voto);
        }
       
    }
}
