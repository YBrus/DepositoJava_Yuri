public class Chef extends Utente {
    private int inserimenti = 0;
    private Ristorante ristorante;
    private boolean isCapo = false;

    public Chef(String nome, String email) {
        super(nome, email);
    }
    public void aggiungiPiatto(String piatto) {
        ristorante.aggiungiPiatto(piatto);
        inserimenti++;
        verificaPromozione();
    }
     private void verificaPromozione() {
        if (inserimenti >= 3) {
           isCapo = true;
        }
    }

    @Override
    public void stampaDati(){
        super.stampaDati();
        if(isCapo){
            System.out.println("Chef Capo");
        }
    };
}
