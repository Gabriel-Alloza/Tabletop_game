package Items;
import characters.Warrior;

public class Club {
    public int price;
    public Club(){
        this.price = 3;
    }
    /**
     * Cette classe permet d'ajouter des masses d'amres au plateau et gère l'interraction avec le joueur.'.
     */

    public static void equip(Warrior player){
        if(!player.hasClub && !(player.hasSword || player.hasBow)){
            System.out.println("You equip yourself with a club!");
            player.setAttack(player.getAttack() + 3);
            System.out.println("Your attack is now " + player.getAttack() + "!");
            player.hasClub = true;
        }
        else{
            System.out.println("You found a club, but you dont need it");
        }
    }
}
