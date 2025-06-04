public class Critico extends Utente {
    private int recensioni =0;
    private Ristorante ristorante;
    private boolean isForte;

    public Critico(String nome, String email) {
        super(nome, email);
       
    }
    public void aggiungiValutazione(int voto) {
        ristorante.aggiungiVoti(voto);
        recensioni++;
        verificaPromozione();
    }
    private void verificaPromozione() {
        if (recensioni >= 3) {
           isForte = true;
        }
    }
    @Override
    public void stampaDati(){
        super.stampaDati();
        if(isForte){
            System.out.println("CriticOne");
        }
    };
}
