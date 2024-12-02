public class Main {
    public static void main(String[] args) throws InterruptedException {

        //Method 1 - Creating a thread by creating the subclass of a thread class
        MyThread thread1 = new MyThread();      //Creating an instance of MyThread in the main class.

        /* Method 2 - Create an instance of a class that implements the runnable interface
       and then can pass the instance within the constructor of a thread object. */
        //Creating an instance of MyRunnable

        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);     // send this runnable1 as an argument within the constructor


        //Daemon threads are background threads or Non-User threads
        // thread1.setDaemon(true);
        // thread2.setDaemon(true);

        thread1.start();
        thread1.join();         //the main thread will wait until thread 1 is finished and it's going to continue with rest of the program.
        thread2.start();
    }
}