import java.util.Scanner;
class exo01{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char letter = 'a';
        int number = scanner.nextInt();
        if(number<27){
            for(int i=0; i<number; i++){
            System.out.print((char)(letter+i) + " ");
            }
        }else{
            for(int i=0; i<(number%26); i++){
                System.out.print((char)(letter+i) + " ");
                }
        }
        scanner.close();
        
    }
}