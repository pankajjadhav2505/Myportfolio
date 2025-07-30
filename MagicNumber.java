import java.util.Scanner;

public class MagicNumber {
    
    // Method to check if a number is a magic number
    public static boolean isMagicNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        int count = 0;
        
        // Count the number of digits
        int temp = number;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        
        // Calculate sum of digits raised to power of count
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, count);
            number = number / 10;
        }
        
        return sum == originalNumber;
    }
    
    // Method to find all magic numbers up to a given limit
    public static void findMagicNumbers(int limit) {
        System.out.println("Magic numbers up to " + limit + ":");
        boolean found = false;
        
        for (int i = 1; i <= limit; i++) {
            if (isMagicNumber(i)) {
                System.out.print(i + " ");
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No magic numbers found in the given range.");
        } else {
            System.out.println();
        }
    }
    
    // Method to check if a specific number is magic
    public static void checkSpecificNumber(int number) {
        if (isMagicNumber(number)) {
            System.out.println(number + " is a magic number!");
            
            // Show the calculation
            int temp = number;
            int count = 0;
            while (temp != 0) {
                count++;
                temp = temp / 10;
            }
            
            System.out.print("Calculation: ");
            temp = number;
            int sum = 0;
            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, count);
                System.out.print(digit + "^" + count);
                temp = temp / 10;
                if (temp != 0) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + sum);
        } else {
            System.out.println(number + " is not a magic number.");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Magic Number Finder ===");
        System.out.println("A magic number is a number that equals the sum of its digits raised to the power of the number of digits.");
        System.out.println("Example: 153 = 1³ + 5³ + 3³ = 1 + 125 + 27 = 153");
        System.out.println();
        
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Check if a specific number is magic");
            System.out.println("2. Find all magic numbers up to a limit");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine(); // Clear the buffer
                continue;
            }
            
            switch (choice) {
                case 1:
                    System.out.print("Enter a number to check: ");
                    try {
                        int number = scanner.nextInt();
                        if (number < 0) {
                            System.out.println("Please enter a positive number.");
                        } else {
                            checkSpecificNumber(number);
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input! Please enter a valid number.");
                        scanner.nextLine(); // Clear the buffer
                    }
                    break;
                    
                case 2:
                    System.out.print("Enter the upper limit: ");
                    try {
                        int limit = scanner.nextInt();
                        if (limit < 1) {
                            System.out.println("Please enter a positive number greater than 0.");
                        } else {
                            findMagicNumbers(limit);
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input! Please enter a valid number.");
                        scanner.nextLine(); // Clear the buffer
                    }
                    break;
                    
                case 3:
                    System.out.println("Thank you for using Magic Number Finder!");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
                    break;
            }
        }
    }
}