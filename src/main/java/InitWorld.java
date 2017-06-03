/**
 * Created by lenovo on 2017/6/3.
 */
public class InitWorld {
    private static final int HEIGHT = 15;
    private static final int  WIDTH = 15;

    private char[][] world = new char[HEIGHT][WIDTH];

    public static final char ALIVE = '*';
    public static final char DEATH = ' ';

    public InitWorld() {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j <  WIDTH; j++) {
                world[i][j] = DEATH;
            }
        }

        world[3][4] = world[3][5] = world[3][6] = ALIVE;
        world[10][4] = world[10][5] = world[10][6] = world[11][6] = world[12][5] = ALIVE;

    }


    public char[][] getWorld() {
        return world;
    }

    public void setWorld(char[][] world) {
        this.world = world;
    }
}
