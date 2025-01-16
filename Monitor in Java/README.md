Monitor in Java - Synchronization Mechanisms 

Design a concurrent Java program that utilizes the monitor concept for synchronization. Implement a scenario where multiple threads access a shared resource and demonstrate the use of synchronized methods or blocks to prevent data corruption and race conditions.


The SharedResource class has a counter and a synchronized method (increment) that increments the counter in a thread-safe manner.
The SharedResourceUser class represents threads that use the shared resource. Each thread calls the increment method multiple times.
The synchronized keyword in the increment method ensures that only one thread can execute this method at a time, preventing race conditions and data corruption.


Output may vary due to thread scheduling, but the output will always show that the increments are done in a safe and synchronized manner, avoiding data corruption:

Thread-0 - Before Increment: 0
Thread-0 - After Increment: 1
Thread-0 - Before Increment: 1
Thread-0 - After Increment: 2
Thread-0 - Before Increment: 2
Thread-0 - After Increment: 3
Thread-1 - Before Increment: 3
Thread-1 - After Increment: 4
Thread-1 - Before Increment: 4
Thread-1 - After Increment: 5
Thread-1 - Before Increment: 5
Thread-1 - After Increment: 6

This demonstrates the use of synchronized methods to ensure the proper synchronization of access to shared resources, preventing race conditions and maintaining data integrity.
