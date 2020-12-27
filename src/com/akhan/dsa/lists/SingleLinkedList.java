package com.akhan.dsa.lists;

public class SingleLinkedList {

    private Node head;
    private int size;

    static class Node{
        int data;
        Node next;

        Node(int n){
            this.data = n;
            this.next = null;
        }
    }

    public boolean insertNodeAtTheEnd(int value){
        Node newNode = new Node(value);
        if(this.head == null){
            this.head = newNode;
            return true;
        }
        Node traversePointer = this.head;
        while(traversePointer.next != null){
            traversePointer = traversePointer.next;
        }
        traversePointer.next = newNode;
        size++;
        return true;
    }

    public boolean insertAtTheBeginning(int value){
        Node newNode = new Node(value);
        newNode.next = this.head;
        this.head = newNode;
        size++;
        return true;
    }

    public boolean insertAtPosition(int position, int value){
        if(position == 0)
            return insertAtTheBeginning(value);
        else if(position >= size)
            return insertNodeAtTheEnd(value);
        else{
            Node newNode = new Node(value);
            Node traversePointer = this.head;
            for(int i = 0; i < position-1; i++){
                traversePointer = traversePointer.next;
            }
            newNode.next = traversePointer.next;
            traversePointer.next = newNode;
            size++;
            return true;
        }
    }
    public void removeLastNode(){
        if(this.head == null)
            return;
        Node traversePointer = this.head;
        Node preLastNode = null;
        while(traversePointer.next != null){
            preLastNode = traversePointer;
            traversePointer = traversePointer.next;
        }
        if(preLastNode != null)
            preLastNode.next = null;
        else
            this.head = null;
        size--;
    }

    public void removeFirstNode(){
        this.head = this.head.next;
        size--;
    }

    public void removeAtPosition(int position){
        if(position == 0)
            removeFirstNode();
        else if(position >= size)
            removeLastNode();
        else{
            Node traversePointer = this.head;
            for(int i = 0; i < position-1; i++){
                traversePointer = traversePointer.next;
            }
            traversePointer.next = traversePointer.next.next;
            size--;
        }
    }

    public int getSize(){
        return this.size;
    }
    @Override
    public String toString(){
        if(this.head == null){
            return "[ ]";
        }
        StringBuilder sb = new StringBuilder();
        Node traversePointer = this.head;
        while(traversePointer != null){
            sb.append("[ ").append(traversePointer.data).append( " ]->");
            traversePointer = traversePointer.next;
        }
        sb.replace(sb.length()-3,sb.length(),"]");
        return sb.toString();
    }
}

class Main{
    static void log(String message){
        System.out.println(message);
    }
    public static void main(String[] args) {
        SingleLinkedList myList = new SingleLinkedList();
        myList.insertAtTheBeginning(2);
        myList.insertNodeAtTheEnd(3);
        myList.insertNodeAtTheEnd(4);
        myList.insertNodeAtTheEnd(6);
        log("My List is : "+myList);
        myList.insertNodeAtTheEnd(5);
        log("My List after inserting at the end is: "+myList);
        myList.removeLastNode();
        log("My List after removing last node is: "+ myList);
        myList.insertAtTheBeginning(1);
        log("My List after inserting at the beginning is: "+myList);
        myList.removeFirstNode();
        log("My List after removing first node is: "+ myList);
        myList.insertAtPosition(3,5);
        log("My List after inserting at position is: "+ myList);
        myList.removeAtPosition(0);
        log("My List after deleting at position is: "+ myList);
        log(String.format("My list has total of %s elements",myList.getSize()));

    }
}
