/**
 * class: Triangle
 * @author: ITEC 2140 students
 * @date: February 08, 2023
 * @version: 1.0
 * @course: ITEC 2140 - 05 Spring 2023
 * description: Will ask the user for the size of 3 edges of a triangle then find the perimeter of that triangle,
 * but only if the sum of 2 sides is greater than the remainder of the other 1.
 */



import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an edge of the triangle: ");
        int length_1 = input.nextInt();
        System.out.println("Enter the 2nd edge of the triangle: ");
        int length_2 = input.nextInt();
        System.out.println("Enter the 3rd edge of the triangle: ");
        int length_3 = input.nextInt();

        int perimeter = length_1 + length_2 + length_3;

        if (length_1 >= 0 && length_1 + length_2 > length_3) {
            if (length_2 >= 0 && length_2 + length_3 > length_1) {
                if (length_3 >= 0 && length_1 + length_3 > length_2) {
                    System.out.println("The triangle's perimeter is equal to: " + perimeter);
                }
            }
        }
        else {
            System.out.println("YOU HAVE AN INVALID INPUT!");
        }
    }
}
