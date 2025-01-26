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
public class Pgm2 {
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

	System.out.println("Enter a number = ");
	int n = sc.nextInt();
		
	if(n % 2 == 0){
            System.out.println("The Number is even");
	}
		
	else{
            System.out.println("The Number is Odd");
	}
    }
}
