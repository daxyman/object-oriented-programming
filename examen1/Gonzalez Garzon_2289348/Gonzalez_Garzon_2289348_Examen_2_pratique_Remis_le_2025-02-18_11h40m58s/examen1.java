//-1 nom en PascalCase
public class examen1{ 
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		int[] tableau = new int[n];
		System.out.println();
		tableau = remplirTableau(tableau);
		afficherTableau(tableau);
		
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
			if(i == tableau.length-1){
				break;
			}
			System.out.print(", ");
		}
		System.out.print(']');
	}
}