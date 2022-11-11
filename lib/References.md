# References for Study


## Type of Comments
1. //		: Only One Line Comments
2. /* */	: Couple of Lines Comments
3. /** */	: Documentation Comments ("doc comments")
(These comments extracted by tool)


## Named Constants
- created as static and final


## Unicode Characters
- Most programming language are limited by ASCII character set
- Unicode charaters are 16 bits. so it can express more characters


## Members
- class has three kinds of members
Fields, Methods, Classes and interfaces(others)


## new keyword
- Create Object by instantiation
- Objects aloocated in heap
- Objects have own object references
- instance variables are
unique copy of each object 


## Staic or Class Fields
- static shared among all objects of that class
(known as class variables)


## Garbage Collector
- stop referring not used object automatically
(instanced object allocated in heap memory area)
- maybe GC works when good to work


## Methods and Parameters
- Writer says that using access modifier can help prevent
other object's manipulating inner data
(i thought access modifier is used for prevent programmer)
- A method can return a single value,
to return more than one value
must create object to hold values
- this.x refers to the object's x field
- static methods are used to act functionality in the class itself
- in general, static methods perform class-related tasks
and non-static methods perform object-related tasks


## Arrays
- array is a collection of variables all of the same type
- use new keyword when initialized
- length fixed when it created and never change
- IndexOutOfBoundsException can occur


## String Objects
- String is sequences of character
- remain that String is Array of char
- String objects are read-only, or immutable
> the contents of a String never change
>> when use operator, make a new value

- StringBuffer class provides for mutabvle strings
- str.equals : compare two String
> String is not primitive type. so compare with '=' operator means,
>> comparison of object's references


## Extending a Class
- superclass, subclass, override
- new extended class inherits all the fields and methods of the superclass




## Keywords(don't know)
- instanceof
- native
- synchronized
- transient
- volatile

