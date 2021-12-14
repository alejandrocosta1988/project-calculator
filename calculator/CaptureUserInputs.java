package calculator;

import java.util.*;

public class CaptureUserInputs
{

    Scanner in = new Scanner(System.in);

    //Captures if the user wants to quit the program.
    public String captureIfUserWantsToQuit(Scanner input)
    {
        return input.next();
    }


}
