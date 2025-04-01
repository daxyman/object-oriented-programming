

public class exo11 {
    public static void main(String args[]){
        int[] tab1 = new int[5];
        for(int i = 0; i<tab1.length; i++){
            tab1[i] = (int)(Math.random()*101);
        }
        printTable(tab1);
        System.out.print("Table inversed: ");
        printTable(inverseTable(tab1));
        
    }
    public static int[] inverseTable(int[] tabl){
        for(int i=0; i<tabl.length; i++){
            if(i<tabl.length/2){
                int x = tabl[(tabl.length)-(i+1)];  // x = temp  a = tabl[(tabl.length)-(i+1)]  b = tabl[i]
                tabl[(tabl.length)-(i+1)] = tabl[i];
                tabl[i] = x;
            }
        }
        return tabl;
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
        System.out.println(']');
        System.out.println("table length: " + tabl.length);
    }
}
