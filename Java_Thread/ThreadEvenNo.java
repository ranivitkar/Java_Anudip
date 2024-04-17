package Thread;

public class ThreadEvenNo extends Thread{

    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        ThreadEvenNo e = new ThreadEvenNo();
        e.start();

    }

}
