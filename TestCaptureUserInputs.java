import java.util.*;
import calculator.*;

/**
* Tests for the class CaptureUserInputs of the package calculator.
* @author Alejandro Costa
* @version 0.1 2021-12-14
*/
public class TestCaptureUserInputs
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String testInputString;

        System.out.println("Testing captureIfUserWantsToQuit(): Enter with a string/n> ");
        testInputString = CaptureUserInputs.captureIfUserWantsToQuit(in);
        System.out.println("Result should be what you entered: " + testInputString);


    }
}