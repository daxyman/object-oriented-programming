package notes_2025.date_20_02_2025;

public class Etudiant {
    public static void main(String[] args) {
        Etudiant maxi = new Etudiant("Bob", 15);
        Etudiant yassine = new Etudiant("Yassine", 35);
        System.out.println(maxi.nom + " a " + maxi.age);

    }
    String nom = "John Doe";
    int age = 100;

    public Etudiant(String nom, int age){
        this.nom = nom;
        this.age = age;
    }
    public /*static doesnt work idk why */ void afficher(){
        System.out.println("je m'appelle : " + this.nom + "et j'ai " + this.age + "ans");
    }
}