/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trst;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author User
 */
public class Trst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // Ask user for the number of elements
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt(); 

        // Declare an array of given size
        int[] numbers = new int[size]; 

        // Taking input from the user
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Display the entered numbers
        System.out.println("\nYou entered: " + Arrays.toString(numbers));

        // Find the sum of the array elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);

        // Sort and display the sorted array
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // Close the scanner
        scanner.close();
    }
}
