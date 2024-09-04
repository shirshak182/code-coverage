package org.example;

/**
 * @author - Shirshak Upadhayay
 * @Date - 04/09/2024
 */

interface ArithmeticOperation{
    int operate(int a,int b);
}

public class Main {
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

    }
}