package Items;
public class ThunderPotion extends Potion {
    public int price;
    /**
     * Cette classe permet d'avoir des potions 'coup de tonerre' sur le,plateau.
     */
    public ThunderPotion(){
        super(0, true);
        this.price = 8;

    }
}
