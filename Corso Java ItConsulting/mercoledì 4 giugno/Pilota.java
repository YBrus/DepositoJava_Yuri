public class Pilota {
    private String nome;
    private String numeroBrevetto;
    private int oreVolo;

    public Pilota(){}
    
    public Pilota(String nome, String numeroBrevetto,int oreVolo){
        this.nome = nome;
        this.numeroBrevetto = numeroBrevetto;
        this.oreVolo = oreVolo;
    }

    public String getNome(){
        return nome;
    }
    public String getNumeroBrevetto(){
        return numeroBrevetto;
    }
    public int getOreVolo(){
        return oreVolo;
    }


    public void setNome(String newNome){
        this.nome = newNome;
    }

    public void setNumeroBrevetto(String newNumeroBrevetto){
        this.numeroBrevetto = newNumeroBrevetto;
    }

    public void setOreVolo(int newOreVolo){
        if(newOreVolo>0){
            this.oreVolo = newOreVolo;
        }else {
            System.out.println("le ore di volo devono essere maggiori di zero");
        }
    }

  
}



