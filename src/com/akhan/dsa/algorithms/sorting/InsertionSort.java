package com.akhan.dsa.algorithms.sorting;

/*Insertion sort works similarly as we sort cards in our hand in a card game.
We assume that the first card is already sorted then, we select an unsorted card.
If the unsorted card is greater than the card in hand, it is placed on the right
otherwise, to the left. In the same way, other unsorted cards are taken and
put at their right place.A similar approach is used by insertion sort.
Insertion sort is a sorting algorithm that places an unsorted element at its suitable
place in each iteration.*/
public class InsertionSort  {

    /*----Sorting in ascending order----
    Initial Array is :
            [ 9 ]--[ 2 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 8 ]--[ 1 ]
    Performing Sorting :
            [ 2 ]--[ 9 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 8 ]--[ 1 ]
            [ 2 ]--[ 7 ]--[ 9 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 8 ]--[ 1 ]
            [ 2 ]--[ 6 ]--[ 7 ]--[ 9 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 8 ]--[ 1 ]
            [ 2 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 9 ]--[ 4 ]--[ 3 ]--[ 8 ]--[ 1 ]
            [ 2 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 9 ]--[ 3 ]--[ 8 ]--[ 1 ]
            [ 2 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 9 ]--[ 8 ]--[ 1 ]
            [ 2 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]--[ 1 ]
            [ 1 ]--[ 2 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]
    Final Output :
            [ 1 ]--[ 2 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]*/
    public static void sortAscending(int[] array){
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i -1;
            while(j>=0 && key < array[j]){
                array[j+1] = array[j];
                --j;
            }
            array[j+1] = key;
            log(array);
        }
    }

    public static void sortDescending(int[] array){
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i -1;
            while(j>=0 && key > array[j]){
                array[j+1] = array[j];
                --j;
            }
            array[j+1] = key;
            log(array);
        }
    }

    /*----Sorting in descending order----
    Initial Array is :
            [ 1 ]--[ 2 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]
    Performing Sorting :
            [ 2 ]--[ 1 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]
            [ 3 ]--[ 2 ]--[ 1 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]
            [ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]
            [ 5 ]--[ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]
            [ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]--[ 7 ]--[ 8 ]--[ 9 ]
            [ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]--[ 8 ]--[ 9 ]
            [ 8 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]--[ 9 ]
            [ 9 ]--[ 8 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]
    Final Output :
            [ 9 ]--[ 8 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]*/
    static void log(int array[]){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < array.length; i++){
            sb.append(String.format("[ %s ]--",array[i]));
        }
        sb.replace(sb.length()-2,sb.length(),"");
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        int[] initialArray = {9,2,7,6,5,4,3,8,1};
        System.out.println("----Sorting in ascending order----");
        System.out.println("Initial Array is : ");
        log(initialArray);
        System.out.println("Performing Sorting : ");
        sortAscending(initialArray);
        System.out.println("Final Output : ");
        log(initialArray);

        System.out.println();

        System.out.println("----Sorting in descending order----");
        System.out.println("Initial Array is : ");
        log(initialArray);
        System.out.println("Performing Sorting : ");
        sortDescending(initialArray);
        System.out.println("Final Output : ");
        log(initialArray);
    }
}
