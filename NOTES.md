### Console Program
- println & print
	- Console is text entry and display window/screen/device
    - HelloWorld program with println
    -       println("Some Text");
		- quotes does not appear in output
	-       println("Hello Hello");

	        Output:
	        Hello Hello

	        println("1");
	        println("2");

	        Output:
	        1
	        2
    -       print("Hi, Everyone");
            Output:
            Hi, Everyone

            print("1");
            print("2");

            Output:
            12
### Escape sequences
- Escape sequence: A special sequence of characters used to represent certain special characters in a string.
	-       \t 		tab character
	-       \n 		new line character
	-       \" 		quotation mark character
	-       \\ 		backslash character
- To print exactly like this:
    -       This is "important".
- We can write:
    -       println("This is \"important\".");

### AddTwoIntegers Example

# Variables
- location to store some kind of value inside RAM
- has name
- use the name to use the value stored

### Making new variables

    int myVariable;

- Type of variables
	-       int, double, boolean, char
	-       String (technically it's not the type of variable, it's ref type)
	- and many others

- In the above example, **int** (integer) indicates is the type of the variable. And the
name of variable is **myVariable**.

### int vs double

    int

used for counting (how many)

    double

for measurements (how much)

### variable declaration
- Sets aside memory location for storing a value.
- Variables must be declared before they can be used.
- Examples:
    -       int myAge;
    -       double temperature;
    -       String myName
- In general
    -       type name;

### Assignment: Stores a value into a variable.
- assign value to variable
    -       temperature = 27.3;
- temperature is variable name here
- temperature variable must have been declared
- In general,
    -       variableName = expression;
- we'll see what are expressions in a minute

- Assignment Examples:
    -  integer values
    -       int num;
            num = 5;
    - real values
    -       double fraction;
            fraction = 0.2;
    - a single letter
    -       char letter;
            letter = 'c';
    - true or false
    -       boolean isLove;
            isLove = true;
    - use of expression
    -       double myGPA;
            myGPA = 1.0 + 2.25;
### Declare and Initialize
- A variable can be declared/initialized in one statement.
- This is probably the most commonly used declaration syntax.
- Examples:

            double tempF = 98.6;
            int x = (12 / 2) + 3;

Common confusion about equal sign (=)
- In Java and most other programming languages, it means store the value on the right
to the variable on the left.
- It's not algebraic equations.
- The right side expression is evaluated first, and then its result is stored in the variable at left.
- Example:

        int x = 3;
        x = x + 2;

    - What is the vale of x now?

### Assignment and Variable Type
- Consider these:
    -       int x = 2.5; // Error: incompatible types

    -       double myGPA = 4; // this is OK
- In the first case, x can only store 2 ( will loose information).
- In the second case the value 4 is converted to 4.0 double and assign the converted value
<br> to the variable.No information is lost.
- In general, if no information can be lost, Java automatically convert the value on the
<right> to make it compatible with the type of variable.

- Widening and Narrowing

### Common Compiler Errors
- A variable can't be used until it is assigned a value.
    -       int x;
            println(x); // Error: x has no value
- You may not declare the same variable twice.
    -       int x;
            int x; // ERROR: x already exists
            int y = 3;
            int y = 5; // Error: y already exists

### Reading input and storing in variables
    
-       int intVar = readInt("Prompt Message: ");

-       double dVar = readDouble("Prompt Message: ");

-       boolean boolVar = readBoolean("Prompt Message: ");

-       String strVar = readLine("Prompt Message: ");

- Note: Values coming from keyboard are always characters. So, all these methods convert
<br> the incoming character sequences to corresponding variable type.

### Expressions
- Precedence: Order in which operators are evaluated.
- Generally operators evaluate left-to-right.
    -       1 - 2 - 3 is (1 - 2) - 3 which is -4
- But * / % have a higher level of precedence than + -
    -       1 + 3 * 4 is 13
    -       6 + 8 / 2 * 3
            6 + 4 * 3
            6 + 12
            18
- Parentheses can alter order of evaluation, but spacing does not:
    -       (1 + 3) * 4 is 16
    -       1+3 * 4-2 is 11

- When in doubt of the precedence, use parentheses
- Operator Precedence from high to low:
    -       ( ) (parentheses)
    -       * (multiplication)  / (division)  % (remainder)
    -       + (addition)  - (subtraction)
- Same level operators one after another, associate left to right or use parentheses to define
order of eval

- The % operator computes the remainder from integer division.
- Example applications of % operator:
    - Obtain last digit of a number: 230857 % 10 is 7
    - Obtain last 4 digits: 658236489 % 10000 is 6489
    - See whether a number is odd: 7 % 2 is 1, but 42 % 2 is 0

- String concatenation: Using + between a string and another value to make a longer string.
    -       "hello" + 42 is "hello42"
    -       1 + "abc" + 2 is "1abc2"
    -       "abc" + 1 + 2 is "abc12"
    -       1 + 2 + "abc" is "3abc"
    -       "abc" + 9 * 3 is "abc27"
    -       "1" + 1 is "11"
    -       4 - 1 + "abc" is "3abc"
- Use + to print a string and an expression's value together.
    -       println("Average: " + (95.1 + 71.9) / 2);
            Output:
            83.5

### Integer Division
-       println(1 / 2);
- Division and type
    - **int** and **int** results in an **int**
    - **double** and **double** results in a **double**
    - **int** and **double** results in a **double**
- Beware integer of division when you write expressions
    -       double c = 100;
            double f = 9 / 5 * c + 32;
    - result?
- #### Practice:
     -      5 + 3 / 2 - 4       2
     -      15 / 2.0 + 6        13.5
     -      1 * 2 + 3 * 5 % 4   11
     -      "abc" + 1 + 2       "abc12"
     -      "abc" + (1 + 2)     "abc3"


### Writing Literals for Various Variable types






