// without using java.util.concurrent package

// Example use of wait() and notify() methods for inter-thread communication
class SharedData {
    int data;
    boolean available = false;

    synchronized void produce(int value) throws InterruptedException {
        while (available) {
            wait();
        }
        data = value;
        System.out.println("Produced: " + data);
        available = true;
        notify();
    }

    synchronized void consume() throws InterruptedException {
        while (!available) {
            wait();
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify();
    }
}

public class QuesC {
    public static void main(String[] args) {

        SharedData sharedData = new SharedData();

        // Producer Thread
        Thread producer = new Thread(() -> {
            try {
                sharedData.produce(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Consumer Thread
        Thread consumer = new Thread(() -> {
            try {
                sharedData.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start(); // 10
        consumer.start(); // 10
    }
}
