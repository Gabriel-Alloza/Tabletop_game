package characters;
import Items.*;

import java.util.Random;
import java.util.Scanner;
import java.util.Random;
public class Merchant extends Character{
        private Scanner scanner;

        public boolean isAngry;
        public Merchant(){
                super("Waldo", new Random().nextInt(10) + 1, new Random().nextInt(10) + 1);
                scanner = new Scanner(System.in);


        }

        public void doingBuisness(Character player){
                String response  = "";
                while(!(response .equals("S") || response .equals("B") || response .equals("P"))) {
                        System.out.println("Do you want to sell, buy or pass? (S/B/P)");
                        response = scanner.nextLine();
                        if (response.equals("S")) {
                                String response2 = "";
                                if(player instanceof Magician){
                                        // Vente Fireball
                                        if(((Magician) player).hasFireball){
                                                while (!(response2.equals("Y") || response2.equals("N"))){
                                                        System.out.println("I can give you 7 gold for this fireball, do you want to sell? (Y/N)");
                                                        response2 = scanner.nextLine();
                                                        if(response2.equals("Y")){
                                                                ((Magician) player).money += 7;
                                                                ((Magician) player).hasFireball = false;
                                                                System.out.println("It was a pleasure doing business with you!");
                                                                System.out.println("You now have " + ((Magician) player).money + " gold.");
                                                                System.out.println("You no longer have your fireball, your attack is now" + player.attack);
                                                        }
                                                        else if(response2.equals("N")){
                                                                System.out.println("Ok, goodbye then.");
                                                        }
                                                        else{
                                                                System.out.println("What?");
                                                        }
                                                }
                                        } else {
                                                System.out.println("You don't have a Fireball to sell.");
                                        }

                                        // Vente Lightning
                                        if(((Magician) player).hasLightning){
                                                while (!(response2.equals("Y") || response2.equals("N"))){
                                                        System.out.println("I can give you 2 gold for this lightning, do you want to sell? (Y/N)");
                                                        response2 = scanner.nextLine();
                                                        if(response2.equals("Y")){
                                                                ((Magician) player).money += 2;
                                                                ((Magician) player).hasLightning = false;
                                                                System.out.println("It was a pleasure doing business with you!");
                                                                System.out.println("You now have " + ((Magician) player).money + " gold.");
                                                                System.out.println("You no longer have your lightning, your attack is now" + player.attack);

                                                        }
                                                        else if(response2.equals("N")){
                                                                System.out.println("Ok, goodbye then.");
                                                        }
                                                        else{
                                                                System.out.println("What?");
                                                        }
                                                }
                                        } else {
                                                System.out.println("You don't have a Lightning to sell.");
                                        }

                                        // Vente Invisibility
                                        if(((Magician) player).hasInv){
                                                while (!(response2.equals("Y") || response2.equals("N"))){
                                                        System.out.println("I can give you 6 gold for this invisibility, do you want to sell? (Y/N)");
                                                        response2 = scanner.nextLine();
                                                        if(response2.equals("Y")){
                                                                ((Magician) player).money += 6;
                                                                ((Magician) player).hasInv = false;
                                                                System.out.println("It was a pleasure doing business with you!");
                                                                System.out.println("You now have " + ((Magician) player).money + " gold.");
                                                                System.out.println("You no longer have your invisibility, your attack is now" + player.attack + " and you no longer have a +3 bonus against evil spirits");

                                                        }
                                                        else if(response2.equals("N")){
                                                                System.out.println("Ok, goodbye then.");
                                                        }
                                                        else{
                                                                System.out.println("What?");
                                                        }
                                                }
                                        } else {
                                                System.out.println("You don't have an Invisibility to sell.");
                                        }

                                }
                                else if(player instanceof Warrior){
                                        // Vente Club
                                        if(((Warrior) player).hasClub){
                                                while (!(response2.equals("Y") || response2.equals("N"))){
                                                        System.out.println("I can give you 3 gold for this club, do you want to sell? (Y/N)");
                                                        response2 = scanner.nextLine();
                                                        if(response2.equals("Y")){
                                                                ((Warrior) player).money += 3;
                                                                ((Warrior) player).hasClub = false;
                                                                System.out.println("It was a pleasure doing business with you!");
                                                                System.out.println("You now have " + ((Warrior) player).money + " gold.");
                                                                System.out.println("You no longer have your club, your attack is now" + player.attack);

                                                        }
                                                        else if(response2.equals("N")){
                                                                System.out.println("Ok, goodbye then.");
                                                        }
                                                        else{
                                                                System.out.println("What?");
                                                        }
                                                }
                                        } else {
                                                System.out.println("You don't have a Club to sell.");
                                        }

                                        // Vente Bow
                                        if(((Warrior) player).hasBow){
                                                while (!(response2.equals("Y") || response2.equals("N"))){
                                                        System.out.println("I can give you 5 gold for this bow, do you want to sell? (Y/N)");
                                                        response2 = scanner.nextLine();
                                                        if(response2.equals("Y")){
                                                                ((Warrior) player).money += 5;
                                                                ((Warrior) player).hasBow = false;
                                                                System.out.println("It was a pleasure doing business with you!");
                                                                System.out.println("You now have " + ((Warrior) player).money + " gold.");
                                                                System.out.println("You no longer have your bow, your attack is now" + player.attack + " and you no longer have a +2 bonus against dragons");

                                                        }
                                                        else if(response2.equals("N")){
                                                                System.out.println("Ok, goodbye then.");
                                                        }
                                                        else{
                                                                System.out.println("What?");
                                                        }
                                                }
                                        } else {
                                                System.out.println("You don't have a Bow to sell.");
                                        }

// Vente Sword
                                        if(((Warrior) player).hasSword){
                                                while (!(response2.equals("Y") || response2.equals("N"))){
                                                        System.out.println("I can give you 5 gold for this sword, do you want to sell? (Y/N)");
                                                        response2 = scanner.nextLine();
                                                        if(response2.equals("Y")){
                                                                ((Warrior) player).money += 5;
                                                                ((Warrior) player).hasSword = false;
                                                                System.out.println("It was a pleasure doing business with you!");
                                                                System.out.println("You now have " + ((Warrior) player).money + " gold.");
                                                                System.out.println("You no longer have your sword, your attack is now" + player.attack);

                                                        }
                                                        else if(response2.equals("N")){
                                                                System.out.println("Ok, goodbye then.");
                                                        }
                                                        else{
                                                                System.out.println("What?");
                                                        }
                                                }
                                        } else {
                                                System.out.println("You don't have a Sword to sell.");
                                        }

                                }
                                System.out.println("do you want to buy something now? (any key) or pass? (P)");
                                response = scanner.nextLine();
                        } else if (response.equals("B")) {
                                        String response2 = "";
                                        if (player instanceof Magician) {
                                                // Achat Fireball
                                                while (!(response2.equals("Y") || response2.equals("N"))) {
                                                        System.out.println("I can sell you a Fireball for 7 gold. Do you want to buy? (Y/N)");
                                                        response2 = scanner.nextLine();
                                                        if (response2.equals("Y")) {
                                                                if (((Magician) player).money >= 7) {
                                                                        ((Magician) player).money -= 7;
                                                                        //Fireball soldItem = new Fireball();
                                                                        Fireball.equip(((Magician) player));
                                                                        if(((Magician) player).hasLightning){
                                                                                ((Magician) player).hasLightning = false;
                                                                                System.out.println("You throw away your lightning");
                                                                        }
                                                                        if(((Magician) player).hasInv){
                                                                                ((Magician) player).hasInv = false;
                                                                                System.out.println("You throw away your invisibility");
                                                                        }
                                                                        System.out.println("Thank you for your purchase!");
                                                                        System.out.println("You now have " + ((Magician) player).money + " gold.");
                                                                } else {
                                                                        System.out.println("You don't have enough gold to buy that!");
                                                                }
                                                        } else if (response2.equals("N")) {
                                                                System.out.println("Maybe next time.");
                                                        } else {
                                                                System.out.println("What?");
                                                        }
                                                }

                                                // Achat Lightning
                                                response2 = "";
                                                while (!(response2.equals("Y") || response2.equals("N"))) {
                                                        System.out.println("I can sell you a Lightning for 2 gold. Do you want to buy? (Y/N)");
                                                        response2 = scanner.nextLine();
                                                        if (response2.equals("Y")) {
                                                                if (((Magician) player).money >= 2 && !(((Magician) player).hasInv || ((Magician) player).hasFireball)) {
                                                                        ((Magician) player).money -= 2;
                                                                        //Lightning soldItem = new Lightning();
                                                                        Lightning.equip(((Magician) player));
                                                                        System.out.println("Thank you for your purchase!");
                                                                        System.out.println("You now have " + ((Magician) player).money + " gold.");
                                                                } else {
                                                                        if(((Magician) player).hasFireball || ((Magician) player).hasInv){
                                                                                System.out.println("Why would you buy that, you alredy have an objectively supperior weapon.");
                                                                        }
                                                                        else{
                                                                                System.out.println("You don't have enough gold to buy that!");

                                                                        }
                                                                }
                                                        } else if (response2.equals("N")) {
                                                                System.out.println("Maybe next time.");
                                                        } else {
                                                                System.out.println("What?");
                                                        }
                                                }

                                                // Achat Invisibility
                                                response2 = "";
                                                while (!(response2.equals("Y") || response2.equals("N"))) {
                                                        System.out.println("I can sell you an Invisibility for 6 gold. Do you want to buy? (Y/N)");
                                                        response2 = scanner.nextLine();
                                                        if (response2.equals("Y")) {
                                                                if (((Magician) player).money >= 6) {
                                                                        ((Magician) player).money -= 6;
                                                                        Invisibility.equip(((Magician) player));
                                                                System.out.println("Thank you for your purchase!");
                                                                        System.out.println("You now have " + ((Magician) player).money + " gold.");
                                                                } else {
                                                                        System.out.println("You don't have enough gold to buy that!");
                                                                }
                                                        } else if (response2.equals("N")) {
                                                                System.out.println("Maybe next time.");
                                                        } else {
                                                                System.out.println("What?");
                                                        }
                                                }

                                        } else if (player instanceof Warrior) {
                                                // Achat Club
                                                while (!(response2.equals("Y") || response2.equals("N"))) {
                                                        System.out.println("I can sell you a Club for 3 gold. Do you want to buy? (Y/N)");
                                                        response2 = scanner.nextLine();
                                                        if (response2.equals("Y") && !(((Warrior) player).hasBow || ((Warrior) player).hasSword)) {
                                                                if (((Warrior) player).money >= 3) {
                                                                        ((Warrior) player).money -= 3;
                                                                        Club.equip(((Warrior) player));
                                                                        System.out.println("Thank you for your purchase!");
                                                                        System.out.println("You now have " + ((Warrior) player).money + " gold.");
                                                                } else {
                                                                        System.out.println("You don't have enough gold to buy that!");
                                                                }
                                                        } else if (response2.equals("N")) {
                                                                System.out.println("Maybe next time.");
                                                        }
                                                        else if((((Warrior) player).hasBow || ((Warrior) player).hasSword)){
                                                                System.out.println("Why would you buy that, you alredy have a superior weapon");

                                                        } else {
                                                                System.out.println("What?");
                                                        }
                                                }

                                                // Achat Bow
                                                response2 = "";
                                                while (!(response2.equals("Y") || response2.equals("N"))) {
                                                        System.out.println("I can sell you a Bow for 5 gold. Do you want to buy? (Y/N)");
                                                        response2 = scanner.nextLine();
                                                        if (response2.equals("Y")) {
                                                                if (((Warrior) player).money >= 5) {
                                                                        ((Warrior) player).money -= 5;
                                                                        Bow.equip(((Warrior) player));
                                                                        System.out.println("Thank you for your purchase!");
                                                                        System.out.println("You now have " + ((Warrior) player).money + " gold.");
                                                                } else {
                                                                        System.out.println("You don't have enough gold to buy that!");
                                                                }
                                                        } else if (response2.equals("N")) {
                                                                System.out.println("Maybe next time.");
                                                        } else {
                                                                System.out.println("What?");
                                                        }
                                                }

                                                // Achat Sword
                                                response2 = "";
                                                while (!(response2.equals("Y") || response2.equals("N"))) {
                                                        System.out.println("I can sell you a Sword for 5 gold. Do you want to buy? (Y/N)");
                                                        response2 = scanner.nextLine();
                                                        if (response2.equals("Y")) {
                                                                if (((Warrior) player).money >= 5) {
                                                                        ((Warrior) player).money -= 5;
                                                                        Sword.equip(((Warrior) player));                                                                        System.out.println("Thank you for your purchase!");
                                                                        System.out.println("You now have " + ((Warrior) player).money + " gold.");
                                                                } else {
                                                                        System.out.println("You don't have enough gold to buy that!");
                                                                }
                                                        } else if (response2.equals("N")) {
                                                                System.out.println("Maybe next time.");
                                                        } else {
                                                                System.out.println("What?");
                                                        }
                                                }
                                        }
                                        System.out.println("Maybe you want to do something else now? (any key) or do you want to pass? (P)");
                                        response = scanner.nextLine();
                                        if(!(response .equals("P"))){
                                                response = "";
                                        }
                                } else if(response .equals("P")){
                                        System.out.println("ok goodbye");
                                }
                                else{
                                        System.out.println("I'll ask again");
                                }
                        }
                }
        }
