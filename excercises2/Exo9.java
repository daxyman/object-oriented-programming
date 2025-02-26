public class Exo9 {
    public static void main(String[] args){
        Etudiant etudiant1 = new Etudiant(2289348, "Daniel Felipe");
        etudiant1.evaluations[0].noteSur100 = 50;
        etudiant1.evaluations[1].noteSur100 = 67;
        etudiant1.evaluations[2].noteSur100 = 100;

        etudiant1.afficherResultat();
    }
}
    class Etudiant{
        int da;
        String nomComplet;
        Evaluation[] evaluations = {
            new Evaluation("Examen 1", 0.2f),
            new Evaluation("Examen 2", 0.3f),
            new Evaluation("Examen Final", 0.5f),
        };

        public Etudiant(int da, String nomComplet){
            this.nomComplet = nomComplet;
            this.da = da;
        }

        public byte noteFinal(){
            byte noteFinal = 0;
            for(int i=0; i<this.evaluations.length ; i++){
                noteFinal += this.evaluations[i].notePonderee();
            }
            return noteFinal;
        }

        public void afficherResultat(){
            System.out.print(this.da + " " + this.nomComplet + " ");
            for(int i=0; i<this.evaluations.length; i++){
                System.out.print(this.evaluations[i].notePonderee() + ' ');
            }
            System.out.println("| " + this.noteFinal());
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
    
        public byte notePonderee(/*float ponderation, byte noteSur100 why do i not need to add it?*/){
            return (byte)(ponderation*noteSur100);
        }
    
        public void afficherEvaluation(){
            System.out.println("Evaluation: "+ nom);
            System.out.println("Pondération: " + ponderation);
            System.out.println("Note pondérée: " + notePonderee(/*ponderation, noteSur100*/));
        }
    }

