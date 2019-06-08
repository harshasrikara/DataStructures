# DataStructures

This project is designed for practice in creating a variety of data structures in various languages. Currently, all the data structures will be coded in JAVA but eventually examples will be created in C++, C# and Python. All data structures for Java use generics and the same node class.

### Linked List

Development complete.
A linked list is a data structure that has a discontinuous set of values stored in it. Each value in the linked list is paired with a reference pointing to the next item on the linked list. This is different from an array where all the values are stored in consecutive memory addresses and therefore there is no need to point to where the next node is. 

##### Singly

Setting singly linked to true when creating the list will create a nextNode oriented list. Added features will eventually make it singly linked in the opposite direction which will give the illusion of insertion in the back of the linked list.

##### Doubly

Setting singly linked to false when creating the list will make the linked list be connected in both directions allowing traversal both forward and backward. Added feature will allow insertion in the back or front of the list.

##### Circular

Both the singly linked and doubly linked list can be made circular. This ensures that the last node connects to the first node and in the case of the doubly linked list that the first node also connects backwards with the first node.

##### Generic <T>

Setting no value to the generic parameter will set it by default to Object.class. This means that nodes with values of any datatype can be inserted into the linked list. Setting it to a specific class such as Interger.class or String.class will limit the insertion of nodes to only contain that specific datatype. In the event that a node with a different datatype is attempted to be passed through, it will log an error message.

#### Function Documentation

To be added. Will contain an explanation of each function and their role in the linked list as well as future functions that are yet to be incorporated into the design.

###### Constructors
There are 3 constructors for the linked list class. The arguments for those constructors are as follows

`LinkedList()`

`LinkedList(boolean singly, boolean circ)`

`LinkedList(boolean singly, boolean circ, Class<?> T)`

The default constructor and the second one both call the third constructor with default parameters. The default parameters for the 3 main variables are false for both the boolean values and Object.class for the generic. This results in the default linked list being a doubly linked non circular linked list that can accept nodes that contain anything. 

###### Setters/Getters

The boolean values for singly and circular can be changed. This modifies the linked list by adding or removing references from the nodes. The value for count can be found through getCount(). This linked list stores that value instead of dynamically calculating it each time the method is called. For the time being, the value of the generic class <T> stored in teh variable fixedClass cannot be changed after creation. It can only be found by getFixedClass(). 
  
###### Insert

Documentation being written...

###### Remove

Documentation being written...

###### Find

Documentation being written...

###### Filter

Documentation being written...

###### Print Forward/ Print Backward

Documentation being written...

###### Get

Documentation being written...

###### Helper Methods (Not called by main.java) aka Private methods

Documentation being written...

### Tree

##### Binary Tree

##### AVL Tree

##### Heaps
