import java.util.Scanner;
public class exo01{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        menuList();
        int choix = scanner.nextInt();

    }
    public static void menuList(){ 
        System.out.print("-".repeat(80));
        System.out.println("\n Bienvenue au To Do List!, Que desirez vous faire?");
        System.out.println("\n 1. Ajouter un tache");
        System.out.println("\n 2. Marquer une tache comme terminée");
        System.out.println("\n 3. Afficher les taches");
        System.out.println("\n 4. Terminer le programme");
        System.out.print("-".repeat(80));
        System.out.print("entrez votre choix: (1, 2, 3, 4)");
    }
}