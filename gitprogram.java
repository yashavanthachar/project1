import java.util.Scanner;

public class gitprogram {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt for the user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Prompt for the user's age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Print a personalized greeting
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        
        // Close the scanner
        scanner.close();
    }
}