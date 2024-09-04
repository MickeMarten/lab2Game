package game;
import creature.Monster;
import creature.Player;
import maze.Maze;


 public class Game {


    public static void main(String[] args) {
        boolean playerOnline = true;

            Player player = new Player();
            Monster monster = new Monster();
            Maze maze = new Maze();
        System.out.println("Escape the monster, get to the door( / )  use (w, a, s, d) to move");

        while (playerOnline){
            maze.place(player);
            maze.place(monster);
            maze.printMaze();

            player.creatureMovement(maze);
            monster.creatureMovement(maze);


            if(player.posistionX() == monster.posistionX() && player.posistionX() == monster.posistionX()){
                System.out.println("gameOver try again");
                playerOnline = false;
            }
        }


    }
}