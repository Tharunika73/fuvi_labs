# Random Even Number Matrix Generator and Highlighter
## Problem Statement
Develop a Java application that generates a square matrix of random even numbers and enables the user to search for a specific even number. 
The program should highlight every occurrence of the selected number within the matrix and display the total number of times it appears. 
The application must also validate user input to ensure only valid values are accepted.
# How the Program Works
### Step 1: Accept Matrix Size
The program first asks the user to enter the size (**P**) of the square matrix (P × P).
Example:
Enter array size (for P×P array): 5
If the entered value is invalid (non-numeric or less than or equal to zero), the program terminates with an error message.
### Step 2: Generate Random Even Numbers
After receiving the matrix size, the program creates a two-dimensional array.
Each element is assigned a random even number between **2 and 16** using:
java
(random.nextInt(8) + 1) * 2;
Possible generated values are:
2, 4, 6, 8, 10, 12, 14, 16
Since the numbers are generated randomly, every execution produces a different matrix.
### Step 3: Display the Matrix
The `matrix()` method prints the generated matrix in a structured table.
Features of the display include:
- Row indices
- Column indices
- Borders for better readability
- Proper alignment of numbers
Example:
      00   01   02   03
   +----+----+----+----+
00 |  8 | 12 |  4 | 10 |
01 | 14 |  8 | 16 |  6 |
02 | 10 | 12 |  8 | 14 |
03 |  2 |  4 | 10 |  8 |
### Step 4: User Selects a Number
The program asks the user to enter an even number between **2 and 16**.
Example:
Enter an even number (2-16) to highlight: 8
The program validates that:
- The input is numeric.
- The number is even.
- The number lies between 2 and 16.
Invalid inputs result in an error message.
### Step 5: Search the Matrix
The program scans every element of the matrix using nested loops.
Whenever the selected number is found:
- The occurrence counter is incremented.
- Its value is marked for highlighting during display.
### Step 6: Highlight Matching Elements
The matrix is printed again.
Every occurrence of the selected number is enclosed in brackets.
Example:
00 |[ 8]| 12 |  4 | 10 |
01 | 14 |[ 8]| 16 |  6 |
02 | 10 | 12 |[ 8]| 14 |
03 |  2 |  4 | 10 |[ 8]|
This makes it easy for the user to identify every matching value.
### Step 7: Display Frequency
Finally, the program displays how many times the selected number appeared.
Example:
Number 8 appeared 4 time(s).
# How the Output is Generated
The output is produced in three stages:
### 1. Matrix Creation
- A two-dimensional array is created.
- Every cell receives a random even number between 2 and 16.
### 2. Matrix Formatting
The custom `matrix()` method:
- Prints row and column labels.
- Draws table borders.
- Aligns numbers neatly.
- Highlights matching values when required.
This results in a clean and readable console display.
### 3. Searching and Counting
The program traverses every element of the matrix using nested loops.
If an element matches the user's input:
- The occurrence count is increased.
- The value is highlighted during the second display.
The final output contains:
- The original randomly generated matrix.
- The highlighted matrix.
- The frequency of the selected number.
# Key Java Concepts Used
- Two-Dimensional Arrays
- Methods
- Nested Loops
- Conditional Statements
- Random Class
- Scanner Class
- Input Validation
- Console Formatting 
- Searching Algorithms
- Counting Occurrences
# Output Features
  ✔ Random matrix generated for every execution.
  ✔ Well-formatted tabular display.
  ✔ Row and column indexing for easy navigation.
  ✔ Highlights all matching values.
  ✔ Displays the total frequency of the selected number.
  ✔ Handles invalid user input gracefully.
# Conclusion
This program demonstrates the practical use of Java fundamentals by combining random number generation, two-dimensional arrays, searching techniques, and formatted console output. 
It provides a user-friendly way to visualize data, identify matching values, and validate inputs, making it an effective exercise for understanding core programming concepts.
