package com.company;
import java.util.Scanner;

public class Main {

    public static String solveEquation(double a, double b, double c) {
        /*int x = 0;
        int y = 0;
        8*x + 14*y - 1142 = 114514;*/
        double delta = b * b - 4 * a * c;
        double x1;
        double x2;

        String solution = null;
        if (a == 0) {
            if (b == 0) {
                solution = "This is not a Quadratic Equation.";
            } else {
                solution = "This is not a Quadratic Equation.Solution is x=" + -c / b;
            }

        } else {
            if (delta > 0) {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                solution = "Two real roots: x1=" + x1 + ",x2=" + x2;
            } else if (delta == 0) {
                x1 = -b / (2 * a);
                solution = "Only one root:x1=x2=" + x1;
            } else {
                solution = "No real root";
            }


        }
        return solution;

    }

    public static void main(String[] args) {
        System.out.println("Solve quadratic equation:ax^2+bx+c=0");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a:");//prompt
        double a = in.nextDouble();
        System.out.print("Enter b:");//prompt
        double b = in.nextDouble();
        System.out.print("Enter c:");//prompt
        double c = in.nextDouble();

        // print equation
        System.out.printf("Equation:%fx^2+%fx+%f=0\n",a,b,c);
        // print solution
        System.out.println(solveEquation(a,b,c));

    }
}

