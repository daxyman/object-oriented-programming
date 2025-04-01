// -1 PascalCase le nom
public class examen3{ 
	public static void main(String[] args){
		int[] tableau = new int[10];
		//Pas besoin de return qqch un tableau est toujours une variable de référence
		tableau = remplirTableau(tableau);
		afficherTableau(tableau);
		System.out.println();
		tableau = trierTableau(tableau);
		afficherTableau(tableau);
		
	}
	public static int[] trierTableau(int[] tableau){
		for(int i=0; i<tableau.length; i++){
			for(int j=i; j<tableau.length; j++){
				if(tableau[i]>tableau[j]){
					int temp = tableau[j];
					tableau[j] = tableau[i];
					tableau[i] = temp;
				}
			}
		}
		return tableau;
	}
	
	public static int[] remplirTableau(int[] tableau){
		for(int i=0; i<tableau.length; i++){
			tableau[i] = (int)(Math.random()*101);
		}
		return tableau;
	}
	
	public static void afficherTableau(int[] tableau){
		System.out.print('[');
		for(int i=0; i<tableau.length; i++){
			System.out.print(tableau[i]);
			if(i==tableau.length-1){
				break;
			}
			System.out.print(", ");
		}
		System.out.print(']');
	}
}