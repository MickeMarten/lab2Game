package creature;

import maze.Maze;

import java.util.ArrayList;
import java.util.Scanner;

public class Player extends Creature implements Movement {


    ArrayList<String> pockets = new ArrayList<>();


    public Player() {
        pockets.add("Stick");
        pockets.add("Stone");

        setStartPosition(5, 9);
    }

    @Override
    public void creatureMovement(Maze maze) {

        int movePosistionX = getPosistionX();
        int movePosistionY = getPosistionY();
        Scanner scanner = new Scanner(System.in);
        String playerInput = scanner.nextLine();

        switch (playerInput) {
            case "w":
                movePosistionY--;
                break;
            case "s":
                movePosistionY++;

                break;
            case "d":
                movePosistionX++;

                break;
            case "a":
                movePosistionX--;

                break;
            default:
                System.out.println("Wrong input");
        }
        if (maze.cellIsWall(movePosistionX, movePosistionY)) {
            System.out.println("Ouch, that's a wall!");
        } else {
            setPosistionY(movePosistionY);
            setPosistionX(movePosistionX);

        }


    }


}