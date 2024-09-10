package Threads;

public class Mythrd implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Number is:- " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}
