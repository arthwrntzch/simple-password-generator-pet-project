package password.gen;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the password:");
        int length = scanner.nextInt();
        System.out.println("Include uppercase letters? (true/false):");
        boolean useUppercase = scanner.nextBoolean();
        System.out.println("Include lowercase letters? (true/false):");
        boolean useLowercase = scanner.nextBoolean();
        System.out.println("Include numbers? (true/false):");
        boolean useNumbers = scanner.nextBoolean();
        System.out.println("Include special characters? (true/false):");
        boolean useSpecialChars = scanner.nextBoolean();
        String pass = password.generate(length, useUppercase, useLowercase, useNumbers, useSpecialChars);
        System.out.println("Generated password: " + pass);
    }
}
