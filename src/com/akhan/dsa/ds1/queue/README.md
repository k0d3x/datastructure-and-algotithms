# Queue Data Structure
Queue is a linear data structure in which element is inserted from one end called **REAR** and removal
of element takes place from **FRONT**.Queue follows **FIFO** principle which means First In First Out,
elements inserted first will be removed first.<br/>
To visualize queue data structure think about real world example like queue outside a ticket counter.

### Basic Operations of Queue
* Enqueue&nbsp;:&nbsp; The process to add an element to the end of the queue
* Dequeue&nbsp;:&nbsp; The process to remove an element from the front of the queue
* isEmpty&nbsp;:&nbsp; To check if a queue is empty or not
* isFull&nbsp;:&nbsp; To check if a queue is full or not
* peekFront&nbsp;:&nbsp; To get the front element of the queue without removing it from the queue
* peekRear&nbsp;:&nbsp; To get the rear element of the queue without removing it from the queue

## Working of Queue
Queue operation works as follows:
* pointer FRONT tracks the first element of the queue
* pointer REAR tracks the last element of the queue
* variable N_ITEMS tracks the number of elements in the queue
* variable MAX that denotes Maximum capacity of the queue  
* initially set FRONT = 0 and REAR to -1 which means queue is empty

### Algorithm for Enqueue
* Step1 : first check if queue is full, end the algorithm if it is full else got Step2
* Step2 : set REAR = (REAR + 1) % MAX ; 
* Step3 : insert element at REAR index, Queue[REAR] = value
* Step4 : increment the N_ITEMS

### Algorithm for Dequeue
* Step1 : first check if queue is empty, end the algorithm if it is empty else got Step2
* Step2 : set VALUE = Queue[FRONT] ;
* Step3 : set FRONT = (FRONT + 1) % MAX ;
* Step4 : decrement the N_ITEMS



