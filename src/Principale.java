import java.util.ArrayList;

public class Principale {
    public static void main(String[] args) {

        Recette crepe = new Recette("crepes");
        crepe.getListeActions().add(new Action("Preparer un saladier"));
        crepe.getListeActions().add(new Action(
                "Verser de la farine",
                200,
                2,
                 new Ingredient("farine", 0.5f)
        ));
        crepe.getListeActions().add(new Action(
                "Ajouter des oeufs",
                4,
                4,
                new Ingredient("oeuf", 0.3f)
        ));
    }
}
