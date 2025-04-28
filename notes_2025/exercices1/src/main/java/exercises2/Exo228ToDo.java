public class Exo228ToDo {
    public static void main(String[] args){

    }
}

    class Personne{
    private String nom;
    private int age;
    private String adresse;

    private void setNom(String nom){
        this.nom = nom;
    }
    private void setAge(int age){
        this.age = age;
    }
    private void setAdresse(String adresse){
        this.adresse = adresse;
    }

    public String getNom(){
        return this.nom;
    }

    public int getAge(){
        return this.age;
    }

    public String getAdresse(){
        return this.adresse;
    }

    public Personne(String nom, int age, String adresse){
        this.setNom(nom);
        this.setAge(age);
        this.setAdresse(adresse);
    }
}

public class Etudiant extends Personne{
    private String filiere;
    
}

public class Professeur extends Personne{


}