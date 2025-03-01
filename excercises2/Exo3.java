public class Exo3 {
    public static void main(String[] args){

    }
}
class CompteBancaire{
    String titulaire;
    double solde;

    public CompteBancaire(){
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public double deposer(double contrib){
        this.solde = contrib + this.solde;
        return this.solde;
    }

    public double retirer(double withdrawl){
        this.solde = this.solde - withdrawl;
        return this.solde;
    }

    public void afficherSolde(){
        System.out.println(this.solde);
    }

    public void afficherInfo(){
        System.out.println(this.solde);
    }
}