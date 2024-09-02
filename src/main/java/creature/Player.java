package creature;

import java.util.ArrayList;

public class Player extends Creature implements Creature.CreatureMovement {
    public Creature.CreatureAttributes playerAttributes;

    public Player(){
        ArrayList<String> pockets = new ArrayList<>();
        pockets.add("Stick");
        pockets.add("Stone");

        playerAttributes = new Creature.CreatureAttributes(
                new Hitpoints(10),
                new Strength(3),
                new Movement(5),
                new PositionX(5.5),
                new PositionY(5.5),
                new CarriedItems(pockets)

        );
    }

    @Override
    public void move() {

    }
}