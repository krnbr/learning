package in.neuw.learning.threading;

/**
 * Created by Karanbir Singh on 5/22/2019.
 **/
public class RunnableThreadRunner {

    public static void main(String[] args) {
        RunnableThread runnableThread = new RunnableThread();
        runnableThread.setNum(4);

        Thread thread = new Thread(runnableThread);
        thread.start();
    }

}
