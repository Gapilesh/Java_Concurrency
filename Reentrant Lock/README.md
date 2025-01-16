Advanced Synchronization - ReentrantLock and Condition 

## Implement a concurrent program using ReentrantLock and Condition to manage multiple threads. Create a scenario where threads need to wait for specific conditions before proceeding. 

## Discuss the advantages of using ReentrantLock and Condition over traditional synchronization methods.
Advantages of using ReentrantLock and Condition over traditional synchronization methods like synchronized blocks/methods:

Fine-grained control: With ReentrantLock, you have more fine-grained control over the locking and unlocking process. You can choose when to acquire and release the lock, providing more flexibility.

Interruptible locking: The ReentrantLock supports interruptible locking. Threads waiting on a lock can be interrupted, allowing for more responsive handling of thread interruptions.

Condition signaling: Condition provides a more expressive way to manage the waiting and signaling process. It allows you to have multiple conditions associated with a single lock, enabling more complex synchronization scenarios.

Try-locking: The tryLock method in ReentrantLock allows you to attempt to acquire the lock without waiting. This can be useful in situations where waiting for a lock indefinitely might not be desirable.

Lock fairness: ReentrantLock provides options for fair locking, ensuring that the longest-waiting thread gets the lock, which can help prevent thread starvation.

While traditional synchronization methods like synchronized are simpler and often sufficient for many scenarios, ReentrantLock and Condition provide additional features and flexibility for advanced synchronization requirements.
