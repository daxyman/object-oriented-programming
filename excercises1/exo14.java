public class exo14 {
    public static void main(String[] args){
        int[] tab1 = new int[3];
        int[] tab2 = new int[3];
        int[] tab3 = new int[tab1.length+tab2.length];
        fillTable(tab1);
        fillTable(tab2);
        mergeTables(tab1, tab2, tab3);
        System.out.println("\ntableau 1: ");
        printTable(tab1);
        System.out.println("\ntableau 2: ");
        printTable(tab2);
        System.out.println("\ntableau fusionné: ");
        printTable(tab3);

    }
    public static int[] mergeTables(int[] tab1,int[] tab2, int[] tab3){
        for(int i=0; i<tab3.length; i++){
            tab3[i]=tab1[i];
            if(i == tab1.length-1){
                // for(int j=i; j<tab3.length; j++){
                //     tab3[i] = tab2[j-tab1.length];
                //     if(j == tab2.length){
                //         break;
                //     }
                // }
                break;
            }
        }
        return tab3;
    }
    public static int[] fillTable(int[] tab){
        for(int i=0; i<tab.length; i++){
            tab[i] = (int)(Math.random()*11);
        }
        return tab;
    }
    public static void printTable(int[] tab){
        System.out.print('[');
        for(int i=0; i<tab.length; i++){
            System.out.print(tab[i]);
            if(i == tab.length-1){
                break;
            }
            System.out.print(", ");
        }
        System.out.println("] \n");
    }
}
