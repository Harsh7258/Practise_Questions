// code where a deadlock can potentially occur between two threads trying to acquire two locks in different order
public class QuesE {

    static Object lockA = new Object();
    static Object lockB = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized (lockA) {
                System.out.println("Thread 1 locked A");

                synchronized (lockB) {
                    System.out.println("Thread 1 locked B");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lockB) {
                System.out.println("Thread 2 locked B");

                synchronized (lockA) {
                    System.out.println("Thread 2 locked A");
                }
            }
        });

        // to prevent deadlock, we can enforce a consistent lock order
        // Here, both threads will try to lock lockA first, then lockB
        // Thread t2 = new Thread(() -> {
        // synchronized (lockA) {
        // System.out.println("Thread 2 locked A");

        // synchronized (lockB) {
        // System.out.println("Thread 2 locked B");
        // }
        // }
        // });

        t1.start();
        t2.start();
    }
}
