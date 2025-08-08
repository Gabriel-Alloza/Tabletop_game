package Items;
public class StandardPotion extends Potion {
    public int price;


    /**
     * Cette classe permet d'avoir des potions standard.
     */
    public StandardPotion(){
        super(2, false);
        this.price = 2;

    }

}
