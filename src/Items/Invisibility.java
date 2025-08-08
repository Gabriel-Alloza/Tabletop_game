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
            player.attack += 5;
            player.hasInv = true;
            System.out.println("Your attack is now " + player.attack + "!");
            System.out.println("and a +3 bonus against bad spirits!");
        }
        else{
            System.out.println("You found invisibility, but you  alredy have it");
        }
        if(player.hasFireball){
            String choice = "";
            while(!(choice .equals("Y") || choice .equals("N"))){
                System.out.println("Do you want to throw away your fire ball to take invisibility? (Y/N)");
                choice = scanner.nextLine();
                if(choice .equals("Y")){
                    player.attack -=7;
                    player.hasFireball = false;
                    System.out.println("Your attack is now " + player.attack + "!");
                    System.out.println("and a +3 bonus against bad spirits!");
                }
                else if(choice .equals("N")){
                    player.attack -=5;
                    player.hasInv = false;
                    System.out.println("Your attack is still " + player.attack + "!");
                }
                else{
                    System.out.println("Wrong answer, please try again");
                }
            }

        }


        if(player.hasLightning){
            System.out.println("You dont need your lightning anymore");
            player.attack -= 2;
            player.hasLightning = false;
            System.out.println("Your attack is now " + player.attack + "!");
            System.out.println("and a +3 bonus against bad spirits!");
        }
    }
}