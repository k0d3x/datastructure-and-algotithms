# Stack Data Structure

A stack data structure is linear data structure that allows insertion and deletion of items from one place called top.
Stack follows **LIFO** principle which means **Last in First out**.

The basic concept of Stack can be visualized by thinking about a stack of plate or stack of books.

### Basic Operations of Stack
* Push: Add an element to the top of a stack
* Pop: Remove an element form the top of a stack
* isEmpty: To check if a stack is empty. A Stack is said to be in Underflow state if it is completely empty
* isFull: To check is a stack is full. A Stack is said to be Overflow if it is completely full
* Peek: To get the value of the top element of the stack without removing it

## Algorithm for Push Operation
* Step 1:  IF TOP&nbsp;=&nbsp;MAX -1 <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; PRINT "Overflow" <br/>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Goto Step 4 <br/>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[END OF IF] <br/>

* Step 2:  SET TOP&nbsp;=&nbsp;TOP + 1 <br />
* Step 3:  SET STACK[TOP]&nbsp;=&nbsp;VALUE <br />
* Step 4:  END <br />

## Algorithm for Pop Operation
* Step 1:  IF TOP&nbsp;=&nbsp;-1 <br />
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; PRINT "Underflow" <br/>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Goto Step 4 <br/>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[END OF IF] <br/>

* Step 2:  SET VALUE&nbsp;=&nbsp;STACK[TOP] <br />
* Step 3:  SET TOP&nbsp;=&nbsp;TOP - 1 <br />
* Step 4:  END <br />