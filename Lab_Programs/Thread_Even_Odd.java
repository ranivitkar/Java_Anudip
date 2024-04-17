class Even_Odd extends Thread {

    public void run() {
        synchronized (Even_Odd.class) {
            // This if is for checking which thread is calling even or odd
            if (Thread.currentThread().getName().equals("even")) {// if the thread name is even then it is true
                System.out.println("\n*****Even Numbers*****");
                for (int i = 1; i <= 100; i++) {// for loop for the printing odd numbers
                    if (i % 2 == 0) {// checking i is odd or not
                        System.out.print(i + " ");
                    }
                }
            }
            // otherwise
            if (Thread.currentThread().getName().equals("odd")) {// if the thread name is odd then it is true
                System.out.println("\n*****Odd Numbers*****");
                for (int i = 1; i <= 100; i++) {// for loop for the printing even numbers
                    if (i % 2 != 0) {// checking i is even or not
                        System.out.print(i + " ");
                    }
                }

            }

        }
    }
}

class Thread_Even_Odd {

    public static void main(String[] args) {

        Even_Odd even = new Even_Odd();// creating even bject
        even.setName("even");// setting the name as even to this object

        Even_Odd odd = new Even_Odd();// creating odd object
        odd.setName("odd");// setting the name as odd to this object

        odd.start();// running odd thread
        even.start();// running even thread

    }

}
