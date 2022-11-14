# Chp2 Classes and Objects


- Object-oriented programming strictly separates
the notion of what is to be done from how it is done. 

- class name = type name. variable can be declared with class name.
- declare variable is only make reference.


- class's variables are called fields.
Every object has its own specific instances of these fields.
it means each object has its own unique state.

- static : one instance of a field shared by all objects of class.
=> static fields or class variables.


## Access Control and Inheritance
- modifiers : private / Package(Default) / Protected / Public
- new is instance keyword.(memory on board)
- first java system use GC(Garbage collector) to find free space,
and when not founded new throws an OutOfMemoryError exception.


## Constructors
- one constructor can invoke another constructor
from the same class using the this() invocation as its first executable statement.

- reasons for providing specialized constructors:
- Some classes have no reasonable initial state without parameters.
- Providing an initial state is convenient and reasonable.
- Constructing an object can be a potentially expensive operation,
so you want objects to have a correct initial state when they're created.
- A constructor that isn't public restricts who can create objects using it.

- If you don't provide any constructors,
the language provides a default no-arg constructor that does nothing.


## Methods
- manipulating directly isn't good.
- reference.method(parameter). 
- (modifier) / return type / method name /( (parameters) ) { }
- p.36. there is recursion pattern.
by invoking self.
break when certain variable is null, then return specific variable.
when that variable isn't null, invoke itself infinitely.

I guess Java system's Functional(method) process use Stack Data Structure.
recursion is one of iterating pattern.
To avoid infinite loop use certain flag expression of some statement.
(ultimately that flag's data type is boolean i think)
to unfold function's stacking code can help read codes.
LinkedList has reference chain, so it good to used recursion.

If a method manipulate data have not parametes, it should manipulate fields.
So i can find that fields by tracing declaration of fields.


- method's parameter is a copy of whatever value was being passed as an argument,
and the method can change its parameter's value without affecting values
in the code that invoked the method.
- You should note that when the parameter is an object reference,
the object reference--not the object itself--is what is passed "by value."
Thus, you can change which object a parameter refers to inside the method without affecting the reference that was passed.
But if you change any fields of the object or invoke methods
that change the object's state, the object is changed for every part of the program that holds a reference to it.
Notice that the contents of the object have been modified with a name change,
while the reference bodyRef still refers to the Body object even though the method commonName changed the value of its bodyRef parameter to null.

- 귀찮아서 한글로 쓴다. 메소드의 파라미터로 refer type 사용시에는 
original object 의 reference(주소값) 이 넘어가기 때문에, 값 변경시에는
원본 값 바뀜.
-> 그래서 refer type 의 값 복사 변경 등은 new 로 새로은 object 를 instance 하는
방식으로 쓰는게 맞는 것 같음. 배열의 복사 같은 것을 예로 들면.

- use final keyword on parameter to maintain state of value;
- modifier 는 접근지정자 보다는 식별자?라는 뜻으로 좀 넓은 범위 같음.
=> modifier 는 제어자라는 의미로 접근지정자는 access modifier 였음.


- for read-only you can use getter.
(private field, public getter method)

- 생성자로 field 에 값 할당할 경우에는 field 가 private 라도 되는 듯.
(아 걍 setter 구조랑 똑같네)


- Exer2_11 에 재귀로 LinkedList size 구현에 애를 좀 먹었다. 모양새가 예쁘진않은데.. ㅠㅠ. this.size++ 로 필드의 값을 누산해주는 과정에서,
재귀적으로 호출되어도 디버깅 시에 누산되는 this.size 는 처음 object 의 reference 로 유지가 된다는 것을 확인했다. 이 점을 잘 생각해보면 좋을 것 같다.









