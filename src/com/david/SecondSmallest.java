package com.david;

import java.util.Scanner;

public class SecondSmallest {

    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the length of the list: ");
        final int[] numList = new int[SCANNER.nextInt()];
        for (int i = 0 ; i < numList.length ; i++) {
            System.out.println("please enter value number " + (i + 1) + " :");
            numList[i] = SCANNER.nextInt();
        }
        System.out.println( secondSmall( numList));
    }

    static int secondSmall ( int [] arr){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                i = 0;
            }
            if ( ( arr[i] < secondSmallest ) && ( arr[i] > smallest )){
                secondSmallest = arr[i];
            }
        }

        return secondSmallest;
    }
}
