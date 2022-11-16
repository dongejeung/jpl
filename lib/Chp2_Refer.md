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


## this
- this refers to the current object on which the method was invoked.
- commonly used as a way to pass a reference to the current object as a parameter to other methods.
- An implicit this is added to the beginning of any field or method reference inside a method if it is not provided by the programmer.


## Overloading Methods
- signature, number and types of its parameters.
- overloading : two methods have the same name but have different signature.


## Static Members
- class members: fields, methods, and types.
- A static member is a member that is only one per class.
- (static) initializer (block) :
1. 해당 클래스의 객체를 생성할 때.
2. 해당 클래스의 static 멤버에 최초로 접근할 때 한 번 실행이 된다. 이 경우는 해당 클래스의 객체를 생성하지 않았을지라도 해당 클래스의 멤버에 최초 접근시 정적 초기자가 실행이 된다.
3. 정적 초기자는 생성자 이전에 실행이 된다.
4. 클래스 로딩시에 호출.
5. 인스턴스 변수나 인스턴스 메소드에 접근 못함.
(기타 특징은 p.45 부터 참조.)

- A static method might perform a general task for all objects for the class
- A static method can access only static variables and static methods of the class.
- Outside a class, a static member is usually accessed by using the class name rather than through an object reference.


## Initialization Blocks
- instance initializer block : 
1. 객체 생성시 호출
2. super 생성자 이후에 실행됨.
3. 생성자보다 먼저 실행됨.
4. 생성자의 공통 코드를 여다 넣으면 코드 절약됨.
5. 형태는 { contents } => 의 형태

- static initializer block :
1. class 로딩시에 한 번만 호출
2. static 변수와 static 메서드만 접근 가능.
(아직 instance 되기 전이라 그런 듯.)
3. 형태는 static { contents } 의 형태


## Garbage Collection and finalize
- You create objects using new, but there is no corresponding delete.
- creating and collecting large numbers of objects can interfere with time-critical applications.
You should design systems to be judicious in the number of objects they create to reduce the amount of garbage to be collected.
- garbage collection is not a guarantee that memory will always be available for new objects.
- 레퍼를 고려한 디자인을 통하여 garbage collecting 이 이루어지도록 설계해야 함.


## finalize = 안쓰고 = null; 등으로 대체하는 게 좋을 듯. 자바 일정 버전에서 java.lang.ref 패키지에 Clenaer 클래스가 추가
- Finalize method that is executed before an oject's space is reclaimed.
- Finalize method gives you a chance to use the state contained in the object to reclaim other non-Java resources.
- ex) open file.
code example :
protected void finalize() throws Throwable {
	try {
		close();
	} finally {
		super.finalize();
	}
}

cf) close 두 번 이상 쓸 땐 주의요함.

- super.finalize(); 를 호출하지 않는다면,
superclass's 의 finalize 는 실행되지 않음.
항상 붙이는 걸 습관화하는 게 좋겠음.

- Java 에서 finalize 는 실행을 보장하지도 않아서, = null; 로 대체하는 걸 권하는 글을 봄.
- GC 의 대상이 될 때 호출된다고 하니. 타이밍 알 수 없음.


## Resurrcting Objects during finalize
- omit


## Nested Classes and Interfaces
- Nested classes and interfaces are part of the contract or implementation of their enclosing type, and they have the same accessibility choices as other members.
- BankAccount.Permissions.
(Permissions 는 BankAccount 의 nested class 이다.)
- importing bank.* imports only the top-level classes of the package bank so you can use BankAccount as a short name but not BankAccount.Permissions.
- An enclosing object is associated with the object as a sort of "outer this" reference.
ex) lastAct = this.new Action("deposit", amount);
- A nested class can use other members of its enclosing class including private fields--without qualification because it is part of the enclosing class's implementation.
- a static nested class can directly access only static members of the enclosing class.
- Nested interfaces are always static because an enclosing object reference is inherently part of an implementation and interfaces have no implementation.
(이거 뭔 소린지 잘 모르겠네. 구글링 하니까 nest non static interface 가 있긴한데..)
=> 중첩 인터페이스들의 경우는 항상 static이다. 왜냐하면 감싸고 있는 object reference 가 선천적으로 구현의 일부이고 인터페이스들은 구현을 가지고 있지 않다.
뭔 말인지 잘 모르겠는데 일단 넘어가자.. ㅋㅋ

- If class X encloses class Y which encloses class Z, code in Z can explicitly access fields of X by using X.this.
- Inner classes cannot have static members.
- Recommend nesting only one level under most circumstances.





 
