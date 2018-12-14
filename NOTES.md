**Console Program**
- println & print
	- Console is text entry and display window/screen/device
    - HelloWorld program with println
    - println("Some Text");
		- quotes does not appear in output
	- println("Hello Hello");
    - print("Hi, Everyone");
- Escape sequences
- escape sequence: A special sequence of characters used to represent certain special characters in a string.
	- **\t** 		tab character
	- **\n** 		new line character
	- **\\"** 		quotation mark character
	- **\\** 		backslash character

- AddTwoIntegers

- Variables
	- location to store some kind of value inside RAM
	- has name
	- use the name to use the value stored

- Making new variables
	int myVariable;

- Type of variables
	- **int**, **double**, **boolean**, **char**
	- **String** (technically it’s not the type of variable, it’s ref type)
	- and many others

- int vs double
	int used for counting (how many)
	double for measurements (how much)

- variable declaration
	- Sets aside memory location for storing a value.
	- Variables must be declared before they can be used.
	- Examples:
        - int myAge;
        - double temperature;
        - String myName
        - In general **type name**; (general format)

- Assignment: Stores a value into a variable.
    - assign value to variable
    - temperature = 27.3;
        - temperature is variable name here
        - temperature variable must have been declared
    - In general, variableName = expression;
        - we'll see what are expressions in a minute
    - def:
        -
- Assignment Examples:
    - // integer values <br>int num; <br>num = 5;
    - // real values <br> double fraction;<br>fraction = 0.2;
    - // a single letter <br> char letter; <br>letter = ‘c’;
    - // true or false <br> boolean isLove; <br> isLove = true;
    - // use of expression <br>double myGPA; <br> myGPA = 1.0 + 2.25;
- Declare and Initialize
    - A variable can be declared/initialized in one statement.
    - This is probably the most commonly used declaration syntax.
    - Examples:
        <br> double tempF = 98.6;
        <br> int x = (12 / 2) + 3;

 - Common confusion about equal sign (=)
    - In Java and most other programming languages, it means store the value on the right
    to the variable on the left.
    - It's not algebraic equations.
    - The right side expression is evaluated first, and then its result is stored in the variable at left.
    - Example:
        - int x = 3; <br>
          x = x + 2;
        - What is the vale of x now?

 - Assignment and Variable Type
    - int x = 2.5; // Error: incompatible types
        -
    - double myGPA = 4; // this is OK
        - in this case the value 4 is converted to 4.0 double and assign the converted value
        to the variable.
    - In general, if no information is lostJava automatically convert

- Widening and Narrowing

- Common Compiler Errors
    - A variable can't be used until it is assigned a value.
        - int x;
        <br>println(x); // Error: x has no value
    - You may not declare the same variable twice.
        - int x;
        <br> int x; // ERROR: x already exists
        <br> int y = 3;
        <br> int y = 5; // Error: y already exists

- Reading input and storing in variables
    
    - int intVar = readInt("Prompt Message: ");
    <br> double dVar = readDouble("Prompt Message: ");
    <br> boolean boolVar = readBoolean("Prompt Message: ");
    <br> String strVar = readLine("Prompt Message: ");
    - Note: Values coming from keyboard are always characters. So, all these methods convert

## Expressions
- precedence: Order in which operators are evaluated.
- Generally operators evaluate left-to-right.
    - 1 - 2 - 3 is (1 - 2) - 3 which is -4
- But * / % have a higher level of precedence than + -
    - 1 + 3 * 4 is 13
    - 6 + 8 / 2 * 3
    <br>6 + 4 * 3
    <br>6 + 12
    <br> The final value is 18
- Parentheses can alter order of evaluation, but spacing does not:
    - (1 + 3) * 4 is 16
    <br>1+3 * 4-2 is 11

- When in doubt of the precedence, use parentheses
- Operator Precedence from high to low:
    - ( ) (parentheses)
    - \* (multiplication)  / (division)  % (remainder)
    - \+ (addition)  - (subtraction)
- Same level operators one after another, associate left to right or use parentheses to define
order of eval

- The % operator computes the remainder from integer division.
- Example applications of % operator:
    - Obtain last digit of a number: 230857 % 10 is 7
    - Obtain last 4 digits: 658236489 % 10000 is 6489
    - See whether a number is odd: 7 % 2 is 1, but 42 % 2 is 0

- string concatenation: Using + between a string and another value to make a longer string.
    - "hello" + 42 is "hello42"
    - 1 + "abc" + 2 is "1abc2"
    - "abc" + 1 + 2 is "abc12"
    - 1 + 2 + "abc" is "3abc"
    - "abc" + 9 * 3 is "abc27"
    - "1" + 1 is "11" 
    - 4 - 1 + "abc" is "3abc"
- Use + to print a string and an expression's value together.
    - println("Average: " + (95.1 + 71.9) / 2);
    <br> Output: Average: 83.5

- Integer Division
    - println(1 / 2);
- Division and type
    - **int** and **int** results in an **int**
    - **double** and **double** results in a **double**
    - **int** and **double** results in a **double**
- Beware integer of division when you write expressions
    - double c = 100;
    <br> double f = 9 / 5 * c + 32;
    <br> result?
- Practice:
     - 5 + 3 / 2 - 4 2
     - 15 / 2.0 + 6 13.5
     - 1 * 2 + 3 * 5 % 4 11
     - "abc" + 1 + 2 "abc12"
     - "abc" + (1 + 2) "abc3"


- Writing Literals for Various Variable types






