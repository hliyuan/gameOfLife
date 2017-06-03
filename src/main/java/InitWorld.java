/**
 * Created by lenovo on 2017/6/3.
 */
public class InitWorld {
    private static final int HEIGHT = 15;
    private static final int  WIDTH = 15;

    private String[][] world = new String[HEIGHT][WIDTH];

    public static final String ALIVE = "11 ";
    public static final String DEATH = "0  ";

    public InitWorld() {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j <  WIDTH; j++) {
                world[i][j] = DEATH;
            }
        }

        world[3][4] = world[3][5] = world[3][6] = ALIVE;
        world[10][4] = world[10][5] = world[10][6] = world[11][6] = world[12][5] = ALIVE;

    }


    public String[][] getWorld() {
        return world;
    }

    public void setWorld(String[][] world) {
        this.world = world;
    }
}
