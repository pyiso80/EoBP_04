### What we have learned is
- Get a feel of what it is like programming a computer
- Fundamental programming constructs (found in many programming languages)
- Program design and problem solving techniques

### What is programming?
- Programming is telling a computer how it should do its job.
- Creating computer programs involves many things. It is a set of activities, not just one
activity.
	- You start with a problem to solve using computers.
	- You find a strategy (a recipe) for solving that problem.
	- Implement the algorithm using a programming language.
	- You test and verify the program to make sure it solves the problem as intended.
	- If it doesn't, you fix the error in your program.

OK, now that you understand somewhat what programming is and how to write programs. It can
be beneficial, for our future pursuit of programming skills, to understand these wonderful
and mysterious magical machine works.

## Information/Data, Computing/Computation, Computers and Computer Programs

### Computation
- #### is the manipulation of information by either humans or machines.
### Computers
- #### Machines that do computation (Machines that manipulate information).

### What is information? How it's represented, stored, exchanged?
- Writing (text) , started thousands of years
- Much later, sound, and images comes, started a few hundred years ago
- Before computer's were invented, information is created, processed, and consumed only by
  humans.
- Now, computers consume and transformed information, helping humans in many ways.

## How do we represent information digitally?
- The story start with a switch, which can be in one of the two possible states, on and off.
- A single switch doesn't do much.
- But..., how a bout an array of switches

## Representation of numbers (binary numbers)
		1 bit
		    only two values, 1 and 0
		2 bit
		    4 values, 0, 1, 2 3
		3 bit
		4 bit

		8 bit (commonly called a byte)
		    256 values (0 to 255)
		32 bit, 4 bytes
		    4294967296 values (0 to 4, 294, 967,295)
		    This is over 4294  millions (over 4 billions)
		64 bit, 8 bytes
		    (18.446 trillions ~ 18.446 x 10^18 values)

## How do we represents letters and symbols

We can form arbitrary rules

        0000 = A , 0100 = E , 1000 = I , 1100 , M
        0001 = B , 0101 = F , 1001 = J , 1101 , N
        0010 = C , 0110 = G , 1010 = K , 1110 , O
        0011 = D , 0111 = H , 1011 = L , 1111 , P

(Note:
In communications and information processing, code is a system of rules to convert information)

But if choices were arbitrary, we can't not have a common understanding and exchange is
impossible. So it is standardized, known as ASCII

	LETTERS
		A-Z -> 65 TO 90
		A-Z -> 97 TO 122
	Digits
		0 - 9 -> 48 to 57
	And others
		such as @, $, }
	There are 256 total characters in ASCII code.

There are also characters in ASCII which are not printable but control devices like
monitors and printers. For instance,

	Backspace (represented by 8)

    Horizontal tab (by 9) which moves the printing position right to the next tab stop.

	Line feed (by 10), which moves the print head down one line, or to the left edge and
	<br>down. Used as the end of line marker in most UNIX systems and variants.

	Carriage return,  (by 13) moves the printing position to the start of the line,
	allowing overprinting. Used as the end of line marker in Classic Mac OS, OS-9,
	FLEX (and variants). A CR+LF pair is used by CP/M-80 and its derivatives including
	DOS and Windows, and by Application Layer protocols such as FTP, SMTP, and HTTP.

### What about non English characters, like Chinese, Japanese, Korean
There are so many characters. 1 byte is not enough.

        UTF-8
        UTF-16
        UTF-32

Numbers and characters

### Meaning of Data
 - Assume there are a sequence of 3 bytes somewhere inside computer 01000001, 01000011,
 01000101
    - Are they 65            , 67            , 69?
    - Or are they ASCII encoding for the letters A C E?

 - The meaning of data depends on the context. To make sense of the data, we have to put it
 into some context.

### Representation of pictures
- Digital images are presented as 2 dimensional array of small squares, called pixels.
- 1920x1080 (Full HD),
- To represent a color image, each pixel's color is represented with 3 color values, RGB,
<br> how much of each red, green and blue, using 1 byte for each color value.

### How about videos

### How about audio?

So this is how info is represented in computers.

### High Level View of Computer Today's Computer Systems

- #### CPU

- #### Memory
    - Electronics chips where programs and data to be processed are located (while the
    program is running)
    - Logically, can be viewed as a very long sequence of bytes.
    - Information to be processed (You should know what are they by now)
	- Program Instructions (command that tells the cpu what to do with the data)
	    - Although they are capable of manipulating information, computers by themselves
	    <br> do not consume or transformed information.
	    - We have to write programs to manipulate information in the ways we want.
	    - Programs are translated into instructions (also represented by zeros and ones) CPU
	    <br> understands.
	    - The translated instructions and data are loaded into memory.
	    - By strictly following the instructions in memory one by one, information is
	    <br> processed in the way we want.

- #### Input/Output
    - To receive information coming from outside the system.
    - To transmit or display information to outside of the system

### Let's take a look into more details:

- Writing Programs
- Compiling
- Linking
- Binary Executable
- Running Program