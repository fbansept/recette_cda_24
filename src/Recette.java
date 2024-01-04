import java.util.ArrayList;

public class Recette {
    private String nom;
    private ArrayList<Action> listeActions;

    public Recette(String nom) {
        this.nom = nom;
        this.listeActions = new ArrayList<>();
    }

    public float cout() {
        return 0;
    }

    public int tempsTotal() {

        int cumulTemps = 0;

        for(Action action : listeActions){
            cumulTemps += action.getTempsEnMinute();
        }
        return cumulTemps;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Action> getListeActions() {
        return listeActions;
    }

    public void setListeActions(ArrayList<Action> listeActions) {
        this.listeActions = listeActions;
    }
}
