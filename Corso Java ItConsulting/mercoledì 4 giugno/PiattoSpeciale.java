import java.util.ArrayList;

public class PiattoSpeciale {
    private final String[] ingredientiStandard = {"pane normale","pane di sesamo","pane integrale"};
    

    public ArrayList<String> ingredientiDaInput = new ArrayList<>(); 
    public double prezzo;
    public final double prezzoFisso = 1.00;


    public String[] getIngredientiStandard(){
        return ingredientiStandard;
    }

}
