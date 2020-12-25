package com.akhan.dsa.ds1.stack;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----Stack DataStructure Demo-----");

        Stack numberStack = new Stack(5);
        numberStack.push(5);
        numberStack.push(4);
        numberStack.push(3);
        numberStack.push(2);
        numberStack.display();

        System.out.println("Now lets pop one");
        numberStack.pop();
        numberStack.display();

        System.out.println("Now lets pop all elements");
        int size = numberStack.size();
        for(int i = 0 ; i < size; i++){
            numberStack.pop();
        }
        System.out.println("After poping all elements lets check our stack");
        numberStack.display();
    }
}
