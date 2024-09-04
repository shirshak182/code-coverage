package org.example;

/**
 * @author - Shirshak Upadhayay
 * @Date - 04/09/2024
 */

interface ArithmeticOperation{
    int operate(int a,int b);
}

public class Main {
    public int binarySearch(int arr[], int low, int high, int x){
        if (high >= low) {
            int mid = low + (high - low) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, low, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, high, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }
    public void display(ArithmeticOperation operation){
        System.out.println(operation.operate(20,10));
    }
    public static void main(String[] args) {
      ArithmeticOperation add = (a,b)->a+b;
        ArithmeticOperation multiply = (a,b)->a*b;
        ArithmeticOperation divide = (a,b)->a/b;
        ArithmeticOperation substract = (a,b)->a-b;

        Main main = new Main();
        main.display(add);
        main.display(multiply);
        main.display(divide);
        main.display(substract);


        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = main.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println(
                    "Element is present at index " + result);
    }
}