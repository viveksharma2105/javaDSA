package Threads;

public class MainMythrd {
    public static void main(String[] args) {
        Mythrd t1 = new Mythrd();
        Thread thr1 = new Thread(t1);
        thr1.start();
    }
}
