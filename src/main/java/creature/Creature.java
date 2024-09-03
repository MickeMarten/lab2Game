package creature;

import java.util.ArrayList;

abstract class Creature {


    public record CreatureAttributes(Hitpoints hitpoints,Strength strength, Movement movement, PositionX positionX, PositionY positionY, CarriedItems carriedItems){
    }

     record Hitpoints(int hitpoints){

    }

    record Strength(int strength){}


    record Movement(int speed){

    }

    record PositionX(int x){}

    record  PositionY(int y){}


    record CarriedItems(ArrayList<String> items){}




}