public class exo13 {
    public static void main(String[] args){
        int[] table = new int[100];
        table = fillTable(table);
        printTable(table);
    }

    public static int[] removeDupes(int[] table){
        for(int i=0; i<table.length; i++){
            for(int j=i; j<table.length; j++){
                
            }
        }
    }
    public static void printTable(int[] table){
        System.out.print('[');
        for(int i=0; i<table.length; i++){
            System.out.print(table[i]);
            if(i == table.length-1){
                break;
            }
            System.out.print(',');
        }
        System.out.print(']');
    }

    public static int[] fillTable(int[] table){
        for (int i=0; i<table.length; i++) {
            table[i] = (int)(Math.random()*101);
        }
        return table;
    }
}
