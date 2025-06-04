import java.util.ArrayList;
import java.util.Scanner;

public class Studente {
    private String nome;
    private int voto;
    private static int id =0;
    private int newId;
    
    public Studente(String nome, int voto){
        this.nome = nome;
        this.voto = voto;
        id = ++newId;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String newNome){
        this.nome = newNome;
    }
    
    public int getId(){
        return id;
    }
    
    
    public int getVoto(){
        return voto;
    }

    public void setVoto(int newVoto){
        if(newVoto>=1 && newVoto<=10){
            this.voto = newVoto;
        } else{
            System.out.println("Inserisci valore corretto");
        }
    }


    public static void main(String[] args) {
      Studente studente1 = new Studente("Mimmo",10);
      System.out.println("Nome: "+studente1.getNome()+" Voto: "+studente1.getVoto());  
      //studente1.setVoto(11);
      //studente1.setVoto(8);
      //System.out.println("Nome: "+studente1.getNome()+" Voto: "+studente1.getVoto());  

      ArrayList<Studente> studenti = new ArrayList<>();
      studenti.add(studente1);
      studenti.add(new Studente("Pino", 7));

      Scanner scanner = new Scanner(System.in);
      
      System.out.println("ricerca studente:");
      String ricerca = scanner.nextLine();

      for(Studente studente :studenti){
          if(studente.getNome().equalsIgnoreCase(ricerca)){
            System.out.println("Nome: "+studente.getNome()+" Voto: "+studente.getVoto()+" Id: "+studente.getId());
        }
      }

      scanner.close();
    }
}