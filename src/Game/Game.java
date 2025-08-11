package Game;
import characters.Character;
import characters.Warrior;
import characters.Magician;
import characters.Wizard;
import characters.Orc;
import characters.BadSpirit;
import characters.Dragon;
import Items.Potion;
import Items.Club;
import Items.Bow;
import Items.Sword;
import Items.Lightning;
import Items.Invisibility;
import Items.Fireball;
import java.util.Scanner;
import java.util.Random;
import characters.Merchant;

public class Game {
    /**
     * Cette classe permet de faire tourner le jeu jusqu'à la mort, ou la victoire du joueur. Elle gère les combats, l'équipement d'objets, et les lancers de dé..
     */

    private Character player;
    private Board board;
    private Scanner scanner;
    private boolean isDead = false;
    private boolean hasWon = false;

    public Game(Character player, Board board) {
        this.player = player;
        this.board = board;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        if(board.difficulty .equals("UW")){
            player.attack = 1;
            player.life = 1;
        };
        System.out.println(player.charName + ", you have " + player.attack + " strength and " + player.life + " life.");
        System.out.println("Let the game begin!!");

        int position = 0;

        System.out.println("You're on square 1");
        while (!hasWon && !isDead) {
            System.out.println("To roll a D6, type 'D'");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("D")) {
                position += dice(6);
                if (position < board.getSize()) {
                    Object square = board.getSquare(position - 1);
                    System.out.println("You're on square " + (position + 1));
                    boolean setBack = processSquare(square);
                    if(setBack){
                        position -= dice(6);
                        if(position < 0){
                            position = 0;
                        }
                        System.out.println("You escaped to square " + (position+1));

                    }
                }

                if (position >= board.getSize() && !isDead) {
                    if(player.killCount >= 5){
                        System.out.println("You completed you journey but you killed way too many merchants so the king decided to hang you. Game over!");
                        isDead = true;
                    }
                    else{
                        System.out.println("Congratulation!! you won the game!!!");
                        hasWon = true;
                    }

                }
            } else {
                System.out.println("You failed to roll the dice! please try again");
            }
        }
    }

    private boolean processSquare(Object square) {
        boolean setBack = false;
        if (square == null) {
            System.out.println("Nothing to see here!");
        } else if (square instanceof Character) {
            if(player instanceof Magician && square instanceof Orc){
                System.out.println("You see an orc, but he doesn't attack you");
            }
            else if(player instanceof Warrior && square instanceof BadSpirit){
                System.out.println("You see a bad spirit, but he doesn't attack you");
            }
            else if(square instanceof Merchant && player.killCount < dice(3)){
                System.out.println("You encounter a merchant! He can sell you stuff!:");
                System.out.println("Do you want to kill and rob the merchant? (Y/N)");
                String input = scanner.nextLine();
                if(input .equals("Y")){
                    player.money += 3;
                    player.killCount += 1;
                System.out.println("Your merchant kill count is now " + player.killCount + " the higher it gets, the higher are the chances of a merchant attacking you first.");
                    setBack = fight((Character) square);
                    System.out.println("You found 3 gold coins in his shop");
                }
                else{
                    if(!(input .equals("N"))){
                        System.out.println("huuuuh I'll take that as a no I guess");
                    }
                    ((Merchant)square).doingBuisness(player);

                }


            }
            else{
                setBack = fight((Character) square);
                if(square instanceof Merchant){
                    player.killCount += 1;
                    System.out.println("your merchant kill count is now " + player.killCount);
                }



            }
        } else if (square instanceof Potion) {
            ((Potion) square).equip(player);
        } else {
            equipItem(square);
        }
        return setBack;
    }

    private boolean fight(Character enemy) {
        boolean hasEscaped = false;
        while(!isDead && enemy.life > 0 && !hasEscaped){
            System.out.println("You fight a " + enemy.getClass().getSimpleName().toLowerCase() + "!");
            int randomFactor = dice(20);
            if(player.doubleForce){
                player.attack = player.attack*2;
            }



            if(player instanceof Warrior && ((Warrior)player).hasBow && enemy instanceof Dragon){
                if(randomFactor == 1){
                    System.out.println("Critical miss! you dont inflict him any damage at all!");
                }
                else if(randomFactor == 20){
                    System.out.println("Critical success! you inflict him your strentgh + 2 in damage!");
                    enemy.life -= player.attack + 4;
                }
                else{
                    System.out.println("You neither did a critical miss, nor a critical success. Damage dealt as normal.");
                    enemy.life -= player.attack + 2;
                }
            }
            else if(player instanceof Magician && ((Magician)player).hasInv &&enemy instanceof BadSpirit){
                if(randomFactor == 1){
                    System.out.println("Critical miss! you dont inflict him any damage at all!");
                }
                else if(randomFactor == 20){
                    System.out.println("Critical success! you inflict him your strentgh + 2 in damage!");
                    enemy.life -= player.attack + 5;
                }
                else{
                    System.out.println("You neither did a critical miss, nor a critical success. Damage dealt as normal.");
                    enemy.life -= player.attack + 3;

                }
            }
            else{
                if(randomFactor == 1){
                    System.out.println("Critical miss! you dont inflict him any damage at all!");
                }
                else if(randomFactor == 20){
                    System.out.println("Critical success! you inflict him your strentgh + 2 in damage!");
                    enemy.life -= player.attack + 2;

                }
                else{
                    System.out.println("You neither did a critical miss, nor a critical success. Damage dealt as normal.");
                    enemy.life -= player.attack;
                }
            }

            if(player.doubleForce){
                player.attack = player.attack/2;
                player.doubleForce = false;
            }



            if (enemy.life <= 0) {
                System.out.println("You win!!");
                if(!(enemy instanceof Merchant)){
                    player.attack += 1;
                    System.out.println("You leveled up! you now have " + player.attack + " attack!!");
                }

            } else {
                player.life -= enemy.attack;
                System.out.println("Ouch! he harmed you!");
                if (player.life <= 0) {
                    System.out.println("You're dead, game over.");
                    isDead = true;
                } else {
                    System.out.println("Luckily, you survived!");
                    System.out.println("You still have " + player.life + " life points!");
                    System.out.println("Do you want to fight? (F), or escape? (E)");
                    String choice = scanner.nextLine();
                    if(choice .equals("E")){
                        hasEscaped = true;
                    }
                    else if(choice .equals("F")){

                    }
                    else{
                        System.out.println("You were'nt clear enough, so now you're fightning lol");
                    }
                }
            }
        }
        return hasEscaped;
    }



    private void equipItem(Object item) {
        if (player instanceof Magician) {
            if (item instanceof Fireball) ((Fireball) item).equip((Magician) player);
            else if (item instanceof Lightning) ((Lightning) item).equip((Magician) player);
            else if(item instanceof Invisibility) ((Invisibility) item).equip((Magician) player);
            else System.out.println("You found a " + item.getClass().getSimpleName() + ", but you don't know how to use it");
        } else if (player instanceof Warrior) {
            if (item instanceof Sword) ((Sword) item).equip((Warrior) player);
            else if (item instanceof Club) ((Club) item).equip((Warrior) player);
            else if(item instanceof Bow) ((Bow) item).equip((Warrior) player);
            else System.out.println("You found a " + item.getClass().getSimpleName() + ", but you don't know how to use it");
        }
    }

    private int dice(int number) {
        return new Random().nextInt(number) + 1;
    }

}
