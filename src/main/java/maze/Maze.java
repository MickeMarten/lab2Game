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

    public boolean cellIsWall(int x, int y) {
        if (maze[y][x] == 1) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public void placeObject(Object element) {
        if(element instanceof Player){


        int posX = ((Player) element).getPosistionX();
        int posY = ((Player) element).getPosistionY();

        if (posY >= 0 && posY < maze.length && posX >= 0 && posX < maze[0].length) {
            maze[posY][posX] = 2;
        } else {
            System.out.println("You have placed player outside of the map");
        }
        }
        else if(element instanceof Monster){
                int posX = ((Monster) element).getPosistionX();
                int posY = ((Monster) element).getPosistionX();
                maze[posY][posX] = 3;

        } else if(element instanceof Treasure){
            Treasure treasure = new Treasure();

            treasure.getTreasureList().forEach(item -> {
               int posX = item.getPosistionX();
               int posY = item.getPosistionY();
                maze[posY][posX] = 4;
            });
//


        }

    }



    public void printMaze() {
        for (int y = 0; y < maze.length; y++) {
            for (int x = 0; x < maze[y].length; x++) {
                int col = maze[y][x];
                if (col == 1) {
                    System.out.print("#");
                } else if (col == 2) {
                    System.out.print("P");
                    maze[y][x] = 0;
                } else if (col == 3) {
                    System.out.print("M");
                    maze[y][x] = 0;
                } else if (col == 4) {
                    System.out.print("T");

                } else if (col == 5) {
                    System.out.print("/");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
