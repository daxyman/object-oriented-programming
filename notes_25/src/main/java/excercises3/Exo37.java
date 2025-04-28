package notes_25.src.main.java.excercises3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Exo37 {
    public class Exo7 {
    static final int NUM_FOOD = 100;
    static final int NUM_PLAYER = 4;
    static final int NUM_BOSS = 4;
    static final int OBJECT_WIDTH = 15;
    static final int NB_OBJ_PER_LINE = 10;
    public static void main(String[] args) throws InterruptedException {
        
        Random rand = new Random(213);
        ArrayList<Objet> game = new ArrayList<>(1000);
        for(int i = 0; i < NUM_FOOD; i++){
            game.add(new Food(rand.nextInt(1000) + 1));
        }
        for(int i = NUM_FOOD; i < NUM_FOOD + NUM_PLAYER; i++){
            game.add(new Player(rand.nextInt(10000) + 1001, String.valueOf(i - NUM_FOOD)));
        }
        for(int i = NUM_FOOD + NUM_PLAYER; i < NUM_FOOD + NUM_PLAYER + NUM_BOSS; i++){
            game.add(new Boss(rand.nextInt(10000) + 10001));
        }

        Collections.shuffle(game,rand);

        
        afficheListe(game);

        

        Thread.sleep(1000);

        while(game.size() > 0){
            if(turn(game, rand)){
                break;
            }
           
        }

    }

    static void afficheListe( ArrayList<Objet> game){
        System.out.print("\033[H\033[2J"); 
        int index = 0;

        for(Objet obj : game){
            if(index % NB_OBJ_PER_LINE == 0){
                System.out.println();
            }
            System.out.printf("%-" + OBJECT_WIDTH + "s", obj);
            index++;
        }
        if(game.size() == 1){
            System.out.println();
            return;
        }
        //Moving the cursor back to the beginning of the game
    
        System.out.print("\033[" + (game.size() / NB_OBJ_PER_LINE - (game.size() % NB_OBJ_PER_LINE == 0 ? 1 : 0)) + "A"); // Moves cursor up one line)
        
        System.out.print("\r"); // Place it at the beginning
    }
    static boolean turn(ArrayList<Objet> game, Random rand) throws InterruptedException{
        

        int nbRemoved = 0;

        
        boolean hasActed = false;

        int total = game.size();
        for(int i = 0; i + nbRemoved < total - 1; i++){
            if((i + nbRemoved) % NB_OBJ_PER_LINE == 0 && i != 0 ){
                System.out.print("\033[B\r"); // Moves cursor down one line
            }
            game.get(i).action(game.get(i+1));
            if(game.get(i).getXp() == 0){
                game.remove(i);
                nbRemoved++;
                Thread.sleep(1000);

                System.out.printf("%" + OBJECT_WIDTH + "s", "");
                i--;
                hasActed = true;
                Thread.sleep(1000);
            }
            else if(game.get(i+1).getXp() == 0){
                game.remove(i + 1);
                nbRemoved++;
                Thread.sleep(1000);
                System.out.print(game.get(i));
                if((i + nbRemoved) % NB_OBJ_PER_LINE == 0 && i != 0 ){
                    System.out.print("\033[B\r"); // Moves cursor down one line
                    System.out.printf("%" + OBJECT_WIDTH + "s", "");
                    
                }
                else{
                    
                    System.out.printf("%" + OBJECT_WIDTH + "s", "");

                }
                hasActed = true;
                Thread.sleep(1000);

            }
            else{
                System.out.print("\033[" + OBJECT_WIDTH + "C"); // Moves cursor to the right
            }

        }
        if(total % NB_OBJ_PER_LINE == 0 || (total - 1) % NB_OBJ_PER_LINE == 0 || total < NB_OBJ_PER_LINE){
            System.out.print("\033[B\r");
        }
        if(!hasActed){
            boolean hasPlayer = false;
            for(int i = 0; i < game.size(); i++){
                if(game.get(i) instanceof Player){
                    hasPlayer = true;
                    break;
                }
            }
            if(!hasPlayer || game.size() == 1){
                return true;
            }
            else{
                Collections.shuffle(game,rand);
                
                
            }
        }

        System.out.println("\033[" + OBJECT_WIDTH + "C" + "\n-----------------------------------");
        afficheListe(game);
        
        

        return false;
        }
    }
    
}
