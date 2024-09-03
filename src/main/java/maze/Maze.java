package maze;
import creature.Player;


public class Maze implements PlacementAndCollision {
    private final int[][] maze;


    public Maze() {

        this.maze = new int[][]{
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 0, 1, 1, 1, 1, 1}

        };

    }

    public boolean isWall(int x, int y) {
        return maze[y][x] == 1;
    }



    @Override
    public void placePlayer(Player player) {
        int posX = player.posistionX();
        int posY = player.posistionY();

        if(posY >= 0 && posY < maze.length && posX >= 0 && posX < maze[0].length) {
            maze[posY][posX] = 2;
        } else {
            System.out.println("Return to play area please.");
        }


    }

    public void printMaze() {
        for (int[] row : maze) {
            for (int col : row) {
                if (col == 1) {
                    System.out.print("#");
                } else if(col == 2){
                    System.out.print("P");

                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
