package com.david;

import java.util.Scanner;

public class SubZero {

    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the length of the list: ");
        final int[] numList = new int[SCANNER.nextInt()];
        for (int i = 0 ; i < numList.length ; i++) {
            System.out.println("please enter value number " + (i + 1) + " :");
            numList[i] = SCANNER.nextInt();
        }
        System.out.println("The number of sub arrays which equal to zero in your array is: " + howManySubArrZero(numList));

    }
    static int howManySubArrZero ( int [] arr ){
        int counter = 0;
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            for ( int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if ( sum == 0 ) {
                    counter++;
                    break;
                }
            }
            sum = 0;
        }
        return counter;
    }
}
