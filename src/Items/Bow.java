package Items;

import java.util.Scanner;
import characters.Warrior;

public class Bow {
    /**
     * Cette classe permet de mettre des arcs sur le plateau, et gère l'interraction de l'arc avec le joueur.
     */
    public static void equip(Warrior player){

        Scanner scanner = new Scanner(System.in);

        if(!player.hasBow){
            System.out.println("You equip yourself with a bow!");
            player.attack += 4;
            player.hasBow = true;
            System.out.println("Your attack is now " + player.attack + "!");
            System.out.println("And you have a +2 bonus against dragons!");
        }
        else{
            System.out.println("You found a bow, but you alredy have one");
        }

        if(player.hasSword){
            String choice = "";
            while(!(choice .equals("Y") || choice .equals("N"))){
                System.out.println("Do you want to throw away your sword to pick up this bow? (Y/N)");
                choice = scanner.nextLine();
                if(choice .equals("Y")){
                    player.attack -= 5;
                    player.hasSword = false;
                    System.out.println("Your attack is now " + player.attack + "!");
                    System.out.println("And you have a +2 bonus against dragons!");
                }
                else if(choice .equals("N")){
                    player.attack -= 4;
                    System.out.println("Your attack is still " + player.attack + "!");
                    player.hasBow = false;
                }
                else{
                    System.out.println("Wrong input, please try again");
                }
            }
        }

        if(player.hasClub){
            System.out.println("You dont need your club anymore");
            player.attack -= 3;
            player.hasClub = false;
            System.out.println("Your attack is now " + player.attack + "!");
            System.out.println("And you have a +2 bonus against dragons!");
        }
    }
}
