package password.gen;

import java.util.Scanner;

public class App 
{

    private static Scanner scanner = new Scanner(System.in);
    public static void main( String[] args ){
        boolean flag = true;
        while(flag){
           showMenu();
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    String pass = password.generate(askLength(), askUppercase(), askLowercase(), askNumbers(), askSpecialChars());
                    System.out.println("Generated Password: " + pass);
                    break;
                case 2:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void showMenu() {
        System.out.println("Welcome to Password Generator");
        System.out.println("1. Generate Password");
        System.out.println("2. Exit");
        System.out.print("Enter your choice: ");
    }

    public static int askLength() {
        System.out.print("Enter the length of the password: ");
        int length = scanner.nextInt();
        if(length <= 1) {
            System.out.println("Length must be at least 1.");
            askLength();
        }
        return length;
    }
    public static boolean askUppercase() {
        System.out.print("Include uppercase letters? (true/false): ");
        if(scanner.hasNextBoolean()) {
            boolean useUppercase = scanner.nextBoolean();
            return useUppercase;
        } else {
            System.out.println("Invalid input. Please enter true or false.");
            scanner.next();
            askUppercase();
        }
        return false;
    }
    public static boolean askLowercase() {
        System.out.print("Include lowercase letters? (true/false): ");
        if(scanner.hasNextBoolean()) {
            return scanner.nextBoolean();
        } else {
            System.out.println("Invalid input. Please enter true or false.");
            scanner.next(); 
            return askLowercase();
        }
    }
    public static boolean askNumbers() {
        System.out.print("Include numbers? (true/false): ");
        if(scanner.hasNextBoolean()) {
            return scanner.nextBoolean();
        } else {
            System.out.println("Invalid input. Please enter true or false.");
            scanner.next();
            return askNumbers();
        }
    }
    public static boolean askSpecialChars() {
        System.out.print("Include special characters? (true/false): ");
        if(scanner.hasNextBoolean()) {
            return scanner.nextBoolean();
        } else {
            System.out.println("Invalid input. Please enter true or false.");
            scanner.next();
            return askSpecialChars();
        }
    }

}
