package examen2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Pt2 {

    public static void main(String[] args) {
        Random random = new Random(1);

        Groupe groupe4 = new Groupe(
                "420-210",
                new ArrayList<>(
                        Arrays.asList(
                                new Etudiant(1832491, "Alice"),
                                new Etudiant(2468103, "Bob"),
                                new Etudiant(3726145, "Charlie"),
                                new Etudiant(4859021, "David"),
                                new Etudiant(5983472, "Eve"),
                                new Etudiant(6129048, "Frank"),
                                new Etudiant(7235146, "Grace"),
                                new Etudiant(8376012, "Hannah"),
                                new Etudiant(9453023, "Isaac"),
                                new Etudiant(1023485, "Jack"),
                                new Etudiant(2135749, "Karen"),
                                new Etudiant(3201854, "Louis"),
                                new Etudiant(4337602, "Mona"),
                                new Etudiant(5498321, "Nathan"),
                                new Etudiant(6571984, "Olivia"),
                                new Etudiant(7612493, "Paul"),
                                new Etudiant(8793461, "Quincy"),
                                new Etudiant(9834527, "Rachel"),
                                new Etudiant(1056743, "Sam"),
                                new Etudiant(2187630, "Tina"),
                                new Etudiant(3265984, "Ursula"),
                                new Etudiant(4306715, "Victor"),
                                new Etudiant(5394120, "Wendy"),
                                new Etudiant(6412309, "Xander"),
                                new Etudiant(7523018, "Yara"),
                                new Etudiant(8654092, "Zane"),
                                new Etudiant(9735084, "Amy"),
                                new Etudiant(1087416, "Ben"),
                                new Etudiant(2158367, "Clara"),
                                new Etudiant(3267419, "Daniel")
                        )
                )
        );

        //notes aleatoires
        for (int i = 0; i < groupe4.nbEtudiants(); i++) {
            for (int j = 0; j < groupe4.getEtudiant(i).getNbEvaluation(); j++) {
                groupe4.getEtudiant(i).getEvaluation(j).setNoteSur100((byte) (random.nextInt(71) + 30));
            }
        }

        System.out.println("--- Avant tri ---");
        groupe4.afficheResultats();
        System.out.println();

        groupe4.trierParNote();

        System.out.println("--- Après tri par note finale ---");
        groupe4.afficheResultats();
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

    public int getNbEvaluation() {
        return evaluations.length;
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

class Groupe {

    private String nomCours;
    private ArrayList<Etudiant> etudiants;

    public Groupe(String nomCours, ArrayList<Etudiant> etudiants) {
        this.setNomCours(nomCours);
        this.etudiants = etudiants;
    }

    public void setNomCours(String nomCours) {
        this.nomCours = nomCours;
    }

    public Etudiant getEtudiant(int index) {
        return this.etudiants.get(index);
    }

    public int nbEtudiants() {
        return etudiants.size();
    }

    public void afficheResultats() {
        for (Etudiant e : etudiants) {
            e.afficheResultat();
        }
    }

    public void trierParNote() {
        Collections.sort(etudiants, new Comparator<Etudiant>() {
            public int compare(Etudiant e1, Etudiant e2) {
                int note1 = e1.noteFinale();
                int note2 = e2.noteFinale();
                if (note1 != note2) {
                    return Integer.compare(note2, note1); // décroissant
                } else {
                    return e1.getNomComplet().compareToIgnoreCase(e2.getNomComplet()); // alphabétique
                }
            }
        });
    }
}