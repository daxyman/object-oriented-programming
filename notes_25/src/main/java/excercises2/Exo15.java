import java.util.Scanner;
public class Exo15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Prénom :" + args[0] + " Nom :" + args[1]);
        try {
            System.out.println("Prénom :" + args[0] + " Nom :" + args[1]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Vous deviez mettre votre prénom et nom en argument, mais vous pouvez encore le faire ici : ");
            String prenom = scanner.nextLine();
            String nom = scanner.nextLine();
            System.out.print("Prénom : "+ prenom + " Nom : " + nom);
        }
        scanner.close();
        // here is an example of how the code would work if it read any kind of thing
        // try {
        //     System.out.println("Prénom :" + args[0] + " Nom :" + args[1]);
        // } catch (Exception e) {
        //     System.out.println("error");
        // }
    }
}
