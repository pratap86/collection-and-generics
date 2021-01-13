# collection-and-generics

* WHY GENERICS ARE IMPORTANT : making more of your bugs detectable at compile time !!!
* Generics has many benefits over non-generic code:
  1. stronger type checks at compile time
  2. we can eliminate casting
  3. We can implement generic algorithms, we can reuse them
* Type Inference?

<p>
compiler's ability to look at each method invocation and corresponding declaration to determine the type argument/arguments ( such as T ) that make the invocation applicable - the inference algorithm determines: the types of the arguments + the type that the result is being assigned or returned if available !!! - <b>the inference algorithm tries to find the most specific type that works with all of the arguments</b>
</p>

* diamondoperator of (T) indicate that method is generic method.

```ruby
public <T> T getData(T t1, T t2){
	 return t2;
}
Serializable s = getData( "Hello world" , new ArrayList<String>() );
```
* Here Serializable is fine bcz String is Serializable and Array is also Serializable, so no type cast is required here.
<p>
Because of the type inference algorithm, we can use instantiation like this:

```ruby
List<String> list = new ArrayList<>();
```
Generic methods and type interference:
Enables us to invoke a generic method as you would an ordinary method, without specifying a type between angle brackets
</p>

* WILDCARDS

<p>The problems and the most important fact about generics

```ruby
Collection<String> c1 = new ArrayList<>();
Collection<Object> c2 = c1  it is not valid !!!
String is an Object but a Collection<String> is not a Collection<Object> !!!
So a List<Employee> is not a List<Person> even when the Employee class extends the Person class
```
THIS IS WHY WILDCARDS HAVE CAME TO BE 

```ruby
print(Collection<Object> c)
			for i in c
				print i
```

It is not generic in the sense that we can not print list of integers or list of doubles
or list of custom objects -> we have to cast them to Object before calling that method
COLLECTION OF OBJECT IS NOT A SUPERTYPE OF ALL KINDS OF COLLECTIONS !!!
The supertype of all kinds of collections -> wildcard</p>

<p>

```ruby
print(Collection<?> c)
for i in c:
print i	
```

we can do it we can print out whatever we want, but we cannot insert to that collection whatever we want because we don't know what type will be passed in Sole exception: NULL

```ruby
c.add(new Object()) this will cause compile time error 

public interface Shape() {
	public void draw();
}

class Circle extends Shape {
	draw:
	print "Drawing a circle...";
}
class Rectangle extends Shape {
	draw:
	print "Drawing a rectangle...";
}
drawAll(List<Shape> l)
	for i in l
	i.draw()
```

This is going to work only for Shapes but not for classes that implements that given
Shape interface--> we can not call this method on List<Rectangle> for example
THIS IS WHY BOUNDED WILDCARDS HAVE CAME TO BE !!!
</p>
