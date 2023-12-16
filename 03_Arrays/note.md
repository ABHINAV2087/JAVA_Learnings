 # Array

Array is a collection of simlar data types in a continuos memory locations

- In Java Arrays are considered as objects

- Since Arrays are treateda s objects by java so they also are created dynamically

- to create an array we use the keyword new , just like we use to create an object

- since they are dynamically created , so they live on heap area of memory

- because they are dynamic they don't have any name so we require a reference to refer to an array and this reference is called array reference

### Syntax of creating array 
___

Since arrays are objects, we have to create them 2 steps:
1. Creating Array Reference

```java
<data type>[ ] <array_ref_name>;  // This is recommended 

int [] arr // "arr" is a reference to an array of integers


or 


<data type> array_ref_name [ ]; // Although it works but not recommended

```




2. Creating The Actual Array 
```java
<array_ref_name> = new <data type>[ size ]
arr = new int[10]
```
___
```java
 
 int [] arr = new int[10]

```
![Alt text](image.png)
___

Accessing an array 

```java

<array_ref_name>[index_no] = value;
<var_name>  = <array_ref_name>[index_no]

____

int [] arr new int[10]

arr[0] = 25;
arr[1] = 30;
System.out.println(arr[0]);

```