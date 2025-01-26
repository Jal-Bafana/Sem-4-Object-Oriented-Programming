/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical1;

/**
 *
 * @author mpstme.student
 */
public class Pgm1 {
    public static void main(String[]args){
	int a =1;
	double d = 1.0;

	a = 46/9;
	System.out.println("Exp 1 = " + a);

	a = 46 % 9 + 4 * 4 - 2;
	System.out.println("Exp 2 = " + a);

        a = 45 + 43 % 5 * (23 * 3 % 2);
	System.out.println("Exp 3 = " + a);
	
        a %= 3 / a + 3;
	System.out.println("Exp 4 = " + a);

	d = 4 + d * d + 4;
	System.out.println("Exp 5 = " + d);

	d += 1.5 * 3 + (++a);
	System.out.println("Exp 6 = " + d);

	d -= 1.5 * 3 + a++;
	System.out.println("Exp 7 = " + d);
    }
}