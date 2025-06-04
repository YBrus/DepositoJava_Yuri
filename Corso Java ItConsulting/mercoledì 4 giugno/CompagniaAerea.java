import java.util.ArrayList;

public class CompagniaAerea {
    private String nome;
    private ArrayList<Aereo> flotta = new ArrayList<>();
    private ArrayList<Pilota> piloti = new ArrayList<>();


    public CompagniaAerea(String nome){
        this.nome = nome;
    }

    public void addAereo(Aereo aereo){
        flotta.add(aereo);
    }

    public void addPilota(Pilota pilota){
        piloti.add(pilota);
    }

    public void stampa() {
        System.out.println("Compagnia Aerea: " + nome);
        System.out.println("Flotta:");
        if (flotta.isEmpty()) {
            System.out.println("Nessun aereo nella flotta.");
        } else {
            for (Aereo aereo : flotta) {
                System.out.println("- " + aereo.getModello()+ " "+ aereo.getNumeroPosti()+ " "+aereo.getCodice());
            }
        }

        System.out.println("Elenco Piloti:");
        if (piloti.isEmpty()) {
            System.out.println("Nessun pilota nella compagnia.");
        } else {
            for (Pilota pilota : piloti) {
                System.out.println("- " + pilota.getNome()+" "+pilota.getNumeroBrevetto()+" "+pilota.getOreVolo());
            }
        }
       
    }

    public String cercaPilotaPerNome(String nome) {
        Pilota pilotaTrovato = new Pilota();
        for (Pilota pilota : piloti) {
            if (pilota.getNome().equalsIgnoreCase(nome)) {
                pilotaTrovato = pilota;
            }
        }
        return pilotaTrovato.getNome() +" "+ pilotaTrovato.getNumeroBrevetto()+" "+ pilotaTrovato.getOreVolo();
    }
    public String cercaPilotaPerBrevetto(String brevetto) {
        Pilota pilotaTrovato = new Pilota();
        for (Pilota pilota : piloti) {
            if (pilota.getNumeroBrevetto().equalsIgnoreCase(brevetto)) {
                pilotaTrovato = pilota;
            }
        }
        return pilotaTrovato.getNome() +" "+ pilotaTrovato.getNumeroBrevetto()+" "+ pilotaTrovato.getOreVolo();
    }

    public String cercaPilotaPerOreVolo(int ore) {
        Pilota pilotaTrovato = new Pilota();
        for (Pilota pilota : piloti) {
            if (pilota.getOreVolo() == ore) {
                pilotaTrovato = pilota;
            }
        }
        return pilotaTrovato.getNome() +" "+ pilotaTrovato.getNumeroBrevetto()+" "+ pilotaTrovato.getOreVolo();
    }



    public String cercaAereiPerModello(String modello) {
        Aereo aereoTrovato = new Aereo();
        for (Aereo aereo : flotta) {
            if (aereo.getModello().equalsIgnoreCase(modello)) {
               aereoTrovato = aereo;
            }
        }
        return aereoTrovato.getModello()+" "+aereoTrovato.getNumeroPosti()+" "+aereoTrovato.getCodice();
    }

     public String cercaAereiPerCodice(String codice) {
        Aereo aereoTrovato = new Aereo();
        for (Aereo aereo : flotta) {
            if (aereo.getCodice().equalsIgnoreCase(codice)) {
               aereoTrovato = aereo;
            }
        }
        return aereoTrovato.getModello()+" "+aereoTrovato.getNumeroPosti()+" "+aereoTrovato.getCodice();
    }

    public String cercaAereiPerNumeroPosti(int numeroPosti) {
        Aereo aereoTrovato = new Aereo();
        for (Aereo aereo : flotta) {
            if (aereo.getNumeroPosti()==numeroPosti) {
               aereoTrovato = aereo;
            }
        }
        return aereoTrovato.getModello()+" "+aereoTrovato.getNumeroPosti()+" "+aereoTrovato.getCodice();
    }


}
