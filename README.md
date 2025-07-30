# Magic Number Finder

A Java program that finds magic numbers with interactive user input.

## What is a Magic Number?

A magic number (also known as an Armstrong number or narcissistic number) is a number that equals the sum of its digits raised to the power of the number of digits.

### Examples:
- **153** is a magic number because: 1³ + 5³ + 3³ = 1 + 125 + 27 = 153
- **370** is a magic number because: 3³ + 7³ + 0³ = 27 + 343 + 0 = 370
- **407** is a magic number because: 4³ + 0³ + 7³ = 64 + 0 + 343 = 407

## How to Run the Program

1. **Compile the program:**
   ```bash
   javac MagicNumber.java
   ```

2. **Run the program:**
   ```bash
   java MagicNumber
   ```

## Program Features

The program provides an interactive menu with three options:

1. **Check if a specific number is magic** - Enter any number to check if it's a magic number
2. **Find all magic numbers up to a limit** - Enter an upper limit to find all magic numbers in that range
3. **Exit** - Close the program

## Sample Output

```
=== Magic Number Finder ===
A magic number is a number that equals the sum of its digits raised to the power of the number of digits.
Example: 153 = 1³ + 5³ + 3³ = 1 + 125 + 27 = 153

Choose an option:
1. Check if a specific number is magic
2. Find all magic numbers up to a limit
3. Exit
Enter your choice (1-3): 1
Enter a number to check: 153
153 is a magic number!
Calculation: 3^3 + 5^3 + 1^3 = 153
```

## Magic Numbers

Some known magic numbers:
- 1-digit: 1, 2, 3, 4, 5, 6, 7, 8, 9
- 3-digit: 153, 370, 371, 407
- 4-digit: 1634, 8208, 9474
- 5-digit: 54748, 92727, 93084

## Error Handling

The program includes robust error handling for:
- Invalid input (non-numeric values)
- Negative numbers
- Invalid menu choices

## Requirements

- Java 8 or higher
- No external dependencies required