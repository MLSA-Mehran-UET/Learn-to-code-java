Immutable Strings in java ------>>>>>>>  Immutability of an object ,simply put is its virtue by which it can't be changed once it is created or initialized.  That implies , when we create a string object in java, it is allocated some memory location in the memory heap , and even when you modify the contents of this objects later on, the actual object still remains in the memory .

e.g. 

String test = "this is a test"; //creates a string object in the memory 

//now if we modify this
// it will create another object with different value rather than changing the contents which were initially present

test = "this test is now changed";  
 

so , what can we do about this? 
well java provides you with another classes StringBuilder and StringBuffer ,which allow you to create mutable(change state of original object) 


<<<<<<<<<<----------------------------------StringBuilder and StringBuffer----------------------------------------->>>>>>>>>

# The StringBuilder in Java represents a mutable sequence of characters. Since the String Class in Java creates an immutable sequence of characters, the StringBuilder class provides an alternative to String Class, as it creates a mutable sequence of characters. 

# The function of StringBuilder is very much similar to the StringBuffer class, as both of them provide an alternative to String Class by making a mutable sequence of characters. 

# However the StringBuilder class differs from the StringBuffer class on the basis of synchronization i.e StringBuffer is thread safe. The StringBuilder class provides no guarantee of synchronization whereas the StringBuffer class does.

# Therefore StringBuilder class is designed for use as a drop-in replacement for StringBuffer in places where the StringBuffer was being used by a single thread (as is generally the case). Where possible, it is recommended that this class be used in preference to StringBuffer as it will be faster under most implementations. 


Where should you use each of them ?

As instances of StringBuilder are not safe for use by multiple threads so if such synchronization is required then it is recommended that StringBuffer should be used. 
otherwise you can go with Simply StringBuilder where only one thread works upon some char sequence or strings, because there is no need for extra thread sync. in single threaded environment 
