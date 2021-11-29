package br.com.main.marsrovers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        RoverBot rover = new RoverBot();
        Path current = Paths.get("");
        String fileName = current.toAbsolutePath().toString();
        Path path;
        List<String> lines;
        try {
            path = Paths.get(fileName, "input.txt");
            lines = Files.lines(path).collect(Collectors.toList());
            String line = lines.get(0);
            String line2 = lines.get(1);
            String line3 = lines.get(2);
            String line4 = lines.get(3);
            String line5 = lines.get(4);
            rover.setPosition(Integer.parseInt(line2.substring(0, 1)),
                    Integer.parseInt(line2.substring(2, 3)),
                    rover.setCompass(line2.substring(4, 5)));
            rover.process(line3);
            rover.printPosition();
            rover.setPosition(Integer.parseInt(line4.substring(0, 1)),
                    Integer.parseInt(line4.substring(2, 3)),
                    rover.setCompass(line4.substring(4, 5)));
            rover.process(line5);
            rover.printPosition();
        } catch (IOException | IllegalArgumentException exp) {
            if (exp instanceof IOException)
                System.out.println("File is invalid!");
            else
                System.out.println(exp.getMessage());
        } catch (Exception e) {
            System.out.println("An error has occurred!");
        }
    }
}
