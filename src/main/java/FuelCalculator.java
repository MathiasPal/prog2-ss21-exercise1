import java.io.File;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FuelCalculator {
//https://www.geeksforgeeks.org/different-ways-reading-text-file-java/

    protected static int countLine(String PuzzleInput) {
        Path path = Paths.get("PuzzleInput");
        int lines = 0;

        try {
            lines = (int) Files.lines(path).count();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    protected static int fuelRequirement(int moduleMass) {
        return (moduleMass/3)-2;
    }
}
