package com.akhan.dsa.ds1.queue;

public class Queue {

    /* Default initial capacity */
    private static final int DEFAULT_CAPACITY = 16;

    /* Max size of the queue */
    private int maxSize;
    /* Array to store the elements of the queue */
    private int[] queueArray;
    /* pointer representing front of the queue */
    private int front ;
    /* pointer representing rear of the queue */
    private int rear;
    /* variables representing number of elements in a queue at a given moment */
    private int numberOfElements;

    public Queue(){
        this(DEFAULT_CAPACITY);
    }

    public Queue(int size){
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        numberOfElements = 0;
    }

    public boolean isFull(){
        return numberOfElements == maxSize;
    }

    public boolean isEmpty(){
        return numberOfElements == 0;
    }
    public boolean insert(int value){
        if(isFull()) return false;
        rear = (rear + 1) % maxSize;
        queueArray[rear] = value;
        numberOfElements++;
        return true;
    }

    public int remove(){
        if(isEmpty()) return -1;
        int value = queueArray[front];
        front = (front + 1) % maxSize;
        numberOfElements--;
        return value;
    }

    public int peekFront(){
        return queueArray[front];
    }

    public int peekRear(){
        return queueArray[rear];
    }

    public int getSize(){
        return numberOfElements;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        System.out.println("front is : " + front + " rear is : " + rear);
        if(isEmpty())
            return "[ ]";
        sb.append("[ ");
        for (int i = front;  ; i = ++i % maxSize) {
            sb.append(queueArray[i]).append(", ");
            if(i == rear)
                break;
        }
        sb.replace(sb.length() - 2,sb.length()," ]");
        return sb.toString();
    }
}

class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(4);
        queue.insert(4);
        queue.insert(3);
        queue.insert(2);
        queue.insert(1);
        System.out.println("Is queue full: " + queue.isFull());
        System.out.println("Queue is : " + queue);
        queue.remove();
        System.out.println("Queue after removing is : " + queue);
        queue.insert(4);
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.insert(1);
        System.out.println("Queue is : " + queue);
    }
}
