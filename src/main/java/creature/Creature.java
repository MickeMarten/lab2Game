package creature;

import java.util.ArrayList;

public class Creature {

     interface CreatureMovement {
        public void move();

    }

    public record CreatureAttributes(Hitpoints hitpoints,Strength strength, Movement movement, PositionX positionX, PositionY positionY, CarriedItems carriedItems){
    }

     record Hitpoints(int hitpoints){

    }

    record Strength(int strength){}


    record Movement(int speed){

    }

    record PositionX(double x){}

    record  PositionY(double y){}


    record CarriedItems(ArrayList<String> items){}




}