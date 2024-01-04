public class Action {
    private String texte;
    private int quantiteIngredient;
    private int tempsEnMinute;
    private Ingredient ingredient;

    public Action(String texte) {
        this.texte = texte;
    }

    public Action(String texte, int tempsEnMinute) {
        this.texte = texte;
        this.tempsEnMinute = tempsEnMinute;
    }

    public Action(String texte, int quantiteIngredient, int tempsEnMinute, Ingredient ingredient) {
        this.texte = texte;
        this.quantiteIngredient = quantiteIngredient;
        this.tempsEnMinute = tempsEnMinute;
        this.ingredient = ingredient;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public int getQuantiteIngredient() {
        return quantiteIngredient;
    }

    public void setQuantiteIngredient(int quantiteIngredient) {
        this.quantiteIngredient = quantiteIngredient;
    }

    public int getTempsEnMinute() {
        return tempsEnMinute;
    }

    public void setTempsEnMinute(int tempsEnMinute) {
        this.tempsEnMinute = tempsEnMinute;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}
