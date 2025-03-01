public class Exo4 {
    public static void main(String[] args){
        int[] tab = new int[12];
        Livre mR = new Livre("Maze Runner", "James Dashner", 100, true);
        mR.afficherDetails();
    }
}
class Livre{
    String titre;
    String auteur;
    double prix;
    boolean disponible;

    public Livre(String titre, String auteur, double prix, boolean disponible){
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.disponible = disponible;
    }
    public void afficherDetails(){
        System.out.println(this.titre);
        System.out.println(this.auteur);
        System.out.println(this.prix);
        System.out.println("Disponibilité : " + (this.disponible ? "Disponible" : "Non Disponible"));
    }

    public boolean emprunter() {
        if (this.disponible) {
            this.disponible = false;
            return true;
        }
        return false;
    }

    public boolean retourner(boolean disponible){
        disponible = true;
        return disponible;
    }
}
