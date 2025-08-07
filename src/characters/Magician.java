package characters;
import java.util.Random;


public class Magician extends Character {
    /**
     * Cette classe permet au joueur de jouer un magicien, elle génère une force et une vie aléatoire dans des bornes prédéfinies..
     */
    public boolean hasLightning = false;
    public boolean hasFireball = false;
    public boolean hasInv = false;

    public Magician(String charName){
        super(charName, generateAttack(), generateLife());


    }
    private static int generateAttack(){
        return new Random().nextInt(8)+8;
    }

    private static int generateLife(){
        return new Random().nextInt(4)+3;
    }
}