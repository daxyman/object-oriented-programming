package notes_25.src.main.java.excercises3;

import java.util.ArrayList;
import java.util.Collections;

public class Exo33 {
    
}

class Groupe {

    private String nomCours;
    private ArrayList<Etudiant> etudiants;

    public Groupe(String nomCours, ArrayList<Etudiant> etudiants) {
        this.nomCours = nomCours;
        this.etudiants = etudiants;
    }

    public Etudiant getEtudiant(int index) {
        return etudiants.get(index);
    }

    public int nbEtudiants() {
        return etudiants.size();
    }

    public void afficheResultats() {
        for (int i = 0; i < this.etudiants.size(); i++) {
            this.etudiants.get(i).afficheResultat();
        }
    }

    public void trierParNote() {
        // Collections.sort(this.etudiants, (etudiant1,etudiant2) -> etudiant1.nomComplet.compareTo(etudiant2.nomComplet));

        Collections.sort(this.etudiants, (etudiant1, etudiant2) -> compare(etudiant1, etudiant2));
        // Collections.sort(this.etudiants, (etudiant1,etudiant2) -> -1 * Byte.compare(etudiant1.noteFinale(),etudiant2.noteFinale()));
    }

    public int compare(Etudiant etudiant1, Etudiant etudiant2) {
        int result = -1 * Byte.compare(etudiant1.noteFinale(), etudiant2.noteFinale());
        if (result == 0) {
            result = etudiant1.getNomComplet().compareTo(etudiant2.getNomComplet());
        }
        return result;
    }
}

class Etudiant {

    private int da;
    private String nomComplet;
    private String courriel;
    private Evaluation[] evaluations = {
        new Evaluation("Examen 1", 0.2f),
        new Evaluation("Examen 2", 0.3f),
        new Evaluation("Examen Final", 0.5f),};

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

    public String getCourriel() {
        return courriel;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public Evaluation getEvaluation(int index) {
        return this.evaluations[index];
    }

    public int getNbEvaluation() {
        return this.evaluations.length;
    }

    public Etudiant(int da, String nomComplet) {
        this.da = da;
        this.nomComplet = nomComplet;
    }

    public byte noteFinale() {
        byte note = 0;
        for (int i = 0; i < evaluations.length; i++) {
            note += this.evaluations[i].notePonderee();
        }
        return note;
    }

    public void afficheResultat() {
        String msg = this.da + " " + this.nomComplet + " ".repeat(10 - this.nomComplet.length());
        for (int i = 0; i < this.evaluations.length; i++) {
            String note = String.format("%d", this.evaluations[i].notePonderee());
            msg += note + (note.length() < 2 ? "  " : " ");
        }
        msg += "| " + this.noteFinale();
        System.out.println(msg);

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
