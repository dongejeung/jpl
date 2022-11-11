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
- because of having all components of superclass's one,
inherited class do super's do
- polymorphism(다형성) : single object can have many(poly-) forms(-morph) with extend
- override can be used

- to invoke inherited or super's method both possible(maybe?)
- When you invoke super.method(),
the object runtime system looks back up the inheriance hierarchy
to the first superclass that contains the required method()
(호출하는 메서드가 상위 클래스에 없을 경우 상속 계통도를 한 계단 더 올라가서 탐색함.)

- It's important not the define type but the instanced type is real object's type
ex) Point point = new Pixel();
In that case variable point's actual type is Pixel.
So if you want to invoke super.method(),
you can use point.super().method()
from ancestor class accumulate it's own properties.


- Object Class :
-- all objects are polymorphically of class Object
so Object is the generic type for references that can refer to objects of any class.
(maybe wrapper type also is extended from Object type)
cf) generic : 포괄적인. 이라는 영어 뜻임.
ex) Object oref = new Pixel()
oref = "Some String";
- object class also defines several important methods

예제 1.12 는 귀찮아서 생략.


## Interfaces
- only declarations of its methods
- use with implement keyword
- don't need to use override anotation when implement method
- Interfaces can be extended using the extends keyword


## Exception
- Exceptions can be caught by code farther back on the calling stack
- An exception in Java is an object, with type, methods, and data
- Exception objects are generally derived from the Exception class,
which provides a string field to describe the error
- Java requires all exceptions to be subclsses of the class Throwable,
which is the superclass of Exception

- The paradigm for using exceptions in Java is the try-catch-finally sequence
- Declaring the exceptions that a method throws only those exceptions 
it declared and no others
- Exceptions that are extensions of RuntimeException and Error need not be declared  and are not checked;
they are called unchecked exceptions






## Keywords(don't know)
- instanceof
- native
- synchronized
- transient
- volatile

