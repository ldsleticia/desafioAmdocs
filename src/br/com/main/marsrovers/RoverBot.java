package br.com.main.marsrovers;

/**
 * @author Letícia dos Santos
 *
 */
public class RoverBot {
    private static final Integer N = 1;
    private static final Integer E = 2;
    private static final Integer S = 3;
    private static final Integer W = 4;
    private Integer x = 0;
    private Integer y = 0;
    private Integer facing = N;


    public RoverBot() {
    }

    /**
     * @param x horizontal position of square
     * @param y vertical position of square
     * @param facing Rover point direction
     */
    public void setPosition(Integer x, Integer y, Integer facing) {
        this.x = x;
        this.y = y;
        this.facing = facing;
    }

    /**
     * Method to print directions that Rover was moved
     */
    public void printPosition() {
        char direction = 'N';
        if (facing == 1) {
            direction = 'N';
        } else if (facing == 2) {
            direction = 'E';
        } else if (facing == 3) {
            direction = 'S';
        } else if (facing == 4) {
            direction = 'W';
        }
        System.out.println(x + " " + y + " " + direction);
    }


    /**
     * @param commands list of moves the Rover will make
     */
    public void process(String commands) {
        for (int i = 0; i < commands.length(); i++) {
            process(commands.charAt(i));
        }
    }

    /**
     * Move the Rover through the square
     */
    public void move() {
        if (facing == N.intValue()) {
            this.y++;
        } else if (facing == E.intValue()) {
            this.x++;
        } else if (facing == S.intValue()) {
            this.y--;
        } else if (facing == W.intValue()) {
            this.x--;
        }
    }

    /**
     * This method processes a Rover move on Mars ground based on the possible commands
     *
     * @param command move the rover will make
     */
    public void process(Character command) {
        if (command.equals('L')) {
            turnLeft();
        } else if (command.equals('R')) {
            turnRight();
        } else if (command.equals('M')) {
            move();
        } else {
            throw new IllegalArgumentException("Speak in Mars language, please!");
        }
    }

    /**
     * If facing <b>N</b>orth, direct the Rover to the <b>W</b>est. <br/>Otherwise anti-time direction
     */
    public void turnLeft() {
        if ((facing - 1) < N) {
            facing = W;
        } else {
            facing -= 1;
        }
    }

    /**
     * If facing <b>W</b>est, direct the Rover to the <b>N</b>orth. <br/>Otherwise clockwise direction
     */
    public void turnRight() {
        if ((facing + 1) > W) {
            facing = N;
        } else {
            facing += 1;
        }
    }

    /**
     * Method to convert the input file letter to Integer compass direction
     *
     * @param s Input command to represent compass direction
     * @return Integer compass direction
     */
    public Integer setCompass(String s) {
        switch (s) {
            case "N":
                return N;
            case "E":
                return E;
            case "S":
                return S;
            case "W":
                return W;
        }
        throw new IllegalArgumentException("You don't speak in Mars language, bye bye!");
    }
}