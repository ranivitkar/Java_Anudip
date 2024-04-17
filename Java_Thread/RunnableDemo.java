package ThreadExamples;

class RunnableDemo implements Runnable {

    public void run() {

        System.out.println("Thread is Running");
    }

    public static void main(String[] args) {
        RunnableDemo r = new RunnableDemo();
        Thread t = new Thread(r);
        t.start();

    }
}
