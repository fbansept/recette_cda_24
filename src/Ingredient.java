public class Ingredient {
    private String nom;
    private float prix;

    public Ingredient(String nom) {
        this.nom = nom;
    }

    public Ingredient(String nom, float prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
}
