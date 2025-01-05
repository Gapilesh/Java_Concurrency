# Producer-Consumer Problem - Synchronization in Java

Implement the classic Producer-Consumer problem in Java using synchronized methods or blocks to ensure proper synchronization. Clearly demonstrate the shared buffer, the producer, and the consumer threads. Include proper handling of buffer size and use wait and notify mechanisms
*************************************************************************************************

In the given scenario
• The SharedBuffer class represents the shared buffer with methods produce and consume.
• The Producer class represents the producer thread that adds items to the buffer.
• The Consumer class represents the consumer thread that removes items from the buffer.
• The wait and notify mechanisms are used to synchronize the access to the shared buffer.
• The buffer has a maximum size (maxSize), and the producer waits when the buffer is full, while the   consumer waits when the buffer is empty.
• The Thread.sleep statements are used to simulate the production and consumption of items over time.
• This example demonstrates proper synchronization to avoid issues like race conditions and deadlock   in a producer-consumer scenario.
