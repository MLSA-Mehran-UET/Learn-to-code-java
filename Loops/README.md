# Java Loops

Loops in programming allow a set of instructions to be executed repeatedly until a certain condition is fulfilled. Loops are also known as iterating statements or looping statements.

While programming, sometimes, there occurs a situation when we need to execute a block of code several numbers of times. In general, these statements execute in a sequential manner: The first statement in a function executes first, followed by the second, and so on. But this makes the process very complicated as well as lengthy and therefore time-consuming. Therefore, programming languages provide various control structures that allow for such complex execution statements.

In Java, there are three kinds of loops which are – the for loop, the while loop, and the do-while loop. All these three loop constructs of Java executes a set of repeated statements as long as a specified condition remains true. This particular condition is generally known as loop control. For all three loop statements, a true condition is the one that returns a boolean true value and the false condition is the one that returns the boolean false value.

# Types of Loops in Java

- The for Loop

The for loop in Java is an entry controlled loop that allows a user to execute a block of a statement(s) repeatedly with a fixed number of times on the basis of the test expression or test-condition. This is the easiest to understand Java loops. All its loop-control elements are gathered at one place, on the top of the loop within the round brackets(), while in the other loop constructions of Java, the loop elements are scattered about the program.

**The syntax or general form of for loop is:**

```java
for(initialization expression(s) ; test-expression ; update-expression(s))
{
     // body of the loop
}
```

- The while Loop

The next loop available in Java is the while loop. The while loop is an entry-controlled loop.

**The syntax or general form of while loop is:**

```java
while(test-expression){
	// loop body
}
```

In a while loop, the loop-body may contain a single, compound or an empty statement. The loop repeats while the test expression or condition evaluates to true. When the expression becomes false, the program control passes to the line just after the end of the loop-body code.

- The do-while Loop

Unlike the for and while loops, the do-while loop is an exit-controlled loop which means a do-while loop evaluates its test-expression or test-condition at the bottom of the loop after executing the statements in the loop-body. This means the do-while loop always executes at least once.

**The syntax or general form of do-while loop is:**

```java
do
{
    // statements
} while(test-expression);
```
