package creature;

import maze.Maze;

import java.util.ArrayList;
import java.util.Scanner;

public class Player extends Creature implements Movement {
    public Creature.CreatureAttributes playerAttributes;

    public Player() {
        ArrayList<String> pockets = new ArrayList<>();
        pockets.add("Stick");
        pockets.add("Stone");

        playerAttributes = new Creature.CreatureAttributes(
                new Hitpoints(10),
                new Strength(3),
                new Movement(5),
                new PositionX(5),
                new PositionY(9),
                new CarriedItems(pockets)

        );
    }

    @Override
    public void creatureMovement(Maze maze) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Walk and thy will find (w, a, s, d):");
        String playerInput = scanner.nextLine();
        int movePosistionX = posistionX();
        int movePosistionY = posistionY();
        switch (playerInput) {
            case "w":
                movePosistionY--;
                break;
            case "s":
                System.out.println("Move down");
                movePosistionY++;

                break;
            case "d":
                System.out.println("Move right");
                movePosistionX++;

                break;
            case "a":
                movePosistionX--;
                System.out.println("Move left");

                break;
            default:
                System.out.println("Invalid input");
                return;
        }
        if (maze.isWall(movePosistionX, movePosistionY)) {
            System.out.println("Ouch, that's a wall!");
        } else {
            playerAttributes = new Creature.CreatureAttributes(
                    playerAttributes.hitpoints(),
                    playerAttributes.strength(),
                    playerAttributes.movement(),
                    new PositionX(movePosistionX),
                    new PositionY(movePosistionY),
                    playerAttributes.carriedItems()
            );
                    }



    }






    public int posistionX() {
        return playerAttributes.positionX().x();
    }

    public int posistionY() {
        return playerAttributes.positionY().y();
    }

}