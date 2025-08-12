package Items;
import characters.Magician;
public class Lightning {
    public int price;

    public Lightning(){
        this.price = 2;
    }
    /**
     * Cette classe permet d'ajouter des éclairs sur le plateau, et gère l'interraction avec le joueur'.
     */
    public static void equip(Magician player){
        if(!player.hasLightning && !(player.hasFireball || player.hasInv)){
            System.out.println("You equip yourself with a lightning!");
            player.setAttack(player.getAttack() + 2);
            System.out.println("Your attack is now " + player.getAttack() + "!");
            player.hasLightning = true;
        }
        else{
            System.out.println("You found a lightning, but you dont need it");
        }
    }
}
