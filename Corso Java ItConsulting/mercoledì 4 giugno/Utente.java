import java.util.Random;

public class Utente {
    private String nome;
    private String email;
    private float soldi;

    public Utente(){}

    public Utente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.soldi = generaFondi();
    }

     protected float generaFondi() {
        Random random = new Random();
        return 10 + random.nextFloat() * 90;
    }

  /* 
   public void login(String nome, String email) {
        if(this.nome.equals(nome) && this.email.equals(email)){
            this.soldi = generaFondi();
            System.out.println("Bentornato! Il tuo nuovo credito è: "+ nome+ soldi);
        } else {
            System.out.println("Credenziali errate");
        }
        
    }*/

    public void stampaDati() {
        System.out.println("--- Dati Utente ---");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Soldi: "+ soldi);
    }

    // Metodi getter
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    } 

    public float getSoldi(){
        return soldi;
    }


}
