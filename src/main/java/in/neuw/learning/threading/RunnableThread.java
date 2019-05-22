package in.neuw.learning.threading;

/**
 * Created by Karanbir Singh on 5/22/2019.
 **/
public class RunnableThread implements Runnable {

    private int num;

    private boolean doStop;

    public synchronized void doStop() {
        this.doStop = true;
        System.out.println("Exiting the RunnableThread");
    }

    private synchronized boolean keepRunning() {
        return this.doStop == false;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("Running the RunnableThread run method!");
            for (int i = 0; i < 10; i++) {
                try {
                    System.out.println(i);
                    Thread.sleep(3 * 1000);
                    if (num == i) {
                        this.doStop();
                        break;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
