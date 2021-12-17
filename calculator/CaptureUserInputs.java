package calculator;

import java.util.*;

public class CaptureUserInputs
{

    //Captures if the user wants to quit the program.
    public static String captureIfUserWantsToQuit(Scanner input)
    {
        return input.next();
    }

    //Captures a number from the user to be used in the computation.
    public static double captureUserNumber(Scanner input)
    {
        return input.nextDouble();
    }

    //Captures an integer from the user, which corresponds to the desired operation.
    public static int captureUserOperation(Scanner input)
    {
        return input.nextInt();
    }


}
