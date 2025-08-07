package Items;
import characters.Magician;
public class Lightning {
    /**
     * Cette classe permet d'ajouter des éclairs sur le plateau, et gère l'interraction avec le joueur'.
     */
    public static void equip(Magician player){
        if(!player.hasLightning && !(player.hasFireball || player.hasInv)){
            System.out.println("You equip yourself with a lightning!");
            player.attack += 2;
            System.out.println("Your attack is now " + player.attack + "!");
            player.hasLightning = true;
        }
        else{
            System.out.println("You found a lightning, but you dont need it");
        }
    }
}
