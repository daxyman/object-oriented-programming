
public class Exo2 {
    public static void main(String[] args){
        Examen examen1 = new Examen("maxime",(byte) 34);
        examen1.afficherResultat();
    }
}

class Examen{
    String nomEtudiant;
    byte note;

    public Examen(String nomEtudiant, byte note){
        this.nomEtudiant = nomEtudiant;
        this.note = note;
    }
    public void afficherResultat(){
        System.out.println(this.nomEtudiant + " : " + this.note);
    }
    public char convertNote(){
        char lettre = 'N';
        
        if (this.note < 0 || this.note > 100) {
            System.out.println("Note must be between 0 and 100.");
          }
          
          if (this.note > 90) {
            lettre = 'A';
          } else if (this.note > 80) {
            lettre = 'B';
          } else if (this.note > 70) {
            lettre = 'C';
          } else if (this.note > 60) {
            lettre = 'D';
          } else {
            lettre = 'E';
          }
        return lettre;
    }
}
