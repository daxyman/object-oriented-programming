public class Exo212 {
    public static void main(String[] args) {
        Coordonne test = new Coordonne(3, 7);
        if (test.y == 7 && test.x == 3) {
            System.out.println("Réussi passe à l'exo suivant");
        } else {
            System.out.println("Meilleure chance la prochaine fois");
        }
    }
}

class Coordonne {

    int x;
    int y;

    public Coordonne(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
