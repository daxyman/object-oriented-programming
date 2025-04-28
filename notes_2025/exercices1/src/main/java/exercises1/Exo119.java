package exercises1;
public class Exo119 {
    public static void main(String[] args){
        int[] tab = new int[(int)(Math.random()*101)]; 
        fillTable(tab);
        System.out.println("table before arranging");
        printTable(tab);
        arrangeTable(tab);
        System.out.println("table after arranging");
        printTable(tab);
    }
    public static int[] arrangeTable(int[] tab){
        for(int i=0; i<tab.length; i++){
            for(int j=i; j<tab.length; j++){
                if(tab[j]<tab[i]){
                    tab[j] = tab[i]+tab[j];
                    tab[i] = tab[j]-tab[i];
                    tab[j] = tab[j]-tab[i];
                }
            }
        }
        return tab;
    }

    public static void printTable(int[] tab){
        System.out.print('[');
        for(int i=0; i<tab.length; i++){
            System.out.print(tab[i]);
            if(i==tab.length-1){
                break;
            }
            System.out.print(", ");
        }
        System.out.println(']');
    }
    
    public static int[] fillTable(int[] tab){
        for(int i =0; i<tab.length; i++){
            tab[i] = (int)((Math.random()*101-50)+50);
        }
        return tab;
    }
}
