package Exercise21;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.Scanner;

public class Exercise21 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number of the month: ");
        String number = scanner.nextLine();

        switch (number) {
            case "1": number = "January";  break;
            case "2": number = "February";  break;
            case "3": number = "March";  break;
            case "4": number = "April";  break;
            case "5": number = "May";  break;
            case "6": number = "June";  break;
            case "7": number = "July";  break;
            case "8": number = "August";  break;
            case "9": number = "September";  break;
            case "10": number = "October";  break;
            case "11": number = "November";  break;
            case "12": number = "December";  break;
            default: number = "Input a valid number."; System.out.print(number); System.exit(0);

        }

        System.out.print("The name of the month is " + number + ".");




    }
    
}
