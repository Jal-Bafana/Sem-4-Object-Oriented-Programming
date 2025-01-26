import java.util.Scanner;
package Practical2;
public class Pgm4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Inputs
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        // Check if increasing, decreasing, or neither
        if (num1 < num2) {
            System.out.println("Increasing");
        } else if (num1 > num2) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing nor decreasing order");
        }
        sc.close();
}
