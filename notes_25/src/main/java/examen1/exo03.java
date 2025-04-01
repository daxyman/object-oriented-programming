public class exo03 {
    public static void main(String[] args){
        int[] table0 = new int[10];
        table0 = fillTable(table0);
        printTable(table0);
        printTable(arrangeTable(table0));
    }

    public static int[] arrangeTable(int[] table1){
        //temp = a
        //a = b
        //b = temp
        for(int i=0; i<table1.length; i++){
            for(int j = i+1; j <table1.length; j++){
                if(table1[j] < table1[i]){
                int min = table1[j];
                table1[j] = table1[i];
                table1[i] = min;
                }
            }
        }
        return table1;
    }

    public static int[] fillTable(int[] table0){
        for(int i=0; i<table0.length; i++){
            table0[i] = (int)(Math.random()*101);
        }
        return table0;
    }

    public static void printTable(int[] table){
        System.out.println();
        System.out.print('[');
        for(int i=0; i<table.length; i++){
            System.out.print(table[i]);
            if(i==table.length-1){
                break;
            }
            System.out.print(", ");
        }
        System.out.print(']');
        System.out.print('\n');
    }
}
