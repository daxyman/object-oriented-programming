import java.util.ArrayList;

public class Exo10 {
    public static void main(String[] args){

    }
}
class Groupe{
    String nomCours;
    ArrayList<Etudiant> etudiant = {
        new Etudiant(2289348, "Daniel Felipe", "d@mail.com")
    };
}
class Etudiant{
    int da;
    String nomComplet;
    String courriel;
    Evaluation[] evaluation = {
        new Evaluation("Math", 1f)
    };

    public Etudiant(int da, String nomComplet, String courriel){
        this.da = da;
        this.nomComplet = nomComplet;
        this.courriel = courriel;
    }
}
class Evaluation{
    String nom;
    float ponderation;
    byte noteSur100;
    public Evaluation(String nom, float ponderation){
        this.nom = nom;
        this.ponderation = ponderation;
    }
    public int NotePonderee(byte noteSur100, float ponderation){
        return (byte)(this.noteSur100*this.ponderation);
    }
    public void AfficherEvaluation(){
        System.out.print("Evaluation: " + this.nom);
        System.out.print("Pondération: " + this.ponderation);
        System.out.print("Note pondérée: " + NotePonderee(noteSur100, ponderation));
    }
}