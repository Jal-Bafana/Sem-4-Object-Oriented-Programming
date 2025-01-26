import java.util.Scanner;
package Practical2;
public class Pgm3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input 
        System.out.print("Enter a line of text: ");
        String text = sc.nextLine();
        int vowels = 0, consonants = 0;
        text = text.toLowerCase();  // lowercase 
        
        // Count vowels and consonants
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        sc.close();
}
