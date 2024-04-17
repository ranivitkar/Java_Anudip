package ThreadExamples;

public class PriorityThread extends Thread {

    public void run() {
        System.out.println("Running thread has priority as" + Thread.currentThread().getPriority());

    }

    public static void main(String[] args) {

        PriorityThread p1 = new PriorityThread();
        PriorityThread p2 = new PriorityThread();

        p1.setPriority(Thread.MAX_PRIORITY);
        p2.setPriority(Thread.MIN_PRIORITY);

        p1.start();
        p2.start();
    }

}
