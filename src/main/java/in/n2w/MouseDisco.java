package in.n2w;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.Random;

/**
 * Created by Karanbir Singh on 6/20/2019.
 **/
public class MouseDisco {

    public static void main(String[] args) throws AWTException {
        Robot hal = new Robot();
        Random random = new Random();
        while (true) {
            hal.delay(1000 * 10);
            int x = random.nextInt(1366);
            int y = random.nextInt(768);
            System.out.println("(x,y) : (" + x + "," + y + ") at -> "+ LocalDateTime.now());
            hal.mouseMove(x, y);
        }
    }

}
