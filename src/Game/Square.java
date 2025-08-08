package Game;
import characters.*;
import Items.*;


public class Square {

    /**
     * Cette classe permet de remplir le plateur avec les objets que l'on veut.'.
     */
    String squareContent;

    public void Square(String squareContent){
        this.squareContent = squareContent;
    }

    public Object getcontent(String squareContent){
        if(squareContent .equals("Wizard")){
            return new Wizard();
        }
        else if(squareContent .equals("Gobelin")){
            return new Gobelin();
        }
        else if(squareContent .equals("Dragon")){
            return new Dragon();
        }
        else if(squareContent .equals("Orc")){
            return new Orc();
        }
        else if(squareContent .equals("BadSpirit")){
            return new BadSpirit();
        }
        else if(squareContent .equals("Standard potion")){
            return new StandardPotion();
        }
        else if(squareContent .equals("Big potion")){
            return new BigPotion();
        }
        else if(squareContent .equals("Club")){
            return new Club();
        }
        else if(squareContent .equals("Sword")){
            return new Sword();
        }
        else if(squareContent .equals("Lightning")){
            return new Lightning();
        }
        else if(squareContent .equals("Fireball")){
            return new Fireball();
        }
        else if(squareContent .equals("Bow")){
            return new Bow();
        }
        else if(squareContent .equals("Invisibility")){
            return new Invisibility();
        }
        else if(squareContent .equals("Thunder potion")){
            return new ThunderPotion();
        }
        else if(squareContent .equals("Merchant")){
            return new Merchant();
        }
        else if(squareContent .equals("Nothing")){
            return null;
        }
        else{
            System.out.println(squareContent + "? t'es sûr de toi là??");
            return new Object();
        }
    }
}
