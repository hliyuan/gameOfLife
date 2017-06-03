/**
 * Created by lenovo on 2017/6/3.
 */
public class ChangeWorld {

    public static boolean cellState(int x, int y,String[][] world) {
        if (x < 0 || x >=  world.length || y < 0 || y >= world[0].length || world[x][y].equals(InitWorld.DEATH)) return false;
        return true;
    }

    public static int getAliveNeighborsNumber(int x, int y,String[][] world) {
        int numbers = 0;

        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (i == x && j == y) continue;
                if (cellState(i, j,world)) numbers++;
            }
        }

        return numbers;
    }

    public static String[][] changeWorld(String[][] world) {
        String[][] newWorld = new String[ world.length][ world[0].length];
        for (int i = 0; i <  world.length; i++) {
            for (int j = 0; j <  world[0].length; j++) {
                if (getAliveNeighborsNumber(i, j,world) == 3) newWorld[i][j] =InitWorld.ALIVE;
                else if (getAliveNeighborsNumber(i, j,world) == 2 && world[i][j].equals(InitWorld.ALIVE))
                    newWorld[i][j] = InitWorld.ALIVE;
                else newWorld[i][j] = InitWorld.DEATH;
            }
        }
        world=newWorld;
        return world;
    }
}
