package creature;

import java.util.ArrayList;

public class Monster extends Creature implements Creature.CreatureMovement {
    CreatureAttributes MonsterAttributes;
    public Monster(){
        MonsterAttributes = new CreatureAttributes(
                new Hitpoints(5),
                new Strength(2),
                new Movement(3),
                new PositionX(1.1),
                new PositionY(1.1),
                null
        );

    }



    @Override
    public void move() {

    }
}