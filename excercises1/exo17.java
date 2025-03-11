public class exo17 {

    public static void main(String[] args) {
        char[] tab = new char[(int) (Math.random() * 101)];
        remplirTableau(tab);
        afficherTableau(tab);
        System.out.println("\nla quantité de voyelles est: "+compterVoyelles(tab)+"\n");
    }

    public static int compterVoyelles(char[] tab){
        int count =0;
        for(int i=0; i<tab.length; i++){
            if (tab[i]== 'a' || tab[i]== 'e' || tab[i]== 'i'|| tab[i]== 'o' || tab[i]== 'u'|| tab[i]== 'y'){
                count += 1;
            }
        }
        return count;
    }

    public static char[] remplirTableau(char[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (char) ((int) (Math.random() * (122-97)) + 97);
        }
        return tab;
    }

    public static void afficherTableau(char[] tab) {
        System.out.print("\n[");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
            if (i == tab.length - 1) {
                break;
            }
            System.out.print(", ");
        }
        System.out.print(']');
    }
}
