package com.akhan.dsa.algorithms.sorting;

/*Bubble sort, sometimes referred to as sinking sort, is a simple sorting algorithm that repeatedly
steps through the list, compares adjacent elements and swaps them if they are in the wrong order.
The pass through the list is repeated until the list is sorted. The algorithm, which is a comparison sort,
is named for the way smaller or larger elements "bubble" to the top of the list.[source][wikipedia]*/
public class BubbleSort {

    public static void swap(){

    }


/*    ----Ascending by pushing larger elements to last----
    Initial Array is :
            [ 9 ]--[ 8 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]
    Performing Sorting :
            [ 8 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]--[ 9 ]
            [ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]--[ 8 ]--[ 9 ]
            [ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]--[ 7 ]--[ 8 ]--[ 9 ]
            [ 5 ]--[ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]
            [ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]
            [ 3 ]--[ 2 ]--[ 1 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]
            [ 2 ]--[ 1 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]
            [ 1 ]--[ 2 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]
            [ 1 ]--[ 2 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]
    Final Output :
            [ 1 ]--[ 2 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]*/
    public static void sortAscendingPushLast(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
            log(array);
        }
    }

/*    ----Descending by pushing smaller elements to last----
    Initial Array is :
            [ 1 ]--[ 2 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]
    Performing Sorting :
            [ 2 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]--[ 1 ]
            [ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]--[ 2 ]--[ 1 ]
            [ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]--[ 3 ]--[ 2 ]--[ 1 ]
            [ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]--[ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]
            [ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]
            [ 7 ]--[ 8 ]--[ 9 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]
            [ 8 ]--[ 9 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]
            [ 9 ]--[ 8 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]
            [ 9 ]--[ 8 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]
    Final Output :
            [ 9 ]--[ 8 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]*/
    public static void sortDescendingPushLast(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] < array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
            log(array);
        }
    }

/*    ----Ascending by pushing smaller elements to first----
    Initial Array is :
            [ 9 ]--[ 8 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]
    Performing Sorting :
            [ 1 ]--[ 9 ]--[ 8 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 2 ]
            [ 1 ]--[ 2 ]--[ 9 ]--[ 8 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]
            [ 1 ]--[ 2 ]--[ 3 ]--[ 9 ]--[ 8 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]
            [ 1 ]--[ 2 ]--[ 3 ]--[ 4 ]--[ 9 ]--[ 8 ]--[ 7 ]--[ 6 ]--[ 5 ]
            [ 1 ]--[ 2 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 9 ]--[ 8 ]--[ 7 ]--[ 6 ]
            [ 1 ]--[ 2 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 9 ]--[ 8 ]--[ 7 ]
            [ 1 ]--[ 2 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 9 ]--[ 8 ]
            [ 1 ]--[ 2 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]
    Final Output :
            [ 1 ]--[ 2 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]*/
    public static void sortAscendingPushFirst(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[j] < array[i]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            log(array);
        }
    }

/*    ----Descending by pushing larger elements to first----
    Initial Array is :
            [ 1 ]--[ 2 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]--[ 9 ]
    Performing Sorting :
            [ 9 ]--[ 1 ]--[ 2 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]--[ 8 ]
            [ 9 ]--[ 8 ]--[ 1 ]--[ 2 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]--[ 7 ]
            [ 9 ]--[ 8 ]--[ 7 ]--[ 1 ]--[ 2 ]--[ 3 ]--[ 4 ]--[ 5 ]--[ 6 ]
            [ 9 ]--[ 8 ]--[ 7 ]--[ 6 ]--[ 1 ]--[ 2 ]--[ 3 ]--[ 4 ]--[ 5 ]
            [ 9 ]--[ 8 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 1 ]--[ 2 ]--[ 3 ]--[ 4 ]
            [ 9 ]--[ 8 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 1 ]--[ 2 ]--[ 3 ]
            [ 9 ]--[ 8 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 1 ]--[ 2 ]
            [ 9 ]--[ 8 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]
    Final Output :
            [ 9 ]--[ 8 ]--[ 7 ]--[ 6 ]--[ 5 ]--[ 4 ]--[ 3 ]--[ 2 ]--[ 1 ]*/
    public static void sortDescendingPushFirst(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[j] > array[i]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
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
        int arrayInDes[] = {9,8,7,6,5,4,3,2,1};
        int arrayInAsc[] = {1,2,3,4,5,6,7,8,9};

        int[] initialArray = {9,8,7,6,5,4,3,2,1};
        System.out.println("----Ascending by pushing larger elements to last----");
        System.out.println("Initial Array is : ");
        log(initialArray);
        System.out.println("Performing Sorting : ");
        sortAscendingPushLast(initialArray);
        System.out.println("Final Output : ");
        log(initialArray);

        System.out.println("\n\n");

        System.out.println("----Descending by pushing smaller elements to last----");
        System.out.println("Initial Array is : ");
        log(initialArray);
        System.out.println("Performing Sorting : ");
        sortDescendingPushLast(initialArray);
        System.out.println("Final Output : ");
        log(initialArray);

        System.out.println("\n\n");

        System.out.println("----Ascending by pushing smaller elements to first----");
        System.out.println("Initial Array is : ");
        log(initialArray);
        System.out.println("Performing Sorting : ");
        sortAscendingPushFirst(initialArray);
        System.out.println("Final Output : ");
        log(initialArray);

        System.out.println("\n\n");

        System.out.println("----Descending by pushing larger elements to first----");
        System.out.println("Initial Array is : ");
        log(initialArray);
        System.out.println("Performing Sorting : ");
        sortDescendingPushFirst(initialArray);
        System.out.println("Final Output : ");
        log(initialArray);
    }
}
