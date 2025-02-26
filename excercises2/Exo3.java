
public class Exo3 {
    
}
class compteBancaire{
    String titulaire;
    double solde;
    public CompteBancaire(String titulaire, double solde){
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public void deposer(double depot){
        this.solde += depot;
    }

    public void retirer(double retrait){
        if(this.solde < retrait){
            System.out.println("Erreur");
            return;
        }
        this.solde -= retrait;
    }

    public void afficherSolde(){
        System.out.println("Solde de : " + this.solde);
    }

    public void afficherInfo(){
        System.out.println(this.titulaire + " : " + this.solde);
    }
}
