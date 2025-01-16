Basic Thread Synchronization 

## Write a Java program that creates two threads, ThreadA and ThreadB. Both threads should increment a shared counter variable inside a synchronized method. Ensure that the increment operation is atomic and that the final value of the counter reflects the total increments performed by both threads.

The SharedCounter class contains a counter variable and a synchronized method (increment) that increments the counter. The getCounter method is used to retrieve the current value of the counter.
Both ThreadA and ThreadB instances are created, each with a reference to the shared SharedCounter object.
The run method of each thread increments the counter in a loop (10,000 times in this example) using the synchronized increment method.
The main method creates the shared counter, starts both threads, waits for them to complete using join, and then displays the final value of the counter.
The use of synchronization ensures that the increment operation is atomic, and the final value of the counter represents the total increments performed by both threads.
