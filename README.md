# How this project was developed
This project was developed using Java language with Open JDK 11
and Intellij Idea IDE running in Windows operating system.

The project consists of a console application with data input from a file and output to stdout.

# How to run this project
Import this project in your preferred Java IDE, in my case, Intellij Idea. Run the project in IDE start option. 
After the project run, you will see the result of output in console.

To run in command line, may encounter difficulties to correctly map the input file path.
But after open java files directory, the command is:

$ javac Main.java RoverBot.java && cd ../../../../../

$ cp input.txt ./src/input.txt

$ cd src

$ java br/com/main/marsrovers.Main

If you want, you can change the input data through the file "input.txt".

# Default Input and Output

##Input
5 5

1 2 N

LMLMLMLMM

3 3 E

MMRMMRMRRM

##Output

1 3 N

5 1 E