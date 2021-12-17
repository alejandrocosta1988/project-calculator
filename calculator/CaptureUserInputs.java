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

    //Captures a string ('y' or 'n') from the user to be used to define if the user wants to keep computing or to restart computations.
    public static boolean captureIfUserWantsToKeepComputing(Scanner input)
    {
        String userOption = input.next();
        boolean result = true;
        if (userOption.equals("n"))
        {
            result = false;
        }
        return result;
    }


}
