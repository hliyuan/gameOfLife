/**
 * Created by lenovo on 2017/6/3.
 */
public class OutputWorld {
    public static void printNextWorld(char[][] world) {
        for (int i = 0; i <  world.length; i++) {
            for (int j = 0; j <  world[0].length; j++) {
                System.out.print(world[i][j]);

            }
            System.out.println();
        }
    }
}
