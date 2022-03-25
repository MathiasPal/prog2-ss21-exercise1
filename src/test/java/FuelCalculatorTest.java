import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Scanner;

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
    File f = new File("C:\\Users\\mathi\\IdeaProjects\\prog2-ss21-exercise1\\src\\test\\resources\\PuzzleInput");
    assertTrue(f.exists());
    }

    private void assertTrue(boolean exists) {
    }

    @Test
    void file_has_modules(){

    }

    @Test
    void number_of_modules_is_correct(){

    }

    @Test
    void modules_are_not_0(){

    }

    @Test
    void modules_are_not_negative(){

    }


}
