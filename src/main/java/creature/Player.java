package creature;

import items.Item;
import maze.Maze;

import java.util.ArrayList;
import java.util.Scanner;

public class Player extends Creature implements Movement {


    ArrayList<Item> pockets = new ArrayList<>();


    public Player() {;


        setStartPosition(5, 9);
    }

    @Override
    public void creatureMovement(Maze maze) {

        int movePosistionX = getPosistionX();
        int movePosistionY = getPosistionY();
        Scanner scanner = new Scanner(System.in);
        String playerInput = scanner.nextLine().toLowerCase();

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

            case "i":
                if(pockets.isEmpty()){
                    System.out.println("Your pockets are empty");
                } else{


                System.out.println("Your pockets consist of:");
                getPockets().forEach(item ->{
                    System.out.println(item.getName() + " " + " description:" + " " + item.getEffectDescription());
                });
                }
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

    public void addToPockets(Item item) {
        pockets.add(item);
    }

    public ArrayList<Item> getPockets(){
        return pockets;
    }


}