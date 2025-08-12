
package characters;


public class Character {
    /**
     * Cette classe permet de créer des personnages,( PJ ou PNJ).
     */
    private boolean doubleForce = false;
    private String charName;
    private int attack;
    private int life;
    private int money = 3;
    private int killCount = 0;

    public boolean getDoubleForce(){
        return doubleForce;
    }

    public void setDoubleForce(boolean doubleForce){
        this.doubleForce = doubleForce;
    }

    public String getCharName(){
        return charName;
    }

    public int getAttack(){
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getLife(){
        return life;
    }

    public  void setLife(int life){
        this.life = life;
    }

    public int getMoney(){
        return money;
    }

    public void setMoney(int money){
        this.money = money;
    }

    public int getKillCount(){
        return killCount;
    }

    public void setKillCount(int killCount){
        this.killCount = killCount;
    }

    public Character(String charName, int attack, int life){
            this.charName = charName;
            this.attack = attack;
            this.life = life;
        }

}
