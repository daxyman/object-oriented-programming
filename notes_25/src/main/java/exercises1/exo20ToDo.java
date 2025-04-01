
public class exo20ToDo {

    public static void main(String[] args) {
        //we gotta implement quicksort to a given table in order to arrange it (im copying my code from exo19 bc im lazy)
        int[] tab = new int[(int) (Math.random() * 101)];
        fillTable(tab);
        System.out.println("table before arranging");
        printTable(tab);
        arrangeTable(tab);
        System.out.println("table after arranging");
        printTable(tab);
    }

    public static int[] arrangeTable(int[] tab) {
        //this is where we use quicksort for the tab return
            // Mathematical analysis of quicksort shows that, on average, 
            // the algorithm takes O (n logn) comparisons to sort n items. 
            // In the worst case, it makes O (n^2) comparisons.
            
            
        return tab;
    }

    public static void printTable(int[] tab) {
        System.out.print('[');
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
            if (i == tab.length - 1) {
                break;
            }
            System.out.print(", ");
        }
        System.out.println(']');
    }

    public static int[] fillTable(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) ((Math.random() * 101 - 50) + 50);
        }
        return tab;
    }
}
