
public class Exo228 {
    public static void main(String[] args){
        Evaluation eval1 = new Evaluation("Mathématiques", 0.4f);
        eval1.noteSur100 = 85;
        eval1.afficherEvaluation();

    }
}
class Evaluation{
    String nom;
    float ponderation;
    byte noteSur100;
    public Evaluation(String nom, float ponderation){
        this.nom = nom;
        this.ponderation = ponderation;
    }

    public static byte notePonderee(float ponderation, byte noteSur100){
        return (byte)(ponderation*noteSur100);
    }

    public void afficherEvaluation(){
        System.out.println("Evaluation: "+ nom);
        System.out.println("Pondération: " + ponderation);
        System.out.println("Note pondérée: " + notePonderee(ponderation, noteSur100));
    }
}
