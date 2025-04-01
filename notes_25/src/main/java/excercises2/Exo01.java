import java.util.ArrayList;
public class Exo01 {
    public static void main(String[] args){

    ArrayList<Personne> personne = new ArrayList<>();

    personne.add(new Personne("Daniel", 21));
    personne.add(new Personne("John", 12));
    personne.add(new Personne("Yassine", 8));

        for(int i=0; i<personne.size(); i++){
            System.out.println("\nnom : " + (personne.get(i)).nom + ", age : " + (personne.get(i)).age);
        }
    }  
}

class Personne{
    String nom;
    int age;

    public Personne(String nom, int age){
        this.nom = nom;
        this.age = age;
    }
}
