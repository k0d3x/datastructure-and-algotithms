package com.akhan.dsa.ds1.stack;

/*
* @author Ameer Ali Khan(k0d3x)
*/
public class Stack {
    /*
     * if MAX = 6
     *  ___
     * |___| <-- index 5 <-- top
     * |___| <-- index 4
     * |___| <-- index 3
     * |___| <-- index 2
     * |___| <-- index 1
     * |___| <-- index 0
     */


    private static final int DEFAULT_MAX = 16;

    private int[] stackArray;
    private int top = -1;
    private int max;

    public Stack(){
        this(DEFAULT_MAX);
    }

    public Stack(int size){
        stackArray = new int[size];
        max = size;
    }

    public int pop(){
        if(isEmpty())
            throw new RuntimeException("Stack is Empty!");
        int value = stackArray[top];
        top--;
        return value;
    }

    public void push(int value){

        if(isFull())
            throw new RuntimeException("Stack is Full!");
        top++;
        stackArray[top] = value;
    }

    public boolean isEmpty(){
        return (top == -1)? true :false;
    }

    public boolean isFull(){
        return (top == max -1 ) ? true : false;
    }

    public int size(){
        return (top == -1)? 0:top+1;
    }

    public void display(){
        String message = "There are %s numbers of elements in stack as follows:";
        System.out.println(String.format(message, size()));
        for (int i = top; i>-1; i--) {
            System.out.println(stackArray[i]);
        }
    }

}
