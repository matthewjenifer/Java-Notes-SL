package notespackage2;
// THREADS

// The other way of creating threads is implementing the Runnable interface. Implement the run() method. Then, create a new Thread object, pass the Runnable class to its constructor, and start the Thread by calling the start() method.

class Loader implements Runnable { 

    public void run() {
            System.out.println("Hello");
    }
}

public class ThreadsRunnable {
    public static void main(String[] args) {
        Thread t = new Thread(new Loader());
        t.start();

        //The Thread.sleep() method pauses a Thread for a specified period of time. For example, calling Thread.sleep(1000); pauses the thread for one second. Keep in mind that Thread.sleep() throws an InterruptedException, so be sure to surround it with a try/catch block. | It may seem that implementing the Runnable interface is a bit more complex than extending from the Thread class. However, implementing the Runnable interface is the preferred way to start a Thread, because it enables you to extend from another class, as well.

    }
}
