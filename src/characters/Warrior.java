package characters;
import java.util.Random;



public class Warrior extends Character {
    /**
     * Cette classe permet au joueur de jouer un guerrier. Elle génère une vie et une attaque aléatoire entre deux bornes prédéfiniies.
     */

    public boolean hasSword = false;
    public boolean hasClub = false;
    public boolean hasBow = false;

    public Warrior(String charName){
        super(charName, generateValue(), generateValue());

    }
    private static int generateValue(){
        return new Random().nextInt(6)+5;
    }
}
