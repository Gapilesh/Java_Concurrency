# Thread Life Cycle - Understanding Thread States 

Write a Java program that illustrates the life cycle of a thread. Include code segments for each thread state (NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, and TERMINATED). Use appropriate sleep and synchronization methods to control the thread's state transitions. 
****************************************************************************************************

In this program:

The thread starts in the NEW state when it is created.
It transitions to the RUNNABLE state when start() is called.
It enters the BLOCKED state when it tries to access a synchronized block.
It enters the WAITING state when it calls wait() and waits for a notification.
It enters the TIMED_WAITING state when it calls sleep() for a specific duration.
Finally, it enters the TERMINATED state when the run() method completes.
