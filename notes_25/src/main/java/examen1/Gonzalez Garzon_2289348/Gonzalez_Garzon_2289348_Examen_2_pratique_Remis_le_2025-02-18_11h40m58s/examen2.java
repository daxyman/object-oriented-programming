import java.util.ArrayList; 
import java.util.Scanner;

// Général      4/6 indentation, nomClasse, moyenne doit être un int
// Menu         6/6
// c1           5/6 Affichage assez différent
// c2           2/6
// c3           0/6

public class examen2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> notes = new ArrayList<>();
		ArrayList<String> noms = new ArrayList<>();
		
		while(true){
			
		System.out.println("\n Menu:");
		System.out.println("1. Ajouter le résultat d’un étudiant");
		System.out.println("2. Afficher la liste des résultats");
		System.out.println("3. Terminer le programme");
		System.out.println("---------------------------------------------------");
		System.out.println("Moyenne du groupe : " + moyenneGroup(notes));
		System.out.println("---------------------------------------------------");
		System.out.print("Entrez votre choix : ");
		
		int choice = scanner.nextInt();
		switch(choice){
			case 1:
			System.out.print("Entrez le nom complet de l'étudiant : ");
			String name = scanner.nextLine();
			scanner.nextLine();
			noms.add(name);
			System.out.print("\n Entrez la note de cet étudiant : ");
			int note = scanner.nextInt();
			notes.add(note);
			System.out.print("Résultat pour Maxime Fournier : "+ note +" ajouté");
			continue;
			case 2:
			System.out.print(notes);
			
		}
		}
	}
	
	public static double moyenneGroup(ArrayList<Integer> notes){
			double moyenne = 0;
			for(int i=0; i<notes.size(); i++){
				moyenne = moyenne+notes.get(i);
			}
			moyenne = moyenne/notes.size();
			return moyenne;
	}
}