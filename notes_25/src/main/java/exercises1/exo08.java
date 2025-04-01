public class exo08 {
    public static void main(String args[]){
        int[] tab1 = new int[5];
        for(int i = 0; i<tab1.length; i++){
            tab1[i] = (int)(Math.random()*101);
        }
        printTable(tab1);
    }


    public static void printTable(int[] tabl){
        System.out.print('[');
        for(int j=0; j<tabl.length; j++){
            System.out.print(tabl[j]);
            if(j==tabl.length-1){
                break;
            }
            System.out.print(',');
        } 
        System.out.print(']');
    }
    
}
