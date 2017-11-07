package test.task1.input;

import java.util.Scanner;

public class NumberInput {
    public static int numberInput(String request){
        System.out.println("Enter "+request+":");
        Scanner in = new Scanner(System.in);
        int value;
        try {
            value = in.nextInt();
        }
        catch (java.util.InputMismatchException o){
            System.out.println("Not a number or not integer number");
            return -1;
        }
        if (value<0){
            System.out.println("Value is negative");
            return -1;
        }
        return value;
    }
}
