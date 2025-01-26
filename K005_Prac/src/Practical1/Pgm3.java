/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical1;
import java.util.Scanner;

/**
 *
 * @author mpstme.student
 */
public class Pgm3 {
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 3 numbers = ");

	System.out.println("Enter 1st number = ");
	double a = sc.nextDouble();

	System.out.println("Enter 2nd number = ");
	double b = sc.nextDouble();

	System.out.println("Enter 3rd number = ");
	double c = sc.nextDouble();

	double dis = (b*b) - (4*a*c);

	if(dis == 0){
            System.out.println("Roots are Real and Equal");

	}

	else if(dis > 0 ){
            System.out.println("Roots are Real and Unequal ");
            double rt1 = (-b + (Math.sqrt(dis)))/(2*a);
            double rt2 = (-b - (Math.sqrt(dis)))/(2*a);
            System.out.println("Roots are x1 = " + rt1 + " x2 = " + rt2);

	}
		
	else{
            System.out.println("Roots are Imaginary");
	}	
    }
}
