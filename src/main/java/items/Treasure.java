package items;

import java.util.ArrayList;

public class Treasure extends Item{
    private final ArrayList<Item> treasureList = new ArrayList<>();

public Treasure(){
    super();
    addTreasureToList();
    }


    private void addTreasureToList() {

        treasureList.add(new Item("Sword", 1, "Stick them with the pointy end", 5,7));
        treasureList.add(new Item("Magic Scroll", 1, "Banish the monster",1,1));

   }

   public ArrayList<Item> getTreasureList(){
        return treasureList;
   }

}
