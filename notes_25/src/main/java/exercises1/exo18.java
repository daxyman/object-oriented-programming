import java.util.InputMismatchException;
import java.util.Scanner;
public class exo18 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //i make a table to store the values we will use for the table
        int[] usrValues = new int[3];
        optionsMenu(scanner, usrValues);

        //usrValues[1] is the length
        int[] tab = new int[usrValues[0]];
        remplirTableau(tab, usrValues);
        afficherTableau(tab);
        countNumbers(tab);
    }

    //i count the numbers's occurrences using a table of the highest number's length
    public static void countNumbers(int[] tab) {
        int[] numbersCount = new int[findHighestNumber(tab)+1];
        for(int i =0; i<tab.length; i++){
            numbersCount[tab[i]] = numbersCount[tab[i]]+1;
        }
        // afficherTableau(numbersCount); this shows the table of the numbers's count
        for(int i=0; i<numbersCount.length; i++){
            if(!(numbersCount[i]==0)){
                System.out.println("number "+i+" appeared: "+numbersCount[i]+" times");
            }
        }
    }


    //I find the highest number in order to be able to make a table containing all numbers, the highest being the table's length
    public static int findHighestNumber(int[] tab){
        int highest = 0;
        for (int i=0; i<tab.length; i++) {
            if(tab[i]>highest){
                highest = tab[i];
            }   
        }
        return highest;
    }

    //fill a table with numbers between 0 and 11
    public static int[] remplirTableau(int[] tab, int[] usrValues){
        for(int i=0; i<tab.length; i++){
            tab[i] = (int)((Math.random()*(usrValues[1]+1-usrValues[2])+usrValues[2]));
        }
        return tab;
    }

    //Show a table
    public static void afficherTableau(int[] tab){
        System.out.print("\n[");
        for(int i=0; i<tab.length; i++){
            System.out.print(tab[i]);
            if(i == tab.length-1){
                break;
            }
            System.out.print(", ");
        }
        System.out.println(']');
    }

    //made a menu in which the user can input the values they want, it stores them in the table usrValues
    public static int[] optionsMenu(Scanner scanner, int[] usrValues){
        System.out.println("Welcome, we are doing a table that counts the amount of times a number appears in it.");
        System.out.println("To begin, I will ask you what length would you like the table to be: ");
        int tabLength = valueForMenu(scanner);
        usrValues[0] = tabLength;
        System.out.println("what is the maximal value you'd like?");
        int tabMaxValue = valueForMenu(scanner);
        usrValues[1] = tabMaxValue;
        System.out.println("what is the minimal value you'd like?");
        int tabMinValue = valueForMenu(scanner);
        usrValues[2] = tabMinValue;
        return usrValues;
    }

    //made a function to verify each value inputed by the user is valid
    public static int valueForMenu(Scanner scanner){
        int value =0;
        boolean success =false; 
        while(!success){
            try {
                value = scanner.nextInt();
                success = true;
                if (value < 0) {
                    throw new IllegalArgumentException(); 
               }  
            } catch(InputMismatchException e){
                System.out.println("Only Positive Numbers & no Letters Please!");
                scanner.next();
            } catch(IllegalArgumentException e){
                System.out.println("Only Positive Numbers & no Letters Please!");
                scanner.next();
            }
        }
        return value;
    }
}
