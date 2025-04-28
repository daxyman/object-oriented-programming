package exercises1;
public class Exo16 {
    public static void main(String args[]){
        boolean bool1 = 44==66;
        boolean bool2 = 44!=66;
        boolean bool3 = 44>66;
        boolean bool4 = 44<66;

        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println(bool3);
        System.out.println(bool4);

        boolean estSante = true;
        boolean estAdorable = false;

        if (estSante && estAdorable) {
            System.out.println("true1");
        } else {
            System.out.println("false1");
        }
        //j'en ai aucune idée comment convertir cela en un operateur ternaire

        if (!estSante && estAdorable) {
            System.out.println("true2");
        } else {
            System.out.println("false2");
        }

        if (estSante || estAdorable) {
            System.out.println("true3");
        } else {
            System.out.println("false3");
        }
    }
    public static void whatToDo(){
        //--------------------------------------------------------------------
        // Afficher le résulat de ces comparaisons sans l'écrire explicitement
        //--------------------------------------------------------------------
        // Enregistre dans une variable si 44 est égal à 66
        // Enregistre dans une varible si 44 n'est pas égal a 66
        // Enregistre dans une varible si 44 est plus grand que 66
        // Enregistre dans une varible si 44 est plus petit ou égal à 66
        //  boolean estSante = true;
        //  boolean estAbordable = false;
        // Affiche true si les variable estSante et estAbordable sont toutes les 2 true, false sinon
        // Affiche true si estSante est fausse et estAbordable est true, false sinon
        // Affiche true si estSante ou estAbordable est true, false sinon

    }
}
