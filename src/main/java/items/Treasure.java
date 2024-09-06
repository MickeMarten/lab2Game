package items;

import java.util.ArrayList;

public class Treasure extends Item{
    private final ArrayList<Item.itemType> itemList = new ArrayList<>();

public Treasure(){
    addTreasureToList();
    }


    public void addTreasureToList() {

        itemList.add(new itemType("Sword", 1, "Stick them with the pointy end", 5,7));
        itemList.add(new itemType("Magic Scroll", 1, "Banish the monster",1,1));

   }

   public ArrayList<itemType> getItemList(){
        return itemList;
   }

}
