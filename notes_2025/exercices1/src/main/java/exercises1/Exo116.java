package exercises1;
public class Exo116 {

    public static void main(String[] args) {
        boolean maybe = true;
        int number = 0;
        while (maybe) { 
            number += 1;
        int[] tab1 = new int[(int)(Math.random()*11)+1];
        int[] tab2 = new int[(int)(Math.random()*11)+1];
        remplirTableau(tab1);
        remplirTableau(tab2);
        System.out.println("tableau 1:");
        afficherTableau(tab1);
        System.out.println("\ntableau 2: ");
        afficherTableau(tab2);
        maybe = compareTwoTables(tab1, tab2);
        }
        System.out.println("it took: " + number+ " of tables");
    }

    public static boolean compareTwoTables(int[] tab1, int[] tab2){
            String table1= "";
        for(int i=0; i<tab1.length; i++){
            table1 = table1+tab1[i]+", "; 
        }
        System.out.print("\n\ntable1 Contents: "+table1+" \n");

        String table2= "";
        for(int i=0; i<tab2.length; i++){
            table2 = table2+tab2[i]+", ";
        }
        System.out.println("table2: Contents"+table2+" \n");

        if(table1.equals(table2)){
            System.out.println("\nfound it");
            return false;
        }else{
            return true;
        } 
    }

    public static int[] remplirTableau( int[] tab1) {
        for(int i=0; i<tab1.length; i++){
            tab1[i] = (int)(Math.random()*11)+1;
        }
        return tab1;
    }
    public static void afficherTableau (int[] tab1){
        System.out.print('[');
        for(int i=0; i<tab1.length; i++){
            System.out.print(tab1[i]);
            if(i == tab1.length-1){
                break;
            }
            System.out.print(", ");
        }
        System.out.print(']');
    }
}
