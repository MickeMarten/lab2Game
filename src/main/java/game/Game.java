package game;

import creature.Monster;
import creature.Player;
import maze.Maze;


public class Game {
    public static void main(String[] args) {
        Player player = new Player();
        Monster monster = new Monster();
        Maze maze = new Maze();
        maze.printMaze();
    }
}