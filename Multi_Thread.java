/*  Multithreading : Running multiple threads (small units of a program) at the same time.
                     Helps Maximize utilization of CPU
                     Threads are independent they don't affect the execution of other threads
                     An e  exception in one thread will not interrupt other threads

                     Useful for serving multiple clients, multiplayer games, or  independent task
*/

public class Multi_Thread {
    public static void main(String[] args) throws InterruptedException {


        MyThreader thread1 = new MyThreader();  // 1 Way To Create Thread

        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);  // Another way to Create Thread

//        thread1.setDaemon(true);  // daemon thread in background to collection of garbage
//        thread2.setDaemon(true);

        thread1.start();
//        thread1.join(3000);  // it will wait for specific thread to complete at specific times
        thread2.start();

//        System.out.println(1/0);  // Even if error occurs in main, still it won't affect other thread



    }
}

class MyThreader extends Thread{

    @Override
    public void run() {

        for (int i=1; i<10; i++){

            System.out.println("Thread #1 : " + i);
            try {
                Thread.sleep(1000); // Delay
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread #1 Completed! ");

    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {

        for (int i=1; i<10; i++){

            System.out.println("Thread #2 : " + i);
            try {
                Thread.sleep(1000); // Delay
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            System.out.println(1/0);  // Even if error occurs it won't affect other thread
        }
        System.out.println("Thread #2 Completed! ");

    }
}