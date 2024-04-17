package ThreadExamples;

public class ThreadDemo extends Thread {

    public void run() {
        int a = 10, b = 20;[]
        int c = a + b;
        System.out.println("Thread is running");
        System.out.println("Addition: " + c);
    }

    public static void main(String[] args) {

        ThreadDemo th = new ThreadDemo();
        th.start();
    }

}
