package com.david;

public class Sub {
    public static void main(String[] args){
            int [] arr = {1, -1, -3, 3, 4, -7, 7, 8, -15, 15};
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
        System.out.println("The number of sub arrays which equal to zero in your array is: " + counter);
    }
}
