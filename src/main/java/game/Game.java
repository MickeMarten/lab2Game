package game;
import creature.Monster;
import creature.Player;
import maze.Maze;


abstract public class Game {


    public static void main(String[] args) {
        boolean playerOnline = true;

            Player player = new Player();
            Monster monster = new Monster();
            Maze maze = new Maze();
        while (playerOnline){
            maze.placePlayer(player);
            maze.placeMonster(monster);
            maze.printMaze();

            player.creatureMovement(maze);
        }


    }
}