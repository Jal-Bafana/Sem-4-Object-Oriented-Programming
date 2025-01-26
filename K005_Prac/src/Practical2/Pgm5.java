import java.util.Scanner;
package Practical2;
public class Pgm5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input 
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();
        int result = 1;
        // power
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        sc.close();
}