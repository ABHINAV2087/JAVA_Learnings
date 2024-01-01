### Object Initialization

the word initialization means setting the data members of an object with some value other than default values at the time of of creation of the object and in java we have 3 ways to initialize an object

1. explicit initialization

2. intialization using constructor

3. using initializer blocks


#### 1. explicit initialization

```java
class <class_name>
{
    <access mod> <data type> <var_name> = <value>
    <access mod> <data type> <var_name> = <value>
    .
    .
    .
     
}
```

### <U>Constructor</U>

In java just like many other object oriented lang we have constructors which are special member functions or methods of a class with the following important features :

1. their name is exactly same as the name of their class 
2. they do not have return type ,  not even void also they do not return any value
3. they are automatically called by java as soon as the object of a class gets created . since in java object creation happens at runtime so we can say that constructor calling in java happens ar runtime 
4. In java , if we mention the return type of a constructor then although the compiler will not give any error but java will not consider it to be a constructor any more . Rather it will be considered as a normal instance method and will not be called on object creation
5. if a programmer does not define any constructor himself in the class then the java compiler automatically inserts a special consrtuctor in our class which is called as default constructor
