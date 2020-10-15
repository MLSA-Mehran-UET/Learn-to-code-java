# Java Recursion


In Java, a method which calls itself is known as a **recursive** **method**. The process of **recursion** provides a technique to break complicated problems down into simple problems which are easier to solve.

For example, here we are using recursion to calculate the factorial (1 x 2 x 3 .. x *n*)of value *n*:

	public static long calculateFactorial(int n) {
		if (n > 0) {
			return n * calculateFactorial(n - 1);
		} else {
			return 1;
		}
	}
	
Notice the first part of the *if* condition contains a **recursive call** which contain a parameter modified to bring it closer to a stop condition.

The *else* statement contains the **stop condition** which returns a value without making any more recursive calls.

Recursion can sometimes help to simplify the implementation of complex problems by making the code easier to read, however it can also require more memory as the memory required increases with each recursive call.

As an alternative, most recursive methods can be rewritten using **iteration**:

    public static long calculateFactorial(int n) {    
        long factorial = 1;
        
        for(int i = 1; i <= n; i++) {
        	factorial = factorial * i;
        }
        
        return factorial;
    }
    
**Useful links**

[w3 schools - recursion](https://www.w3schools.com/java/java_recursion.asp)

[baeldung - recursion](https://www.baeldung.com/java-recursion)