package Items;

import java.util.Scanner;
import characters.Warrior;

public class Bow {

    public int price;

    public Bow(){
        this.price = 5;
    }

    /**
     * Cette classe permet de mettre des arcs sur le plateau, et gère l'interraction de l'arc avec le joueur.
     */
    public static void equip(Warrior player){

        Scanner scanner = new Scanner(System.in);

        if(!player.hasBow){
            System.out.println("You equip yourself with a bow!");
            player.setAttack(player.getAttack() + 4);
            player.hasBow = true;
            System.out.println("Your attack is now " + player.getAttack() + "!");
            System.out.println("And you have a +2 bonus against dragons!");
        }
        else{
            System.out.println("You found a bow, but you alredy have one");
        }

        if(player.hasSword){
            String choice = "";
            while(!(choice .equalsIgnoreCase("Y") || choice .equalsIgnoreCase("N"))){
                System.out.println("Do you want to throw away your sword to pick up this bow? (Y/N)");
                choice = scanner.nextLine();
                if(choice .equalsIgnoreCase("Y")){
                    player.setAttack(player.getAttack() -  5);
                    player.hasSword = false;
                    System.out.println("Your attack is now " + player.getAttack() + "!");
                    System.out.println("And you have a +2 bonus against dragons!");
                }
                else if(choice .equalsIgnoreCase("N")){
                    player.setAttack(player.getAttack() - 4);
                    System.out.println("Your attack is still " + player.getAttack() + "!");
                    player.hasBow = false;
                }
                else{
                    System.out.println("Wrong input, please try again");
                }
            }
        }

        if(player.hasClub){
            System.out.println("You dont need your club anymore");
            player.setAttack(player.getAttack() - 3);
            player.hasClub = false;
            System.out.println("Your attack is now " + player.getAttack() + "!");
            System.out.println("And you have a +2 bonus against dragons!");
        }
    }
}
