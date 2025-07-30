#!/bin/bash

echo "Testing Magic Number Program"
echo "============================"

# Compile the program
echo "Compiling MagicNumber.java..."
javac MagicNumber.java

if [ $? -eq 0 ]; then
    echo "Compilation successful!"
    echo ""
    echo "You can now run the program with: java MagicNumber"
    echo ""
    echo "Example usage:"
    echo "1. Choose option 1 to check if 153 is a magic number"
    echo "2. Choose option 2 to find all magic numbers up to 1000"
    echo "3. Choose option 3 to exit"
    echo ""
    echo "Some magic numbers to test:"
    echo "- 153 (3-digit magic number)"
    echo "- 370 (3-digit magic number)"
    echo "- 407 (3-digit magic number)"
    echo "- 1634 (4-digit magic number)"
    echo "- 8208 (4-digit magic number)"
else
    echo "Compilation failed!"
fi