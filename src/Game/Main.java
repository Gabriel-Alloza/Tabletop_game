package Game;
import characters.Character;
import java.util.Scanner;
import  Database.DatabaseManager;

public class Main {


    public static void main(String[] args) {

        /**
         * Cette classe permet de faire tourner tout le jeu.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Dungeons and Dragons: Virtual Board Game Edition!!");
        DatabaseManager db = new DatabaseManager();
        db.getHeroes();
         db.close();



        Menu menu = new Menu();
        Character player = menu.createCharacter();

        if (player == null) {
            System.out.println("Invalid class. Please restart the game.");
            return;
        }

        System.out.println("Please choose a difficulty level, (Unloosable, (UL), Super easy (SE), Easy, (E), Standard, (S), Hard, (H), Super hard, (SH) or Unwinable, (UW)");
        String difficulty = scanner.nextLine();
        if(difficulty .equals("UL") || difficulty .equals("SE") || difficulty .equals("E") || difficulty .equals("S") || difficulty .equals("H") || difficulty .equals("SH") || difficulty .equals("UW")){
            Board board = new Board(difficulty);
            Game game = new Game(player, board);
            game.start();
        }else{
            System.out.println("Invalid difficulty level. Please restart the game.");
            return;
        }




    }
}
