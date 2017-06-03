/**
 * Created by lenovo on 2017/6/3.
 */
public class Run {
    public static void main(String[] args) {
        InitWorld initWorld = new InitWorld();
        char[][] world = initWorld.getWorld();
        int generation = 10;
        for (int i = 0; i < generation ; i++) {
            char[][] nextWorld = ChangeWorld.changeWorld(world);
            OutputWorld.printNextWorld(nextWorld);
            initWorld.setWorld(nextWorld);
            world = initWorld.getWorld();

        }
    }
}
