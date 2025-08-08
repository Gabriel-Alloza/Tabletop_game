package Items;
import characters.Warrior;
import java.util.Scanner;
public class Sword {
    public int price;

    public Sword(){
        this.price = 5;
    }
    /**
     * Cette classe permet de mettre des épées sur le plateau, et gère l'interraction avec le joueur.'.
     */
    public static void equip(Warrior player){

        Scanner scanner = new Scanner(System.in);

        if(!player.hasSword){
            System.out.println("You equip yourself with a sword!");
            player.attack += 5;
            player.hasSword = true;
            System.out.println("Your attack is now " + player.attack + "!");

        }
        else{
            System.out.println("You found a sword, but you alredy have one");
        }

        if(player.hasClub){
            System.out.println("You dont need your club anymore");
            player.attack -= 3;
            player.hasClub = false;
        }

        if(player.hasBow){
            String choice = "";
            while (!(choice.equals("Y") || choice.equals("N"))) {
                System.out.println("Do you want to throw away your bow to take this sword? (Y/N)");
                choice = scanner.nextLine();
                if(choice .equals("Y")){
                    player.attack -= 4;
                    player.hasBow = false;
                    System.out.println("Your attack is now " + player.attack + "!");

                }
                else if(choice .equals("N")){
                    player.attack -= 5;
                    player.hasSword = false;
                    System.out.println("Your attack is still " + player.attack + "!");
                    System.out.println("and a +2 bonus against dragons!");
                }
                else{
                    System.out.println("Wrong entry, try again");
                }
            }
        }
    }
}
