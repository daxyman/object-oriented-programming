package notes_2025.date_03_20_2025;

public class Heritage {
    public static void main(String[] args) {
        Vehicule vehicule = new Vehicule();
        Voiture voiture = new Voiture();
        
        vehicule.afficherInfo();

        voiture.afficherInfoVoiture();
    }
}
class Vehicule {
    private String marque = "Default";
    private int annee = 0;

    public void setMarque(String marque){
        this.marque = marque;
    }

    public String getMarque(){
        return this.marque;
    }

    public void setAnnee(int annee){
        this.annee = annee;
    }

    public int getAnnee(){
        return this.annee;
    }

    public void afficherInfo() {
        System.out.println("Marque: " + marque + ", Année: " + annee);
    }
}

class Voiture extends Vehicule {
    private int nombreDePortes = 4;

    public void setNombreDePortes(int nombreDePortes){
        this.nombreDePortes = nombreDePortes;
    }

    public int getNombreDePortes(){
        return this.nombreDePortes;
    }


    public void afficherInfoVoiture() {
        afficherInfo(); // Appel de la méthode de la superclasse
        System.out.println("Nombre de portes: " + nombreDePortes);
    }
}

