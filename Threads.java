/*
    Process : A process is a whole program running on your computer

    Thread : A thread is a smaller part of a process that can run independently
    Multitasking : Perform multiple tasks simultaneously

    A thread of execution in a program (kind of like a virtual CPU)
    The JVM allows an application to have multiple threads running concurrently
    Each thread can execute parts of you code in parallel with the main thread
    Each thread has a priority.
    Threads with higher priority are executed in preference compared to threads with lower priority

    The Java Virtual Machine continues to execute threads until either of threads of following occurs
      1. The exit method of class Runtime has been called
      2. All user threads have died

    When a JVM starts up, there is a thread which calls the main method
    This thread is called "main"

    Two Types Of Thread
    'Daemon thread' is a low priority thread that runs in background to perform tasks
    such as Garbage collection
    JVM terminates itself when all 'user threads' (non-daemon threads) finish their execution

 */


public class Threads {
    public static void main(String[] args) throws InterruptedException {

/*
        System.out.println(Thread.activeCount());   // To Check How Many Threads Are Active

        Thread.currentThread().setName("Dragon");   // Can Set Name For Running Thread

        System.out.println(Thread.currentThread().getName());   // To Get The Name Of Running Thread


//      Checks the priority On Scale Of 1-10 of the thread,
//      Higher The No. High Priority
//      Lower The No. Low Priority
        Thread.currentThread().setPriority(9);  // Can Set The Priority
        System.out.println(Thread.currentThread().getPriority());

        System.out.println(Thread.currentThread().isAlive());   // Checks If Thread Is Running or Not

        for(int i=3; i>0; i--){
            System.out.println(i);
            Thread.sleep(2000);
        }
        System.out.println("Completed!");                    MUlTI COMMENT  */


//      Create Sub Class of Thread
        MyThread thread2 = new MyThread();

//        thread2.setDaemon(true); // Can set is Daemon or not
        thread2.start();  // Starts The Thread
        System.out.println("Daemon Thread : " + thread2.isDaemon());// to check if its daemon thread or not

        System.out.println("Running Status : " + thread2.isAlive());
        thread2.setName("2nd Thread ");

//      Because it is Inherited, so it will be same priority as main thread
        System.out.println("Priority : " + thread2.getPriority());

        System.out.println("Thread Name : " + thread2.getName());

        System.out.println("Active Threads : " + Thread.activeCount());


    }
}

class MyThread extends Thread{

    @Override
    public void run(){
        if(this.isDaemon()){
            System.out.println("This Is Daemon Thread That Is Running!");
        }
        else{
            System.out.println("This Is User Thread That Is Running!");
        }
    }
}