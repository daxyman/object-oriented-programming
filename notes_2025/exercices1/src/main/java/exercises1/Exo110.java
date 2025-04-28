package exercises1;
public class Exo110 {
    public static void main(String args[]){
        int[] tab1 = new int[50];
        for(int i = 0; i<tab1.length; i++){
            tab1[i] = (int)(Math.random()*101);
        }
        printTable(tab1);
    }
    public static void printTable(int[] tabl){
        int tablTotal = 0;
        int tablmax = 0;
        int tablmin = -1;
        System.out.print('[');
        for(int j=0; j<tabl.length; j++){
            System.out.print(tabl[j]);

            tablTotal += tabl[j];

            if(tablmax<=tabl[j]){
                tablmax = tabl[j];
            }
            if(tablmin>=tabl[j] || tablmin == -1){
                tablmin = tabl[j];
            }

            if(j==tabl.length-1){
                break;
            }
            
            System.out.print(',');
        } 
        System.out.println(']');
        System.out.println("the sum of the values in the table are: " + tablTotal);
        System.out.println("the minimal value is: " + tablmin);
        System.out.println("the maximal value is: " + tablmax);

    }
}
