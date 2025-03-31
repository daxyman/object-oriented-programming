public class exo24 {
    public static void main(String[] args){
        int[] tab = new int[(int)(Math.random()*101)];
        int position = Integer.parseInt(args[0]);
        fillTable(tab);
        printTable(tab);
        System.out.println(checkElement(position, tab));
    }
    public static boolean checkElement(int position, int[] tab){
        if(position == tab[position-1]){
            return true;
        }else{
            return false;
        }
    }

    public static int[] fillTable(int[] tab){
        for(int i =0; i<tab.length;i++){
            tab[i] = (int)(Math.random()*11);
        }
        return tab;
    }

    public static void printTable(int[] tab) {
        System.out.print('[');
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
            if (i == tab.length - 1) {
                break;
            }
            System.out.print(", ");
        }
        System.out.println(']');
    }
}