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
            Maze maze = new Maze();
            Treasure treasure= new Treasure();


        System.out.println("Escape the monster, get to the door( / )  use (w, a, s, d) to move");

        while (playerOnline){
            maze.place(treasure);
            System.out.println("Number of treasures: " + treasure.getItemList().size());

            maze.place(player);
            maze.place(monster);
            maze.printMaze();


            player.creatureMovement(maze);
            monster.creatureMovement(maze);


            treasure.getItemList().forEach(item ->{
                System.out.println(item.posistionX() + item.posistionY());
                if(item.posistionY() == player.posistionY() && item.posistionX() == player.posistionX()){
                    System.out.println("You have found" +" "+ item.quantity() + " " + item.name());
                }

            });



            if(player.posistionX() == monster.posistionX() && player.posistionX() == monster.posistionX()){
                System.out.println("gameOver try again");
                playerOnline = false;
            }
        }




    }
}