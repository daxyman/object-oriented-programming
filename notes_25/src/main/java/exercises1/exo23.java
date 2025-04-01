import java.util.Scanner;
public class exo23 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        String word = scanner.nextLine();
        checkPalindrome(word);
        scanner.close();
    }

    public static void checkPalindrome(String word){
        char[] palindrome = new char[word.length()];

        for(int i =0; i<word.length(); i++){
            palindrome[i] = word.charAt(i);
        }

        boolean isAPalindrome = true;
        for(int i =0; i<palindrome.length; i++){
            if (palindrome[i] == palindrome[palindrome.length-i-1]){
                isAPalindrome = true;                
            }else{
                isAPalindrome = false;
                break;
            }
        }
        if(isAPalindrome){
            System.out.println("your word is a palindrome");
        }else{
            System.out.println("your word is not a palindrome");
        }
    }
    
}
