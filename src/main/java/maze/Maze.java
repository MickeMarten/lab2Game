package maze;

public class Maze {
    private final int[][] maze;

    public Maze(){
        this.maze = new int[][] {
                {1, 1, 1, 1, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 1, 0, 1, 1}

        };
    }

    public void printMaze(){
        for(int[] row : maze){
            for(int col : row){
                if(col == 1){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
