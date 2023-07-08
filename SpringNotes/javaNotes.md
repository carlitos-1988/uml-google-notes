# Introduction Java Notes  

Although Java is object oriented, not all types are objects. It is built on top of basic variable types called primitives.

Here is a list of all primitives in Java:

byte (number, 1 byte)
short (number, 2 bytes)
int (number, 4 bytes)
long (number, 8 bytes)
float (float number, 4 bytes)
double (float number, 8 bytes)
char (a character, 2 bytes)
boolean (true or false, 1 byte)

// Create a string with a constructor
String s1 = new String("Who let the dogs out?");        // String object stored in heap memory
// Just using "" creates a string, so no need to write it the previous way.
String s2 = "Who who who who!";                         // String literal stored in String pool
// Java defined the operator + on strings to concatenate:
String s3 = s1 + s2;

Arrays in Java are also objects. They need to be declared and then created. In order to declare a variable that will hold an array of integers, we use the following syntax:

int[] arr;
Notice there is no size, since we didn't create the array yet.

arr = new int[10];
This will create a new array with the size of 10. We can check the size by printing the array's length:

System.out.println(arr.length);
We can access the array and set values:

arr[0] = 4;
arr[1] = arr[0] + 5;
Java arrays are 0 based, which means the first element in an array is accessed at index 0 (e.g: arr[0], which accesses the first element). Also, as an example, an array of size 5 will only go up to index 4 due to it being 0 based.

int[] arr = new int[5];
//accesses and sets the first element
arr[0] = 4;
We can also create an array with values in the same line:

int[] arr = {1, 2, 3, 4, 5};

There are two kind of loops in Java, for and while.


break and continue
These two keywords help us control the loop from within it. break will cause the loop to stop and will go immediately to the next statement after the loop:

continue will stop the current iteration and will move to the next one. Notice that inside a for loop, it will still run the third section.

Functions
In Java, all function definitions must be inside classes. We also call functions methods. Let's look at an example method

Non static methods
Non static methods in Java are used more than static methods. Those methods can only be run on objects and not on the whole class.

Non static methods can access and alter the field of the object.

Objects
Everything in Java is within classes and objects. Java objects hold a state, state are variables which are saved together within an object, we call them fields or member variables.

When using the keyword private before a variable or a method, it means only the class itself can access the variable or method, when we're using public it means everybody can access it. We usually see constructors defined as public, variables defined as private and methods are separated, some public and some private.

javac MyFirstClass.java
This will create a file called MyFirstClass.class that holds the compiled java code.

To run it, we need to run java with the name of the class as the argument (Not the file!)

