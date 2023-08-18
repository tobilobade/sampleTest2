package org.interswitch;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter operand 1: ");
        double operand1 = scanner.nextDouble();

        System.out.print("Enter operand 2: ");
        double operand2 = scanner.nextDouble();

        scanner.close();

        Calculator calculator = new Calculator();

        System.out.println( "Addition :" + Calculator.(operand1,operand2) );
    }


}
