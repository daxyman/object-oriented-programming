package excercises2;
import java.util.ArrayList;
public class Personne {
    String nom;
    int age;

    public Personne(String nom, int age){
        this.nom = nom;
        this.age = age;
    }

    public void afficherInfo(){
        System.out.println("Je m'appelle : " + this.nom + " et j'ai " + this.age + " ans");
    }

    @Override
    public String toString(){
        return this.nom + " : " + this.age;
    }

    public static void main(String[] args){
        ArrayList<Personne> liste = new ArrayList<>();
        liste.add(new Personne( "henry", 8));
        liste.add(new Personne( "Jean", 80));
        liste.add(new Personne( "Camille", 18));

        for(int i=0; i<liste.size(); i++){
            System.out.println(liste.get(i));
        }
    }
}
