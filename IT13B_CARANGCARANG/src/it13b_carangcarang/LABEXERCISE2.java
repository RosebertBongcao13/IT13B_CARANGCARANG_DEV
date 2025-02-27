/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it13b_carangcarang;

/**
 *
 * @author User
 */

import java.util.Scanner;

public class LABEXERCISE2 {
  
    

    public static void main(String[] args) {

        int first_number;
        int second_number;
        int third_number;
        int greatest_number;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        first_number = in.nextInt();
        System.out.print("Enter second number: ");
        second_number = in.nextInt();
        System.out.print("Enter third number: ");
        third_number = in.nextInt();

        if (second_number > first_number && second_number > third_number) {
            greatest_number = second_number;

        } else if (third_number > second_number && third_number > first_number) {
            greatest_number = third_number;

        } else {
            greatest_number = first_number;

        }
        System.out.println("The greatest number is: " + greatest_number);

    }
}
}
