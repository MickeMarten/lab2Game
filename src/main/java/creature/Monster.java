package creature;
import java.lang.Math;
import maze.Maze;
import java.util.Random;

import java.util.ArrayList;

public class Monster extends Creature implements Movement {
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

    @Override
    public void creatureMovement(Maze maze){
        Random randomPos = new Random();
        System.out.println("Monster is Hunting you.");
        int movePosistionX = randomPos.nextInt(9);
        int movePosistionY = randomPos.nextInt(9);

       monsterAttributes = new Creature.CreatureAttributes(
               monsterAttributes.hitpoints(),
               monsterAttributes.strength(),
               monsterAttributes.movement(),
               new PositionX(movePosistionX),
               new PositionY(movePosistionY),
               monsterAttributes.carriedItems()
       );


    }

    public int posistionX(){return monsterAttributes.positionX().x();}

    public int posistionY(){return monsterAttributes.positionY().y();}






}