package Items;
import characters.Character;
public class Potion {
    /**
     * Cette classe permet d'avoir des attributs communs à totes les potions, et gère l'interraction avec le joueur.'.
     */
    int healingPower;
    protected boolean doubleStrength;
    public Potion(int healingPower, boolean doubleStrength){
        this.healingPower = healingPower;
        this.doubleStrength = doubleStrength;
    }
    public void equip(Character player){
        if(doubleStrength){
            player.doubleForce = true;
            System.out.println("You found a potion and it doubled your strength for the next fight!! (if your strength isn't alredy doubled)");

        }
        else{
            player.life += healingPower;
            System.out.println("You found a potion and gained " + healingPower + " life!!");
        }

    }
}
