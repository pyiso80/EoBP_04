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
- writing (text)
- Much later, sound, and images comes
- Before computer's were invented, information is created, processed, and consumed only by
  humans.
- Now,

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
There are also characters in ASCII which are not printable, such as

	Backspace (represented by 8)

    Horizontal tab (by 9) which moves the printing position right to the next tab stop.

	Line feed (by 10), which moves the print head down one line, or to the left edge and down. Used as the end of line marker in most UNIX systems and variants.

	Carriage return,  (by 13) moves the printing position to the start of the line, allowing overprinting. Used as the end of line marker in Classic Mac OS, OS-9, FLEX (and variants). A CR+LF pair is used by CP/M-80 and its derivatives including DOS and Windows, and by Application Layer protocols such as FTP, SMTP, and HTTP.

Unicode Standard
	UTF-8
	UTF-16
	UTF-32

	၁ -> 0x1041

How dow you know

 01000001, 01000011, 01000101
 65.            , 67            , 69				Numbers?
 A C E

Everything just look likes numbers to the computer.

The meaning depends on the context ( which we’ll talk about in a few mins)



	Representation of pictures
		bit depth Color depth or colour depth (see spelling differences), also known as bit depth, is either the number of bits used to indicate the color of a single pixel, in a bitmapped image or video framebuffer, or the number of bits used for each color component of a single pixel.


Digital Pictures (Pixels)
1920x1080 (Full HD),

SELECT LARGE-SCREEN RESOLUTIONS
Resolution name	Horizontal x Vertical pixels	Other names	Devices
8K	7,680x4,320	none	Concept TVs
"Cinema" 4K	4,096x[unspecified]	4K	Projectors
UHD	3,840x2,160	4K, Ultra HD, Ultra-High Definition	TVs
2K	2,048x[unspecified]	none	Projectors
WUXGA	1,920x1,200	Widescreen Ultra Extended Graphics Array	Monitors, projectors
1080p	1,920x1,080	Full HD, FHD, HD, High Definition	TVs, monitors
720p	1,280x720	HD, High Definition	TVs

	Representation of movies
		just a series of images
	Representation of sound

Images,


So this is how info is represented in computers.

The next thing is how these various kind of information are processed by a computer.


Memory
	store information (data)
	Instructions (command that tells the cpu what to do with the data)







A text editor
	Keyboard -> characters
				map to ascii codes

	Calc
		keyboard -> ascii -> convert to interger -> add -> result -> convert to char ->
		sent to display

	what would happen

Hex (just for easier representation, shorter)


How do you know this really is 63 or ?
[data]

Writing Programs
Compiling
Linking
Binary Executable
Running Program (