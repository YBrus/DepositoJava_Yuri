public class Persona {
    private String nome;//dichiarazione attributi
    private int eta;

    Persona(String nome, int eta){ //metodo costruttore parametrico
        this.nome = nome;
        this.eta = eta;
    }
    // metodi get e set 
    public String getNome(){
        return nome;
    }
    public void setNome(String newName){
        this.nome = newName;
    }

    public int getEta(){
        return eta;
    }

     public void setEta(int newEta){
        this.eta = newEta;
    }

    // Metodo privato utilizzato dalla classe
    private boolean verificaMaggiorenne() {

        return this.eta >= 18;

    }

    // Metodo pubblico che fa uso del metodo privato
    public void stampaStatus() {

        if (verificaMaggiorenne()) {

            System.out.println(this.nome + " è maggiorenne.");

        } else {

            System.out.println(this.nome + " non è maggiorenne.");

        }
    }
}
