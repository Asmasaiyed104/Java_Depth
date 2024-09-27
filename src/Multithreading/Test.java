package Multithreading;

public class Test extends Thread {

    @Override
    public void run(){

    }

    public static void main(String[] args) {
        Test t = new Test();
        t.start();
    }
}
