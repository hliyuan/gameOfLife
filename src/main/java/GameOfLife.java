/**
 * Created by lenovo on 2017/6/3.
 */
public class GameOfLife {
    private static final int HEIGHT = 15;
    private static final int WIDTH = 15;

    private char[][] world = new char[HEIGHT][WIDTH];

    private static final char ALIVE = '*';
    private static final char DEATH = ' ';

    public GameOfLife() {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                world[i][j] = DEATH;
            }
        }

        world[3][4] = world[3][5] = world[3][6] = ALIVE;
        world[10][4] = world[10][5] = world[10][6] = world[11][6] = world[12][5] = ALIVE;

    }


    public void print() {
        for (int i = 0; i < HEIGHT; i++) {
            System.out.print(i);
            for (int j = 0; j < WIDTH; j++) {

                System.out.print(world[i][j]);

            }
            System.out.println();
        }

    }


    public boolean cellState(int x, int y) {
        if (x < 0 || x >= HEIGHT || y < 0 || y >= WIDTH || world[x][y] == DEATH) return false;
        return true;
    }

    public int getAliveNeighborsNumber(int x, int y) {
        int numbers = 0;

        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (i == x && j == y) continue;
                if (cellState(i, j)) numbers++;
            }
        }

        return numbers;
    }

    public char[][] changeWorld() {
        char[][] newWorld = new char[HEIGHT][WIDTH];
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (getAliveNeighborsNumber(i, j) == 3) newWorld[i][j] = ALIVE;
                else if (getAliveNeighborsNumber(i, j) == 2 && world[i][j] == ALIVE)
                    newWorld[i][j] = ALIVE;
                else newWorld[i][j] = DEATH;
            }
        }
        world=newWorld;
        return world;
    }

    public void printNextWorld() {
//        char[][] newWorld = changeWorld();
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                System.out.print(world[i][j]);

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GameOfLife gol = new GameOfLife();
        int generation=1;
        for (int i = 0; i <=generation ; i++) {
            gol.changeWorld();
            gol.printNextWorld();
        }

    }

}
