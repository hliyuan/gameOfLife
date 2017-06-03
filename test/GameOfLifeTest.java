import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lenovo on 2017/6/3.
 */
public class GameOfLifeTest {
    @Test
    public void changeWorld() throws Exception {
        GameOfLife tmp=new GameOfLife();
        char[][] testWorld=new char[15][15];
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                testWorld[i][j]=' ';
            }

        }
        testWorld[2][5]=testWorld[3][5]=testWorld[4][5]=testWorld[9][5]=testWorld[10][5]=testWorld[10][6]=testWorld[11][4]=testWorld[11][6]='*';
        assertArrayEquals(testWorld,tmp.changeWorld());
    }

}