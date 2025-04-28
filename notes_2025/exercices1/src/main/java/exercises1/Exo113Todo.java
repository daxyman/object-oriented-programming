package exercises1;

public class Exo113Todo {
    public static void main(String[] args){
        int[] table = new int[5];
        table = fillTable(table);
        printTable(table);
        printTable(tableNoDupes(table));

    }

    public static int[] tableNoDupes(int[] table){
        int tabNewLength = 0;
        for(int i=0; i<table.length; i++){
            System.out.println("\nnumber "+(i+1)+ " ");
            for(int j=i+1; j<table.length; j++){
                if(table[j]==table[i]){
                System.out.println("found dupe "+ (tabNewLength+1) + " : " + table[i]);
                tabNewLength += 1;
                break;
                }
            }
        }
        System.out.println("the amount of dupes found is: " + tabNewLength);

        int[] tab2 = new int[table.length-tabNewLength];
        for(int i=0; i<table.length; i++){
            System.out.println("\nnumber "+(i+1)+ " ");
            for(int j=i+1; j<table.length; j++){
                if(table[j]==table[i]){
                break;
                }else{
                    tab2[j] = table[i];
                }
            }
        }
        return tab2;
    }
    public static void printTable(int[] table){
        System.out.print("\n[");
        for(int i=0; i<table.length; i++){
            System.out.print(table[i]);
            if(i == table.length-1){
                break;
            }
            System.out.print(", ");
        }
        System.out.println(']');
    }

    public static int[] fillTable(int[] table){
        for (int i=0; i<table.length; i++) {
            table[i] = (int)(Math.random()*5);
        }
        return table;
    }
}
