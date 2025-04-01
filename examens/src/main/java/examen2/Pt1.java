package examen2;
public class Pt1 {

    public static void main(String[] args) {
        // Créer un étudiant 
        Etudiant etudiant = new Etudiant(1234567, "Jean Dupont");

        // Définir les notes obtenues pour chaque examen 
        etudiant.getEvaluation(0).setNoteSur100((byte) 80);  // Examen 1 

        etudiant.getEvaluation(1).setNoteSur100((byte) 90);  // Examen 2 

        etudiant.getEvaluation(2).setNoteSur100((byte) 75);  // Examen Final 

        // Afficher les résultats 
        etudiant.afficheResultat();
    }
}

class Evaluation {

    private String nom;
    private float ponderation;
    private byte noteSur100 = 0;

    public Evaluation(String nom, float ponderation) {
        this.nom = nom;
        this.ponderation = ponderation;
    }

    public byte notePonderee() {
        return (byte) (this.ponderation * this.noteSur100);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPonderation() {
        return ponderation;
    }

    public void setPonderation(float ponderation) {
        this.ponderation = ponderation;
    }

    public byte getNoteSur100() {
        return noteSur100;
    }

    public void setNoteSur100(byte noteSur100) {
        this.noteSur100 = noteSur100;
    }
}

class Etudiant {

    private int da;
    private String nomComplet;
    private Evaluation[] evaluations = new Evaluation[]{
        new Evaluation("e1", 0.2f),
        new Evaluation("e2", 0.3f),
        new Evaluation("e3", 0.5f)
    };

    public Etudiant(int da, String nomComplet) {
        this.setDa(da);
        this.setNomComplet(nomComplet);
    }

    public int getDa() {
        return da;
    }

    public void setDa(int da) {
        this.da = da;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public Evaluation getEvaluation(int index) {
        return evaluations[index];
    }
    
    public byte noteFinale() {
        int total = 0;
        for (Evaluation i : evaluations) {
            total += i.notePonderee();
        }
        return (byte) total;
    }

    public void afficheResultat() {
        System.out.printf("%d %-12s", da, nomComplet);
        for (Evaluation i : evaluations) {
            System.out.printf(" %2d", i.notePonderee());
        }
        System.out.printf(" | %d\n", noteFinale());
    }
}
