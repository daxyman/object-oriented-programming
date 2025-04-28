package exercises1;
public class Exo112 {
    public static void main(String[] args){
        int[] tabl0 = new int[5];
        tabl0 = fillTable(tabl0);
        printTable(tabl0);
        System.out.print("La moyenne des éléments du tableau est : "+average(tabl0));
    }
    public static double average(int[] table){
        int average=0;
        for(int i=0; i<table.length; i++){
            average = average+table[i];
        }
        average = average/table.length;
        return average;
    }

    public static void printTable(int[] table){
        System.out.print('[');
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
        for(int i=0; i<table.length; i++){
            table[i] = (int)(Math.random()*101);
        }
        return table;
    }
}
