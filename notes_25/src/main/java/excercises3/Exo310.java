package notes_25.src.main.java.excercises3;

public class Exo310 {

}

interface Personne {

    abstract void afficherInfo();
}

interface Etudiant extends Personne {

    abstract boolean presence();

    default void showImplementation();
}

interface Employer extends Personne {

    abstract void paie();

    default void showImplementation();
}

class Prof implements Employer {

    String nom;
    int banque;

    public void paie() {

    }

    public void afficheInfo() {

    }

}

class Tuteur implements Employer, Etudiant {

    String nom;
    int banque;

    public void afficheInfo() {

    }

    public void paie() {

    }

    public boolean presence() {
        return true;
    }

    public void showImplementation() {

    }
}

class EtudiantInformatique implements Etudiant {

    String nom;

    public boolean presence() {
        return true;
    }

    public void showImplementation() {

    }
}







