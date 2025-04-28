public class Exo223 {
    public static void main(String[] args){
        CompteBancaire daniel = new CompteBancaire("Daniel", 10);
        System.out.println(daniel.solde);
        System.out.println(daniel.titulaire);
    }
}
class CompteBancaire{
    String titulaire;
    double solde;

    public CompteBancaire(String titulaire, double solde){
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