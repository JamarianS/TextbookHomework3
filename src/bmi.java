/**
 * class: BMI
 * @author: ITEC 2140 students
 * @date: February 08, 2023
 * @version: 1.0
 * @course: ITEC 2140 - 05 Spring 2023
 * description: Will convert pounds to kilograms and then convert inches to meters. With this information you will then
 * calculate the bmi of an individual.
 */

import java.util.Scanner;
public class bmi {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight in pounds: ");
        double weightP = input.nextDouble();

        System.out.println("Enter your height in inches: ");
        double heightIn = input.nextDouble();

        double weightKg = weightP * 0.4536;
        double heightM = heightIn * 0.0254;

        double bmi = weightKg / heightM * 0.4536; //* weight in kilos and height in meters

        System.out.println("Your weight is: " + weightKg + " in kilograms ! ");
        System.out.println("Your height is: " + heightM + " in meters ! ");

        System.out.println("Your BMI is: " + bmi + " ! ");

        if (bmi < 18.5) {
            System.out.println("You are underweight");
        }
        else if (bmi >= 18.5 && bmi < 25.0){
            System.out.println("You are at a normal weight");
        }
        else if (bmi >= 25.0 && bmi < 30.0){
            System.out.println("You are overweight");
        }
        else if( bmi >= 30.0){
            System.out.println("You are overweight");
        }
        else{
            System.out.println("INVALID INPUT");
        }



    }
}
