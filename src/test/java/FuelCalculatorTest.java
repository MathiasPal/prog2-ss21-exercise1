import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class FuelCalculatorTest {


    /*  100 modules
        fuel per module = (int/3)-2 divison rounded down
        Sum of fuel needed

        Test if file is reachable/readable/Content is right
        Test if 0
        Test if negative number
        Test if calculation is done right

     */


    @Test
    void file_is_available(){
        File f = new File("C:\\Users\\mathi\\IdeaProjects\\prog2-ss21-exercise1\\src\\test\\resources\\PuzzleInput.txt");
        assertTrue(f.exists());
    }

    @Test
    void file_is_not_available(){
        File f = new File("C:\\Users\\mathi\\IdeaProjects\\prog2-ss21-exercise1\\src\\test\\resources\\PuzzleInput2.txt");
        assertFalse(f.exists());
    }

    @Test
    void countLine_is_correct(){
       assertEquals(FuelCalculator.countLine(new File("PuzzleInput")), 100);
    }

    @Test
    void countLine_is_not_correct(){
       assertNotEquals(FuelCalculator.countLine(new File("PuzzleInput")), 101);
    }

    @Test
    void fuelRequirement_Scenario_12() {
        assertEquals(FuelCalculator.fuelRequirement(12),2);
    }

    @Test
    void fuelRequirement_Scenario_14() {
        assertEquals(FuelCalculator.fuelRequirement(14),2);
    }

    @Test
    void fuelRequirement_Scenario_1969() {
        assertEquals(FuelCalculator.fuelRequirement(1969),654);
    }

    @Test
    void fuelRequirement_Scenario_100756() {
        assertEquals(FuelCalculator.fuelRequirement(100756),33583);
    }

    @Test
    void sumFuel() throws FileNotFoundException {
        assertEquals(FuelCalculator.sumFuel(0),3297866);
    }

    @Test
    void fuelPerModule_Scenario_14() {
        assertEquals(FuelCalculator.totalFuelPerModule(14),2);
    }

    @Test
    void fuelPerModule_Scenario_1969() {
        assertEquals(FuelCalculator.totalFuelPerModule(1969),966);
    }

    @Test
    void fuelPerModule_Scenario_100756() {
        assertEquals(FuelCalculator.totalFuelPerModule(100756),50346);
    }

    @Test
    void sumTotalFuel() throws FileNotFoundException {
        assertEquals(FuelCalculator.sumTotalFuel(0),4943923);
    }


}
