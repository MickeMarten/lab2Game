package items;

import java.util.ArrayList;

public class Treasure extends Item{
    private final ArrayList<Item.itemType> treasureList = new ArrayList<>();

public Treasure(){
    addTreasureToList();
    }


    private void addTreasureToList() {

        treasureList.add(new itemType("Sword", 1, "Stick them with the pointy end", 5,7));
        treasureList.add(new itemType("Magic Scroll", 1, "Banish the monster",1,1));

   }

   public ArrayList<itemType> getTreasureList(){
        return treasureList;
   }

}
