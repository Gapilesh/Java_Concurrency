#Thread Implementation - Java Threads 

Implement a Java program using the Thread class to demonstrate the concept of different ways of implementing threads
***********************************************************************************************

Compare the usage of extending the Thread class and implementing the Runnable interface. Include comments explaining the advantages and disadvantages of each approach. 

  Advantages and Disadvantages:

  Extending Thread class:
  Advantages:
  Simplicity: It is straightforward and easy to implement as you only need to extend the Thread class and override the run method.
  Direct access to thread-specific methods: Since the class itself is a thread, it can directly access the methods like getId(), getName(), etc.
  Disadvantages:
  Limited flexibility: Java does not support multiple inheritance, so if your class is already extending another class, it cannot extend Thread as well.
  Less reusable: Since your class is tied to the Thread class, it becomes less reusable in scenarios where you want the class to be used in a non-threaded context.
  
  Implementing Runnable interface:
  Advantages:
  Improved flexibility: Since Java supports multiple interfaces, a class can implement Runnable and still extend another class, providing better flexibility.
  Enhanced reusability: The class is not bound to the Thread class, making it more reusable in various scenarios.
  Disadvantages:
  Indirect access to thread-specific methods: Since the class is not a thread itself, it needs to be passed to a Thread constructor, which may make accessing thread-specific methods less straightforward.
  Slightly more code: Implementing the Runnable interface usually requires a bit more code compared to extending the Thread class


