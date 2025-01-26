import java.util.Scanner;
package Practical2;
public class Pgm6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Inputs
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        // Check if strings are equal
        if (str1.equals(str2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
        sc.close();
}
