package Multithreading;
class MyThread extends Thread{
    @Override
    public void run(){

        // thread task

    }

}
public class Test2 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
