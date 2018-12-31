package in.neuw.learning.multithreading;

import static java.lang.Thread.sleep;

/**
 * Created by Karanbir Singh on 11/6/2017.
 **/
public class OddEvenDemo {

    public int x = 0;

    public static void main(String[] args) {
        Thread even = new Thread(new Even());
        even.start();

        Thread odd = new Thread(new Odd());
        odd.start();
    }

}

class Odd implements Runnable{
    @Override
    public void run() {
        for(int i = 1 ; i <= 10 ; i = i+2 ){
            System.out.println(i);
            /*try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }
}

class Even implements Runnable {
    @Override
    public void run() {
        for(int i = 0 ; i <= 10 ; i = i+2 ){
            System.out.println(i);
            /*try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }
}