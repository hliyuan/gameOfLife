import java.util.Scanner;

/**
 * Created by lenovo on 2017/6/3.
 */
public class Run {
    public static void main(String[] args) {
        InitWorld initWorld = new InitWorld();
        String[][] world = initWorld.getWorld();
        Scanner in = new Scanner(System.in);
        System.out.println("please input the number of iteration: ");
        int generation = in.nextInt();

        for (int i = 1; i <= generation ; i++) {
            System.out.println("the result of "+i+"th generation");
            String[][] nextWorld = ChangeWorld.changeWorld(world);
            OutputWorld.printNextWorld(nextWorld);
            initWorld.setWorld(nextWorld);
            world = initWorld.getWorld();

        }
    }
}
