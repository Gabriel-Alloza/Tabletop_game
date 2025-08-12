package Items;
import characters.Magician;
import java.util.Scanner;

public class Invisibility {
    public int price;
    public Invisibility(){
        this.price = 6;
    }
    /**
     * Cette classe permet d'ajouter de l'invisibilité sur le plateau, et gère l'interraction avec le joueur'.
     */

    public static void equip(Magician player){
        Scanner scanner = new Scanner(System.in);

        if(!player.hasInv){
            System.out.println("You equip yourself with invisibility!");
            player.setAttack(player.getAttack() + 5);
            player.hasInv = true;
            System.out.println("Your attack is now " + player.getAttack() + "!");
            System.out.println("and a +3 bonus against bad spirits!");
        }
        else{
            System.out.println("You found invisibility, but you  alredy have it");
        }
        if(player.hasFireball){
            String choice = "";
            while(!(choice .equalsIgnoreCase("Y") || choice .equalsIgnoreCase("N"))){
                System.out.println("Do you want to throw away your fire ball to take invisibility? (Y/N)");
                choice = scanner.nextLine();
                if(choice .equals("Y")){
                    player.setAttack(player.getAttack() -7);
                    player.hasFireball = false;
                    System.out.println("Your attack is now " + player.getAttack() + "!");
                    System.out.println("and a +3 bonus against bad spirits!");
                }
                else if(choice .equals("N")){
                    player.setAttack(player.getAttack() -5);
                    player.hasInv = false;
                    System.out.println("Your attack is still " + player.getAttack() + "!");
                }
                else{
                    System.out.println("Wrong answer, please try again");
                }
            }

        }


        if(player.hasLightning){
            System.out.println("You dont need your lightning anymore");
            player.setAttack(player.getAttack() - 2);
            player.hasLightning = false;
            System.out.println("Your attack is now " + player.getAttack() + "!");
            System.out.println("and a +3 bonus against bad spirits!");
        }
    }
}