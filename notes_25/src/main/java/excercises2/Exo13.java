public class Exo13 {
    public static void main(String[]args){
        Coordonne test1 = new Coordonne(1,2);
    }
}
class Coordonne{
    int x;
    int y;
    public Coordonne(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Case{
    Coordonne coord;
    int value =0;
    Boolean[] valeurPossibles = {true,true,true,true,true,true,true,true,true};
    public Case(){
        this.coord = coord;
    }
    Boolean setValue(int val){
        if(!(val == 0)){
            for(int i=0; i<valeurPossibles.length; i++){
                valeurPossibles[i] = false;
            }
            return true;
        }else{
            return false;
        }
    }

    Boolean isLastPossible(int val){

    }
}
