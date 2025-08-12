package Items;

import characters.Magician;
import java.util.Scanner;

public class Fireball {
    public int price;
    public Fireball(){
        this.price = 7;
    }
    /**
     * Cette classe permet d'ajouter des boules de feu sur le plateau, et gère l'interraction avec le joueur'.
     */
    public static void equip(Magician player){

        Scanner scanner = new Scanner(System.in);

        if(!player.hasFireball ){
            System.out.println("You equip yourself with a fireball!");
            player.setAttack(player.getAttack() + 7);
            player.hasFireball = true;
            System.out.println("Your attack is now " + player.getAttack() + "!");

        }
        else{
            System.out.println("You found a fireball, but you alredy have one");
        }

        if(player.hasLightning){
            System.out.println("You dont need your lightning anymore");
            player.setAttack(player.getAttack() - 2);
            player.hasLightning = false;
        }

        if(player.hasInv){
            String choice="";

            while(!(choice .equalsIgnoreCase("Y") || choice .equalsIgnoreCase("N"))){
                System.out.println("Do you want to throw away your invisibility to take a fire ball? (Y/N)");
                choice = scanner.nextLine();
                if(choice .equalsIgnoreCase("Y")){
                    player.setAttack(player.getAttack() - 5);
                    player.hasInv= false;
                    System.out.println("Your attack is now " + player.getAttack() + "!");

                }
                else if(choice .equalsIgnoreCase("N")){
                    player.setAttack(player.getAttack() - 7);
                    player.hasFireball = false;
                    System.out.println("Your attack is still " + player.getAttack() + "!");
                    System.out.println("and a +3 bonus against bad spirits!");

                }
                else{
                    System.out.println("Wrong answer, please try again");
                }
            }
        }
    }
}
