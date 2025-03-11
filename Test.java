import  java.util.InputMismatchException;
import  java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        int value = 0;
        boolean success =false; 
        while(!success){
            try {
                value = scanner.nextInt();
                success = true;
            } catch(InputMismatchException e){
                System.out.println("1");
                scanner.next();
            }
        }
    }
}


