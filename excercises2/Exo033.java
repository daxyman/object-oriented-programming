/*
 * 
 * Dans une entreprise, il existe deux types de vendeurs : les vendeurs en magasin et les vendeurs en ligne. 
 * Chaque vendeur reçoit un salaire de base, et en plus, il touche une commission en fonction de ses ventes. 
 * Les vendeurs en magasin bénéficient d'une commission calculée en fonction du montant des ventes qu'ils réalisent, 
 * tandis que les vendeurs en ligne bénéficient également d'une commission, mais avec une récompense supplémentaire 
 * basée sur le nombre de clics générés par leurs liens d'affiliation.
 * 
 */

public class Exo033 {

    public static void main(String[] args) {
        Vendeur nathan = new Vendeur("Nathan", 1, 2, 10);
        System.out.println(nathan.toString());
    }
}

/*
 * 
    nom : le nom du vendeur.
    salaireDeBase : le salaire de base du vendeur.
    tauxCommission : le taux de commission que le vendeur touche sur les ventes réalisées.
    ventes : le montant total des ventes réalisées par le vendeur.

 * 
 */
class Vendeur {

    private String nom;
    private double salaireDeBase;
    private double tauxCommission;
    private int ventes;

    public Vendeur(String nom, double salaireDeBase, double tauxCommission, int ventes) {
        setNom(nom);
        setSalaireDeBase(salaireDeBase);
        setTauxCommission(tauxCommission);
        setVentes(ventes);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSalaireDeBase(double salaireDeBase) {
        this.salaireDeBase = salaireDeBase;
    }

    public void setTauxCommission(double tauxCommission) {
        this.tauxCommission = tauxCommission;
    }

    public void setVentes(int ventes) {
        this.ventes = ventes;
    }

    public String getNom() {
        return nom;
    }

    public double getSalaireDeBase() {
        return salaireDeBase;
    }

    public double getTauxCommission() {
        return tauxCommission;
    }

    public int getVentes() {
        return ventes;
    }

    @Override
    public String toString() {
    return String.format("Nom : %s\nSalaire de base : %.2f €\nTotal des commissions : %.2f\nSalaire total : %.2f\n",
        this.nom, this.salaireDeBase, (this.ventes * tauxCommission), (this.ventes * this.tauxCommission + this.salaireDeBase));
}

}

// class VendeurMagasin extends Vendeur {

//     private int nombreClics;
// }
