public class Exo025ToDo {
    public static void main(String[] args){
        Person daniel = new Person("Daniel", "Repentigny", "12");
        daniel.getPresentation();
    }
}
class Person{
    private String nom;
    private int age;
    private String ville;
    private String dateNaissance;

    public Person(String nom, String ville, String dateNaissance){
        this.setNom(nom);
        this.setVille(ville);
        this.setDateNaissance(dateNaissance);
    }

    public void getPresentation(){
        //Je m'appelle [nom] et j'ai [âge] ans.
        System.out.println("Je m'appelle "+this.getNom(nom)+" et j'ai " +12+ " ans");
    }
    
    private void setNom(String nom){
        this.nom = nom;
    }
    private void setVille(String ville){
        this.ville = ville;
    }
    private void setDateNaissance(String dateNaissance){
        this.dateNaissance = dateNaissance;
    }

    public String getNom(String nom){
        return this.nom;
    }
    public String getVille(String ville){
        return this.ville;
    }
    public String getDateNaissance(String dateNaissance){
        return this.dateNaissance;
    }
}