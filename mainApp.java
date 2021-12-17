import java.util.*;
import messages.Messages;
import calculator.*;

/*
* Main Calculator application
* @author Alejandro Costa
* @version 1.1 2021-12-10
*/
public class mainApp
{
    public static void main(String[] args)
    {

        boolean continueComputation = true;
        String quit = "q";
        Calculator aCalculator = new Calculator();

        double firstNumber;
        double userNumber;
        int selectedOperation;

        Messages aMessage = new Messages();
        Scanner userInput = new Scanner(System.in);

        aMessage.welcomeMessage();

        while (true)
        {

            aMessage.presentOptionToQuit();
            String userOption = CaptureUserInputs.captureIfUserWantsToQuit(userInput);

            if (userOption.equals(quit))
            {
                break;

            } else
            {

                aMessage.askUserForANumber();
                firstNumber = CaptureUserInputs.captureUserNumber(userInput);
                aCalculator.add(firstNumber);

                do
                {
                    aMessage.askUserWhichOperation();
                    selectedOperation = CaptureUserInputs.captureUserOperation(userInput);
                    switch (selectedOperation)
                    {
                        case 1:
                        aMessage.selectedOperation("addition");
                        break;
                        case 2:
                        aMessage.selectedOperation("subtraction");
                        break;
                        case 3:
                        aMessage.selectedOperation("multiplication");
                        break;
                        case 4:
                        aMessage.selectedOperation("division");
                        break;
                        case 5:
                        aMessage.selectedOperation("stop");
                        break;
                        default:
                        aMessage.selectedOperation("invalid");
                        break;
                    } // closing switch

                    int[] possibleOptions = {1, 2, 3, 4, 5};
                    if (!checkIfUserSelectedOptionIsValid(possibleOptions, selectedOperation))
                        break;

                    if (selectedOperation == 5) break;

                    aMessage.askUserForANumber();
                    userNumber = CaptureUserInputs.captureUserNumber(userInput);
                    if (selectedOperation == 1)
                    {
                        aCalculator.add(userNumber);
                    } else if (selectedOperation == 2)
                    {
                        aCalculator.subtract(userNumber);
                    } else if (selectedOperation == 3)
                    {
                        aCalculator.multiply(userNumber);
                    } else
                    {
                        aCalculator.divide(userNumber);
                    }

                    System.out.println("Current total: " + aCalculator.getResult());

                    aMessage.askUserIfKeepOnComputing();
                    continueComputation = CaptureUserInputs.captureIfUserWantsToKeepComputing(userInput);

                } //closing do
                while (continueComputation == true);

                System.out.println("Total: " + aCalculator.getResult());
                System.out.println("Erasing result...");
                aCalculator.eraseResults();
                System.out.println("Done");

          } // closing else

        } // closing while

    } // closing main method

    public static boolean checkIfUserSelectedOptionIsValid(int[] possibleOperations, int selectedOperation)
    {
        boolean result = false;
        for (int operation: possibleOperations)
        {
            if (operation == selectedOperation)
            {
                result = true;
            }
        }
        return result;
    }

}
