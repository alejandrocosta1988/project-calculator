import java.util.*;

/*
* Main Calculator application
* @author Alejandro Costa
* @version 0.1 2021-12-02
*/
public class mainApp
{
    public static void main(String[] args)
    {

        boolean run = true;
        boolean continueComputation = true;
        String quit = "q";
        Calculator aCalculator = new Calculator();

        double firstNumber;
        double userNumber;
        int selectedOperation;

        System.out.println(welcomeMessage);

        while (run)
        {
            System.out.print(presentOptionToQuit);
            String userOption = captureIfUserWantsToQuit(in);
            if (userOption.equals(quit))
            {
                break;
            } else
            {
                System.out.print(askUserForANumber);
                firstNumber = captureUserNumber(in);
                aCalculator.add(firstNumber);
                System.out.println(askUserWhichOperation);
                selectedOperation = captureUserOperation(in);
                switch (selectedOperation)
                {
                    case 1:
                        System.out.println(additionSelected);
                        break;
                    case 2:
                        System.out.println(subtractionSelected);
                        break;
                    case 3:
                        System.out.println(multiplicationSelected);
                        break;
                    case 4:
                        System.out.println(divisionSelected);
                        break;
                    case 5:
                        System.out.println(stopSelected);
                        break;
                    default:
                        System.out.println(errorOptionDoesNotExist);
                        break;
                } // closing switch

                System.out.print(askUserForANumber);
                userNumber = captureUserNumber(in);
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



              //check result or keep doing computation?
              //if user wants to check result, present the result, then asks if user wants to keep performing computations or stop.
              //if user wants to keep on computations, don't show result and asks about the next operation, and then the next number.

          } // closing else

        } // closing while

    } // closing main method

    // messages to user
    public static String welcomeMessage = "Welcome to Calculator!";
    public static String presentOptionToQuit = "Enter 'q' if you want to quit.\n> ";
    public static String askUserForANumber = "Enter a number\n> ";
    public static String askUserWhichOperation = "Choose the number corresponding to the desired operation:\n1 for addition\n2 for subtraction\n3 for multiplication\n4 for division\n5 to stop computations> ";
    public static String additionSelected = "Operation selected: addition";
    public static String subtractionSelected = "Operation selected: subtraction";
    public static String multiplicationSelected = "Operation selected: multiplication";
    public static String divisionSelected = "Operation selected: division";
    public static String stopSelected = "Operation selected: stop computations";
    public static String errorOptionDoesNotExist = "Error: Selected option does not exist.";


    // inputs do usuário
    static Scanner in = new Scanner(System.in);

    public static String captureIfUserWantsToQuit(Scanner input)
    {
        return input.next();
    }

    public static double captureUserNumber(Scanner input)
    {
        return input.nextDouble();
    }

    public static int captureUserOperation(Scanner input)
    {
        return input.nextInt();
    }

}
