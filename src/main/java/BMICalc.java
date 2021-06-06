/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

import java.util.Scanner;

public class BMICalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in lbs: ");
        double weight = vNumber(input);
        System.out.print("Enter your height in inches: ");
        double height = vNumber(input);
        double bmi = (weight / (height*height)) * 703;
        System.out.printf("Your bmi is %.2f\n",bmi);


        if(bmi < 18.5){
            System.out.print("You are underweight. You should see a doctor");
        }
        else if(bmi >25){
            System.out.print("You are overweight. You should see a doctor.");
        }
        else{
            System.out.print("You are in the ideal weight range.");
        }



    }
    public static double vNumber(Scanner input){
        int x = 0;
        while (x == 0) {
            if (input.hasNextDouble()) {
                double num = input.nextDouble();
                x = 1;
                return num;
            }
            else{
                System.out.print("Please enter a valid number, try again: ");
            }
            input.nextLine();
        }
        return 1;
    }
}
