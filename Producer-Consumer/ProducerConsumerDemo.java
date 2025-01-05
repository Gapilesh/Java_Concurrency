import java.util.LinkedList;
import java.util.Queue;

class SharedBuffer {
    private final Queue<Integer> buffer;
    private final int maxSize;

    public SharedBuffer(int maxSize) {
        this.buffer = new LinkedList<>();
        this.maxSize = maxSize;
    }

    // Producer adds an item to the buffer
    public synchronized void produce(int item) {
        while (buffer.size() == maxSize) {
            // Buffer is full, wait for the consumer to consume items
            try {
                System.out.println("Buffer is full. Producer is waiting.");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        buffer.add(item);
        System.out.println("Produced: " + item);

        // Notify the consumer that an item is available
        notify();
    }

    // Consumer removes an item from the buffer
    public synchronized int consume() {
        while (buffer.isEmpty()) {
            // Buffer is empty, wait for the producer to produce items
            try {
                System.out.println("Buffer is empty. Consumer is waiting.");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        int item = buffer.poll();
        System.out.println("Consumed: " + item);

        // Notify the producer that space is available in the buffer
        notify();

        return item;
    }
}

class Producer extends Thread {
    private final SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private final SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            int item = buffer.consume();
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(3);

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
