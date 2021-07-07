/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex07;
import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        String length, width;

        Scanner recLength = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        length = recLength.nextLine();
        int lengthParse = Integer.parseInt(length);

        Scanner recWidth = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        width = recWidth.nextLine();
        int widthParse = Integer.parseInt(width);

        int area = lengthParse * widthParse;
        double sqrMeters = (lengthParse * widthParse) * 0.09290304;

        System.out.print("You entered dimensions of " + length + " feet by " + width + " feet.");
        System.out.println("");
        System.out.print("The area is " + area + " square feet or " + sqrMeters + " square meters.");

    }

}
