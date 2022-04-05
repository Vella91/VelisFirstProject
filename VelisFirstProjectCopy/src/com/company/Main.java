package com.company;

import java.util.*;

import static com.company.ChristmasTree.printChristmasTree;
import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args)
    {
        //exercise 1

        String myFirstName = "Velichka";
        String mySecondName = "Georgieva";
        String myThirdName = "Suvandzhieva";

        System.out.println("My name is: " + myFirstName + " " + mySecondName + " " + myThirdName + ".");

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter your first name: ");

        String firstName = myObj.nextLine();

        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Please enter your second name: ");

        String secondName = myObj2.nextLine();

        Scanner myObj3 = new Scanner(System.in);
        System.out.println("Please enter your family name: ");

        String familyName = myObj3.nextLine();

        System.out.println("My whole name is: " + firstName + " " + secondName + " " + familyName + ".");

        //exercise 2 and 3

        double sideA = 5.6;
        double sideB = 9.7;
        double sideC = 10;

        double trianglePerimeter = (sideA + sideB + sideC); //refactor + rename
        double triangleArea = ((sideA * sideB) /2);

        System.out.println("The perimeter of the triangle is: " + trianglePerimeter);
        System.out.println("The area of the triangle is :" + triangleArea);

        //exercise 3

        System.out.println();
        printChristmasTree(5);

        //еxercise 5
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a where a does not equal 0: ");
        double a = input.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        double determinant = b * b - 4.0 * a * c;
        double sqrtval = sqrt(abs(determinant));

        if (determinant > 0)
        {
            System.out.println("The roots of the equation are real and different. \n");
            System.out.println(-(double)(-b + sqrtval) / (2 * a) + "\n"+ -(double)(-b - sqrtval) / (2 * a));
        }
        else if (determinant == 0)
        {
            System.out.println("The roots of the equation are real and same. \n");
            System.out.println(-(double)b / (2 * a) + "\n"+ -(double)b / (2 * a));
        }
        else
        {
            System.out.println("The roots of the equation are complex and different. \n");
            System.out.println(-(double)b / (2 * a) + " + i"+ sqrtval + "\n"+ -(double)b / (2 * a)+ " - i" + sqrtval);
        }
    }
}
