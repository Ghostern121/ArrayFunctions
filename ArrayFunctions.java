//ArrayFunctions.java

import java.util.*;

public class ArrayFunctions {

    // Method to display the elements of an ArrayList
    public void display(ArrayList<Integer> array) {
        System.out.println("Array is: " + array); // Print the contents of the ArrayList
    }

    // Method to categorize elements of an array into odd and even numbers
    public void oddEven(int[] array) {
        // Create ArrayLists to store odd and even numbers
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        // Iterate through the array and separate odd and even numbers
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) { // If the number is even
                even.add(array[i]);
            } else { // If the number is odd
                odd.add(array[i]);
            }
        }
        // Call the display method to show odd and even numbers
        display(odd); // Display odd numbers
        display(even); // Display even numbers
    }

    // Method to find the smallest difference between consecutive elements in the array
    public void Min(int[] array) {
        // Calculate the difference between the first two elements initially
        int min = array[0] - array[1];
        int index = 0; // Store the index of the element where the minimum difference occurs
        int diff = 0;  // Temporary variable to hold the difference between consecutive elements

        // Iterate through the array to find the minimum difference
        for (int i = 1; i < array.length - 1; i++) {
            diff = array[i] - array[i + 1]; // Calculate the difference between current and next element
            if (diff < min) { // If the current difference is smaller than the previous minimum
                min = diff;    // Update the minimum difference
                index = i;     // Update the index
            }
        }

        // Output the minimum difference and the index at which it occurred
        System.out.println("Difference = " + min);
        System.out.println("Index = " + index);
    }
}

