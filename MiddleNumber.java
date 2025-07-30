import java.util.Scanner;

public class MiddleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter three integer values:");
        
        // Input three integers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        
        // Check if third number is the middle value
        boolean isMiddle = isMiddleNumber(num1, num2, num3);
        
        // Display result
        if (isMiddle) {
            System.out.println(num3 + " is the middle number between " + num1 + " and " + num2);
        } else {
            System.out.println(num3 + " is NOT the middle number between " + num1 + " and " + num2);
        }
        
        scanner.close();
    }
    
    /**
     * Checks if the third number is the middle value between the first two numbers
     * @param a first number
     * @param b second number
     * @param c third number (to check if it's middle)
     * @return true if c is the middle value, false otherwise
     */
    public static boolean isMiddleNumber(int a, int b, int c) {
        // Find the minimum and maximum of the first two numbers
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        
        // Check if the third number is between min and max (inclusive)
        return c >= min && c <= max;
    }
}