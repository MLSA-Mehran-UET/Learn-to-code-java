
# Java Loops 

Java provides three ways for executing the loops
- [ ] **for loop**
- [ ] **while loop**
- [ ] **do-while loop**

|               	| When to use                                                                                                                              	|
|---------------	|------------------------------------------------------------------------------------------------------------------------------------------	|
| **for loop**    | If the number of iteration is fixed, it is recommended to use for loop.                                                                  	|
| **while loop**  | If the number of iteration is not fixed, it is recommended to use while loop.                                                            	|
|**do-while loop**| If the number of iteration is not fixed and you must have to execute the loop at least once, it is recommended to use the do-while loop. 	|

---

# For Loop

The general form of the **for loop** can be expressed as follows:
```java
for( initialization; termination; increment/decrement) {
    statement(s)
}
```

**Flowchart:**
> <p >
>   <img src="https://cdn.journaldev.com/wp-content/uploads/2017/10/java-for-loop.png" width="400" height="500">
> </p>

**```Initialization condition```**: The variable in use is initialized and is executed once, as the loop begins. An already declared variable can be used or a new variable can be declared but the scope of this variable is only inside the for loop.

**```Termination Condition```**: It is executed each time to test the condition of the loop. It continues execution until the termination expression evaluates to false. It must return a boolean value either true or false.

**```Statement execution```**: Once the termination condition is evaluated to true, the statement(s) in the loop body are executed.

**```Increment/decrement```**: This expression is invoked after each iteration through the loop. It is used for updating the variable for next iteration.

---

# While Loop

The **while loop** continually executes a block of statements as long as a given condition is true.

The syntax of a while loop is:
```java
while (condition) {
     statement(s)
}
```

**Flowchart:** 
> <p >
>   <img src="https://cdn.journaldev.com/wp-content/uploads/2017/10/while-loop-java.png" width="350" height="400">
> </p>
The condition is evaluated, and must return a boolean value. If the condition evaluates to true, the while statement executes the statement(s) in the while block. The while statement continues testing the condition and executing its block until the condition evaluates to false.

---

# Do-While Loop

The difference between **do-while** and **while** is that **do-while** evaluates its expression at the bottom of the loop instead of the top. Therefore, the statements within the **do** block are always executed at least once.

The syntax of a  do-while loop is:
```java
do {
     statement(s)
} while (expression);
```

**Flowchart:**

> <p >
>   <img src="https://cdn.journaldev.com/wp-content/uploads/2017/10/java-do-while-loop-1.png" width="350" height="400">
> </p>

Sources: 
* [docs.oracle.com](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)
* [javatpoint.com](https://www.javatpoint.com/java-tutorial)
* [journaldev.com](https://www.journaldev.com/7153/core-java-tutorial#core-java-tutorial-8211-getting-started)



