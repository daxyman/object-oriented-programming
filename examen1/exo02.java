import java.util.ArrayList;
import java.util.Scanner;
public class exo02{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> doneList = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);

        choiceLoop(scanner, list, doneList);
        System.out.println("Bye!");
        // System.out.println("Bye!");
    }
    public static void menuList(){ 
        System.out.print("-".repeat(80));
        System.out.println("\n Menu :");
        System.out.println("\n 1. Ajouter une tâche");
        System.out.println("\n 2. Marquer une tâche comme terminée");
        System.out.println("\n 3. Afficher les tâches");
        System.out.println("\n 4. Terminer le programme");
        System.out.println("\n nombre de taches:");
        System.out.println("-".repeat(80));
        System.out.print("entrez votre choix: ");
    }
    public static void choiceLoop(Scanner scanner, ArrayList<String> list, ArrayList<String> list2){
        while(true){
            menuList();
            int choix = scanner.nextInt();
        switch(choix){
            case 1:
            System.out.println("Quel sera la tache a ajouter?");
            scanner.nextLine();
            String tache = scanner.nextLine();
            System.out.println("votre tache sera: " + tache);
            list.add(tache);
            System.out.println("-".repeat(80));
            break;
            
            case 2:
            System.out.println("Quel sera la tache a marquer comme termine?");
            scanner.nextLine();
            String tacheTerminee = scanner.nextLine();
            list.remove(tacheTerminee);
            list2.add(tacheTerminee);
            System.out.println("-".repeat(80));
            break;

            case 3:
            System.out.println("Ceci c'est la liste de taches");
            System.out.println("taches a faire:");
            System.out.println(list);
            System.out.println("taches deja faites");
            System.out.println(list2);
            System.out.println("-".repeat(80));
            break;


            case 4:
            return;

            default:
            System.out.println("error");
            System.out.println("-".repeat(80));
            break;
            }
        }
    }
}