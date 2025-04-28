package exercises1;
public class Exo122 {
    public static void main(String[] args){
        Calculator xbox = new Calculator("xbox", 500, 100, 16);
        xbox.calcTotal();

    }
}

class Calculator{
    String name;
    double price;
    double discount;
    double taxPercentage;
    public Calculator(String name, double price, double discount, double taxPercentage){
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.taxPercentage = taxPercentage;
    }
        //Ajoutez à la classe calculatrice : Ajouter un méthode pour afficher un reçu en prenant en paramètre 
        // le nom de l'item, le prix, le rabais, le taux de taxation.
    
    public void calcTotal(){
        System.out.println(name+" ".repeat(27)+price+'$');
        System.out.println("Discount: "+" ".repeat(20)+"-"+discount+'$');
        System.out.println("Price before taxes: "+" ".repeat(11)+(price-discount)+'$');
        System.out.println("tax("+taxPercentage+"%)"+" ".repeat(22)+((price-discount)*(taxPercentage*0.01))+'$');
        System.out.println("-".repeat(40));
        System.out.println("total: "+" ".repeat(24)+((price-discount)+((price-discount)*(taxPercentage*0.01)))+'$');

        
        //to calculate a percentage you do (val1    (initial price) *   (val2   (percentage to apply)  *0.01));
    }
}