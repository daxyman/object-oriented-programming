import java.util.ArrayList;
import java.util.Scanner;
public class exo50 {
public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> chiffres = new ArrayList<Integer>();
    chiffres.add(1);
    chiffres.add(2);
    chiffres.add(3);
    chiffres.add(4);
    chiffres.add(5);
    while(true){
    System.out.print("Liste avant: \n");
    System.out.println(chiffres);
    System.out.println("quel numero desirez vous effacer?");
    int numtoDelete = scanner.nextInt();

    for(int i=0; i<chiffres.size();i++){
        if(numtoDelete==i){
            System.out.println("chiffres");
        }else{
            break;
        }
    System.out.println(chiffres);
    }
}
}
}
