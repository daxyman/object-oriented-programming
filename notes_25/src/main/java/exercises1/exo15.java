public class exo15 {
    public static void main(String args[]){
        int[] tabl = new int[10];
        printTable(filltabl(tabl));
        System.out.println("\nIl y a " + showEvenNumbers(tabl) + " nombres pairs dans ce tableau");
    }
    public static int showEvenNumbers(int[] tabl){
        int evenCount = 0;
        for(int i=0; i<tabl.length; i++){
            if(tabl[i]%2 == 0){
                evenCount += 1;
            }
        }
        return evenCount;
    }
    public static int [] filltabl(int[] table){
        for(int i = 0; i<table.length; i++){
            table[i] = (int)(Math.random()*101);
        }
        return table;
    }
    public static void printTable(int[] table){
        System.out.print('[');
        for (int i=0; i<table.length; i++){
            System.out.print(table[i]);
        if(i == table.length-1){
            break;
        }
        System.out.print(", ");
        }
        System.out.print(']');
    }
}
