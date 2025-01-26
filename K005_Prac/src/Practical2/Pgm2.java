import java.util.Scanner;
package Practical2;
public class Pgm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input 
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("The first " + n + " odd numbers are:");
        for (int i = 1, count = 0; count < n; i += 2) {
            System.out.print(i + " ");
            sum += i;
            count++;
        }
        System.out.println("\nSum of odd numbers: " + sum);
        sc.close();
}
