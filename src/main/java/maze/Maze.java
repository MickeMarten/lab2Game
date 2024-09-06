package maze;
import creature.Monster;
import creature.Player;
import items.Treasure;



public class Maze implements Placement<Object> {
    private final int[][] maze;




    public Maze() {
        this.maze = new int[][]{
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 1, 0, 0, 0, 0, 0, 5},
                {1, 0, 0, 1, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 1, 1, 1, 0, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 0, 1, 1, 1, 1, 1}

        };

    }

    public boolean isWall(int x, int y) {
        if (maze[y][x] == 1) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public void place(Object element) {
        if(element instanceof Player){


        int posX = ((Player) element).posistionX();
        int posY = ((Player) element).posistionY();

        if (posY >= 0 && posY < maze.length && posX >= 0 && posX < maze[0].length) {
            maze[posY][posX] = 2;
        } else {
            System.out.println("You have placed player outside of the map");
        }
        }
        else if(element instanceof Monster){
                int posX = ((Monster) element).posistionX();
                int posY = ((Monster) element).posistionY();
                maze[posY][posX] = 3;

        } else if(element instanceof Treasure){
            Treasure treasure = new Treasure();

            treasure.getItemList().forEach(item -> {
               int posX = item.posistionX();;
               int posY = item.posistionY();
                maze[posY][posX] = 4;
            });
//


        }

    }



    public void printMaze() {
        for (int[] row : maze) {
            for (int col : row) {
                if (col == 1) {
                    System.out.print("#");
                } else if (col == 2) {
                    System.out.print("P");


                } else if (col == 3) {
                    System.out.print("M");
                } else if(col == 4){
                    System.out.print("T");
                } else if(col == 5){
                    System.out.print("/");
                }

                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
