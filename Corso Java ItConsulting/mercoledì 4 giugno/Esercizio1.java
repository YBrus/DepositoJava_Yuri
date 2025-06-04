import java.util.ArrayList;

class Auto {
    String marca;//dichiarazione attributi
    String modello;

    Auto(String marca,String modello){//metodo costruttore parametrico
        this.marca = marca;
        this.modello=modello;
    }
    
}
class Officina {
    ArrayList<Auto> lstAuto = new ArrayList<>();

    public void addAuto(Auto auto) {
        // Controllo se un auto con lo stesso modello esiste già
        for (Auto auto1 : lstAuto) {
            if (auto1.modello.equals(auto.modello)) {
                System.out.println("Impossibile aggiungere l'auto. Un'auto con il modello " + auto.modello + " esiste già");
                return; // Esce dal metodo se il modello è già presente
            }
        }
        // Se nessun'auto con lo stesso modello è stata trovata, aggiunge l'auto
        lstAuto.add(auto);
    }

    //metodo per vedere le auto aggiunte
    public String viewAuto() {
        String result = "";

        if (lstAuto.isEmpty()) {//verifico che la lista non sia vuota
            return "Nessuna auto in officina.";
        }
        for (Auto auto : lstAuto) {
            
            result = result + auto.marca + " " + auto.modello + "\n";
        }
        return result;
    }
}


public class Esercizio1 {
    public static void main(String[] args) {
        Officina officina = new Officina();//istanza dell'oggetto officina
        officina.addAuto(new Auto("BMW","M3"));//utilizzo il metodo addAuto dell'oggetto officina e aggiungo gli oggetti di tipo Auto alla lista
        officina.addAuto(new Auto("Maserati","Ghibli"));

        System.out.println(officina.viewAuto());
    }
    
}

