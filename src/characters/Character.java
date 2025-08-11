
package characters;


public class Character {
    /**
     * Cette classe permet de créer des personnages,( PJ ou PNJ).
     */
        public boolean doubleForce = false;
        public String charName;
        public int attack;
        public int life;
        public int money = 100;
        public int killCount = 0;

    public Character(String charName, int attack, int life){
            this.charName = charName;
            this.attack = attack;
            this.life = life;
        }

}
