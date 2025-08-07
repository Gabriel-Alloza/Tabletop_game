package Game;
import characters.Warrior;
import  characters.Magician;
import characters.Character;
import java.util.Scanner;

public class Menu {
    /**
     * Cette classe affiche le menu de création de personnage, et enregistre le nouveau personnage dans la base de données, (commence par afficher les persos déjà enregistrés quand le jeu se lance pour s'assurer que ceux-ci sont bien dans la base).
     */
    public Character createCharacter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your class?");
        String type = scanner.nextLine();

        if (type.equalsIgnoreCase("Warrior")) {
            Warrior PC = new Warrior(name);
            //DatabaseManager db = new DatabaseManager();
            //db.createHero(PC);
            return PC;
        } else if (type.equalsIgnoreCase("Magician")) {
            Magician PC = new Magician(name);
            //DatabaseManager db = new DatabaseManager();
            //db.createHero(PC);
            return PC;
        } else {
            System.out.println("Invalid class, please restart the game.");
            return null;
        }
    }
}
