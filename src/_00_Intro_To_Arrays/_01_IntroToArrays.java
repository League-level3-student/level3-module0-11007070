package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	
    	String[] arr = new String[5];

        // 2. print the third element in the array
    	
    	System.out.println(arr[2]);

        // 3. set the third element to a different value
    	
    	arr[2] = "Kayla";

        // 4. print the third element again
    	
    	System.out.println(arr[2]);

        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    	
    	for (int i = 0; i < arr.length; i++) {
    		arr[i] = "Hi";
    	}

        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    	
    	for (int i = 0; i < arr.length; i++) {
    		System.out.println(arr[i]);
    	}

        // 7. make an array of 50 integers
    	
    	int[] arrInts = new int[50];
    	
        // 8. use a for loop to make every value of the integer array a random
        //    number
    	
    	Random ran = new Random();
    	for (int i = 0; i < arrInts.length; i++) {
    		arrInts[i] = ran.nextInt(50);
    	}

        // 9. without printing the entire array, print only the smallest number
        //    on the array
    	int small = 100; 
    	for (int i = 0; i < arrInts.length; i++) {
    		if (arrInts[i] < small) {
    			small = arrInts[i];
    		}
    	}
    	System.out.println("Small number: " + small);

        // 10 print the entire array to see if step 8 was correct
    	
    	for (int i = 0; i < arrInts.length; i++) {
    		System.out.println(arrInts[i]);
    	}

        // 11. print the largest number in the array.
    	int large = 0; 
    	for (int i = 0; i < arrInts.length; i++) {
    		if (arrInts[i] > large) {
    			large = arrInts[i];
    		}
    	}
    	System.out.println("Large number: " + large);
    		
        // 12. print only the last element in the array
    	System.out.println("Last number: " + arrInts[49]);

    }
}
