package creature;
import maze.Maze;
import java.util.Random;


public class Monster extends Creature implements Movement {

    public Monster(){
        setStartPosition(5,5);

    }

    @Override
    public void creatureMovement(Maze maze){
        Random randomPos = new Random();
        int movePositionX = randomPos.nextInt(9);
        int movePositionY = randomPos.nextInt(9);
        if(maze.cellIsWall(movePositionX, movePositionY)){
            System.out.println("Monster smashed in to the wall");
        } else {

            posistionX = movePositionX;
            posistionY = movePositionY;




        }
    }






}