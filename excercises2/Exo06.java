class Exo06{
    public static void main(String[] args){
        Cercle cercle1 = new Cercle(12);
        cercle1.afficherInfos();
}
class Cercle{
    double rayon;
    public Cercle(double rayon){
        this.rayon = rayon;
    }

    public double calculerAire(){
        double aire = Math.PI * Math.pow(rayon, 2);
        return aire;
    }

    public double calculerPerimetre(){
        double perimetre = 2 * Math.PI * rayon;
        return perimetre;
    }

    public void afficherInfos(){
        System.out.println(calculerAire());
        System.out.println(calculerPerimetre());
    }
}