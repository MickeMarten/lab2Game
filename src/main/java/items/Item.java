package items;

public class Item {

    String name;
    int quantity;
    String effectDescription;
    int posistionX;
    int posistionY;

    public Item(String name, int quantity, String effectDescription, int posistionX, int posistionY) {
        this.name = name;
        this.quantity = quantity;
        this.effectDescription = effectDescription;
        this.posistionX = posistionX;
        this.posistionY = posistionY;


    }

    public Item() {

    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public String getEffectDescription() {
        return effectDescription;

    }

    public int getPosistionX() {
        return posistionX;
    }

    public int getPosistionY() {
        return posistionY;
    }


}