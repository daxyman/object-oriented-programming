public class notes{
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Erreur, pas de nom");
        } else {
            System.out.println("bonjour " + args[0] + " " + args[1]);
        }
    }
}
