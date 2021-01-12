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

* <T> indicate that method is generic method.

```ruby
public <T> T getData(T t1, T t2){
	 return t2;
}
Serializable s = getData( "Hello world" , new ArrayList<String>() );
```

