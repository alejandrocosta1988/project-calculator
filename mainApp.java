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
          String userOption = askIfUserWantsToQuit(in);
          if (userOption.equals(quit))
          {
              break;
          }
        }

    }

    // messages to user
    public static String welcomeMessage = "Welcome to Calculator!";
    public static String presentOptionToQuit = "Enter 'q' if you want to quit.\n> ";

    // inputs do usuário
    static Scanner in = new Scanner(System.in);

    public static String askIfUserWantsToQuit(Scanner input)
    {
        return input.next();
    }

}
