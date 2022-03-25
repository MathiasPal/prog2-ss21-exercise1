import java.io.File;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FuelCalculator {
//https://www.geeksforgeeks.org/different-ways-reading-text-file-java/

    protected static int countLine(File PuzzleInput) {
        int lines = 0;
        Path path = Paths.get("C:\\Users\\mathi\\IdeaProjects\\prog2-ss21-exercise1\\src\\test\\resources\\PuzzleInput.txt");
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

    protected static int sumFuel (int sum) throws FileNotFoundException {
        File file = new File("C:\\Users\\mathi\\IdeaProjects\\prog2-ss21-exercise1\\src\\test\\resources\\PuzzleInput.txt");
        Scanner sc = new Scanner(file);
            while(sc.hasNext()) {
                int fuel = fuelRequirement(sc.nextInt());
                sum += fuel;
            }
        return sum;
    }

    protected static int totalFuelPerModule (int mass) {
        int total = 0;
        int fuel = (mass/3)-2;
        int fuelTotal = fuel;
        while(fuel>0) {
            fuel = (fuel/3)-2;
            if(fuel>0) {
                fuelTotal += fuel;
            }
        }
        total += fuelTotal;

        return total;
    }
    protected static int sumTotalFuel (int total) throws FileNotFoundException {

        File file = new File("C:\\Users\\mathi\\IdeaProjects\\prog2-ss21-exercise1\\src\\test\\resources\\PuzzleInput.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNext()) {
            total += totalFuelPerModule(sc.nextInt());
        }
        return total;
    }

}
