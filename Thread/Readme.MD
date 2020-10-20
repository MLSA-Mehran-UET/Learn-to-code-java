# **Java Thread Handling**

##### **Usage:**

if program needs to multiple things on same time, Thread is best defined way for it. Thread can be run as application background level and it will not be effected to main thread.

##### **Creating Thread:**

There are two ways to define threads on java. 
**_FirstThread_** and _**SecondThread**_ classes are used for thread definition.
1. Creating thread by extends Thread class.
2. Creating thread by implementing Runnable interface.

There is a method which is called **_Run()_** , it is used for defining thread body.
Thread can start calling **_start()_** method.

##### Concurrency Handling.

If global value is modified by multiple threads, 
we have to handle concurrency of thread.
Please, refer ConcurrencingHandlingDemo class result.
**_isLive()_** method is used for identifing whether thread is still running or not. 
if thread is finished , we have to send updated value to main method and main method should be waited until custom thread is finished.