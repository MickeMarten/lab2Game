package game;

import creature.Monster;
import creature.Player;
import items.Treasure;
import maze.Maze;


public class Game {

    public static void main(String[] args) {
        boolean playerOnline = true;

        Player player = new Player();
        Monster monster = new Monster();
        Treasure treasure = new Treasure();
        Maze maze = new Maze();


        gameMenu();


        try {

            while (playerOnline) {

                placeCreaturesAndItems(maze, monster, player, treasure);
                maze.printMaze();
                try {
                    player.creatureMovement(maze);
                    monster.creatureMovement(maze);

                } catch (Exception e) {
                    System.out.println(e.getMessage() + "Something went wrong while moving creatures.");
                }

                findingItems(treasure, player);
                try {
                    playerOnline = gameEnds(monster, player);

                } catch (Exception e) {
                    System.out.println(e.getMessage() + "Something went wrong while game was supposed to end");
                }


            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + "Something went wrong, please restart the game");
        }


    }


    private static void placeCreaturesAndItems(Maze maze, Monster monster, Player player, Treasure treasure) {
        try {
            maze.placeObject(treasure);
            maze.placeObject(player);
            maze.placeObject(monster);
        } catch (Exception e) {
            System.out.println(e.getMessage() + "Something went wrong when placing the creatures and items");
        }


    }

    private static void gameMenu() {
        System.out.println("Escape the monster, get to the door( / )  use (w, a, s, d) to move");


    }


    private static void findingItems(Treasure treasure, Player player) {
        try {
            treasure.getTreasureList().forEach(item -> {
                if (item.posistionY() == player.getPosistionY() && item.posistionX() == player.getPosistionX()) {
                    System.out.println("You have found" + " " + item.quantity() + " " + item.name());
                }

            });

        } catch (Exception e) {
            System.out.println(e.getMessage() + "Something went wrong when trying to find a treasure");
        }


    }

    private static boolean gameEnds(Monster monster, Player player) {
        if (player.getPosistionX() == monster.getPosistionX() && player.getPosistionY() == monster.getPosistionX()) {
            System.out.println("The monster caught you. Please try again.");
            return false;
        } else if (player.getPosistionX() == 9 && player.getPosistionY() == 1
        ) {
            System.out.println("You have escaped the monster, congratulations!");
            return false;

        } else {
            return true;
        }


    }


}