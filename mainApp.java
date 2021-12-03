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

        boolean continueComputation = true;
        String quit = "q";

        System.out.println(welcomeMessage);

        while (continueComputation)
        {
          System.out.print(presentOptionToQuit);
          String userOption = captureIfUserWantsToQuit(in);
          if (userOption.equals(quit))
          {
              break;
          } else
          {
              System.out.print(askUserForANumber);
              double firstNumber = captureUserNumber(in);
              System.out.println(firstNumber);
              //user choose operation
              //user enter second number
              //check result or keep doing computation?
              //if user wants to check result, present the result, then asks if user wants to keep performing computations or stop.
              //if user wants to keep on computations, don't show result and asks about the next operation, and then the next number.
          }
        } // closing while

    } // closing main method

    // messages to user
    public static String welcomeMessage = "Welcome to Calculator!";
    public static String presentOptionToQuit = "Enter 'q' if you want to quit.\n> ";
    public static String askUserForANumber = "Enter the a number\n> ";

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

}
