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
            monster.creatureMovement(maze);

            if(player.posistionX() == monster.posistionX() && player.posistionX() == monster.posistionX()){
                System.out.println(monster.posistionX()); System.out.println(monster.posistionY()); System.out.println(player.posistionX()); System.out.println(player.posistionY());
                System.out.println("gameOver try again");
                playerOnline = false;
            }
        }


    }
}