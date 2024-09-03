package creature;

import java.util.ArrayList;

public class Monster extends Creature {
    public CreatureAttributes monsterAttributes;
    public Monster(){
        monsterAttributes = new CreatureAttributes(
                new Hitpoints(5),
                new Strength(2),
                new Movement(3),
                new PositionX(5),
                new PositionY(5),
                null
        );

    }

    public int posistionX(){return monsterAttributes.positionX().x();}

    public int posistionY(){return monsterAttributes.positionY().y();}






}