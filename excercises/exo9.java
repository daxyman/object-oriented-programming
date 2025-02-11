public class exo9 {
    public static void main(String args[]){
        int[] tab1 = new int[5];
        for(int i = 0; i<tab1.length; i++){
            tab1[i] = (int)(Math.random()*101);
        }
        printTable(tab1);
    }
    public static void printTable(int[] tabl){
        int tablTotal = 0;
        System.out.print('[');
        for(int j=0; j<tabl.length; j++){
            System.out.print(tabl[j]);
            tablTotal += tabl[j]; 
            if(j==tabl.length-1){
                break;
            }
            System.out.print(',');
        } 
        System.out.println(']');
        System.out.print("the sum of the values in the table are: " + tablTotal);

    }
    
}
