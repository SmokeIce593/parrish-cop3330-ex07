/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Cameron Parrish
 */

package org.example;
import java.util.Scanner;

public class AreaCalculator {
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);

        System.out.print( "What is the length of the room in feet?" );
        int length = input.nextInt();

        System.out.print( "What is the width of the room in feet?" );
        int width = input.nextInt();

        int area = length * width;
        float meterconversion = area * 0.09290304f;

        System.out.printf( "The area is\n%d square feet\n%.3f square meters", area, meterconversion);


    }
}