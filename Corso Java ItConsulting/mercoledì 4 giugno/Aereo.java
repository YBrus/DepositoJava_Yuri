public class Aereo {
    private String modello;
    private int numeroPosti;
    private String codice;

    public Aereo(){}

    public Aereo(String modello,int numeroPosti,String codice){
        this.modello = modello;
        this.numeroPosti = numeroPosti;
        this.codice = codice;
    }

    public String getModello(){
        return modello;
    }

    public int getNumeroPosti(){
        return numeroPosti;
    }
    public String getCodice(){
        return codice;
    }

    public void setModello(String newModello){
        this.modello = newModello;
    }
    public void setNumeroPosti(int newNumeroPosti){
        if(newNumeroPosti >0){
            this.numeroPosti = newNumeroPosti;
        }else{
            System.out.println("il numero dei posti deve essere maggiore di zero");
        }
    }
    public void setCodice(String newCodice){
        this.codice = newCodice;
    }
}
