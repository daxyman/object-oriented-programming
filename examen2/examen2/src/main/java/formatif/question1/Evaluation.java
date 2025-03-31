package formatif.question1;

class Evaluation {

    private String nom;
    private float ponderation;
    private byte noteSur100 = 0;

    public Evaluation(String nom, float ponderation) {
        this.nom = nom;
        this.ponderation = ponderation;
    }

    public byte notePonderee() {
        return (byte) (this.ponderation * this.noteSur100);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPonderation() {
        return ponderation;
    }

    public void setPonderation(float ponderation) {
        this.ponderation = ponderation;
    }

    public byte getNoteSur100() {
        return noteSur100;
    }

    public void setNoteSur100(byte noteSur100) {
        this.noteSur100 = noteSur100;
    }
}

class Etudiant{
    int da;
    String nomComplet;
    Evaluation[] evaluation = {
        new Evaluation("Examen1", 0.2f),
        new Evaluation("Examen2", 0.3f),
        new Evaluation("ExamenFinal", 0.5f)
    };
    public Etudiant(int da, String nomComplet){
        this.setDa(da);
        this.setNomComplet(nomComplet);
    }

    public Evaluation getEvaluation(int index){
        try{
            return evaluation[index];
        }catch(IndexOutOfBoundsException e){
            System.out.println("entrée pas valide");
            return null;
        }
    }

    public int getNbEvaluations(){
        return evaluation.length;
    }

    public byte noteFinale(Evaluation[] evaluation){
        byte noteFinale = 0;
        for(int i=0; i<evaluation.length; i++){
            noteFinale += evaluation[i].notePonderee();
        }
        return noteFinale;
    }


    public int getDa(){
        return da;
    }

    public String getNomComplet(){
        return nomComplet;
    }

    public void setDa(int da){
        this.da = da;
    }

    public void setNomComplet(String nomComplet){
        this.nomComplet = nomComplet;
    }
}
