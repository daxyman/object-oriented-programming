public class Exo5 {
    public static void main(String[] args){

    }
}

class Etudiant{
    String nom;
    int age;
    double moyenne;

    public Etudiant(){
        this.nom = nom;
        this.age = age;
        this.moyenne = moyenne;
    }

    public boolean estAdmis(){
        if(moyenne>=10){
            return true;
        }else{
            return false;
        }
    }
}
