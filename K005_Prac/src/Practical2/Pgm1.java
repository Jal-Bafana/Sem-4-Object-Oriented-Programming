package Practical2;
import java.util.Scanner;
public class Pgm1 {
    public static void main(String[]args){
         Scanner sc = new Scanner(System.in);
        
        // Input 
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int reversedNum = 0;
        // Reversing
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        
        // Checking palindrome
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
        sc.close();
    }
}