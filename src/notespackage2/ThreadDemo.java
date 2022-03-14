package notespackage2;
// THREADS

// Java is a multi-threaded programming language. This means that our program can make optimal use of available resources by running two or more components concurrently, with each component handling a different task. You can subdivide specific operations within a single application into individual threads that all run in parallel.

//There are two ways to create a thread.
class MyClass extends Thread { // Inherit from the Thread class, override its run() method, and write the functionality of the thread in the run() method.
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getId()+" Value "+i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyClass myClass = new MyClass(); // Then  you create a new object of your class and call its start method to run the thread.
        myClass.start(); // When we create the object and call its start() method, the run() method statements execute on a different thread.
        MyClass myClass1 = new MyClass();
        myClass1.start();

        // Every Java thread is prioritized to help the operating system determine the order in which to schedule threads. The priorities range from 1 to 10, with each thread defaulting to priority 5. You can set the thread priority with the setPriority() method.
    }
}
