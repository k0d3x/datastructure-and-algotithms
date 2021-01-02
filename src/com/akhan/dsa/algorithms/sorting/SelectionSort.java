package com.akhan.dsa.algorithms.sorting;

/*In computer science, selection sort is an in-place comparison sorting algorithm.
It has an O(n2) time complexity, which makes it inefficient on large lists, and
generally performs worse than the similar insertion sort.
The algorithm divides the input list into two parts: a sorted sublist of items
which is built up from left to right at the front (left) of the list and a sublist
of the remaining unsorted items that occupy the rest of the list.
Initially, the sorted sublist is empty and the unsorted sublist is the entire input list.
The algorithm proceeds by finding the smallest (or largest, depending on sorting order) element
in the unsorted sublist, exchanging (swapping) it with the leftmost unsorted element
(putting it in sorted order), and moving the sublist boundaries one element to the right.
[source][wikipedia]*/
public class SelectionSort {

    /*----Sorting in ascending order----
    Initial Array is :
            [ 9 ]--[ 2 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 8 ]--[ 1 ]
    Performing Sorting :
            [ 1 ]--[ 2 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 8 ]--[ 9 ]
            [ 1 ]--[ 2 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 8 ]--[ 9 ]
            [ 1 ]--[ 2 ]--[ 3 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 7 ]--[ 8 ]--[ 9 ]
            [ 1 ]--[ 2 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]
            [ 1 ]--[ 2 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]
            [ 1 ]--[ 2 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]
            [ 1 ]--[ 2 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]
            [ 1 ]--[ 2 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]
    Final Output :
            [ 1 ]--[ 2 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]*/
    public static void sortAscending(int[] array){

        for (int i = 0; i < array.length-1; i++) {
            int indexOfSmallest = i;
            boolean hasSmallestChanged = false;
            for (int j = i+1; j < array.length; j++) {
                if(array[j] < array[indexOfSmallest]){
                    indexOfSmallest = j;
                    hasSmallestChanged = true;
                }
            }
            if(hasSmallestChanged){
                int temp = array[i];
                array[i] = array[indexOfSmallest];
                array[indexOfSmallest] = temp;
            }
            log(array);
        }
    }

    /*----Sorting in descending order----
    Initial Array is :
            [ 1 ]--[ 2 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]
    Performing Sorting :
            [ 9 ]--[ 2 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 1 ]
            [ 9 ]--[ 8 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 2 ]--[ 1 ]
            [ 9 ]--[ 8 ]--[ 7 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 3 ]--[ 2 ]--[ 1 ]
            [ 9 ]--[ 8 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]
            [ 9 ]--[ 8 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]
            [ 9 ]--[ 8 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]
            [ 9 ]--[ 8 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]
            [ 9 ]--[ 8 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]
    Final Output :
            [ 9 ]--[ 8 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]*/
    public static void sortDescending(int[] array){

        for (int i = 0; i < array.length-1; i++) {
            int indexOfLargest = i;
            boolean hasLargestChanged = false;
            for (int j = i+1; j < array.length; j++) {
                if(array[j] > array[indexOfLargest]){
                    indexOfLargest = j;
                    hasLargestChanged = true;
                }
            }
            if(hasLargestChanged){
                int temp = array[i];
                array[i] = array[indexOfLargest];
                array[indexOfLargest] = temp;
            }
            log(array);
        }
    }

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
