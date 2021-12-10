import messages.Messages;
/**
* Unit tests for class messages
* @author Alejandro Costa
* @version 0.1 2021-12-09
*/
public class TestMessages
{
    public static void main(String[] args)
    {

        System.out.println();
        System.out.println("Creating object of class Messages...");
        Messages messagesToUser = new Messages();
        System.out.println("Done.\n");

        System.out.println("Exhibiting a welcome message...");
        System.out.println("Result should be 'Welcome to Calculator!'. >>> Result: "); messagesToUser.welcomeMessage();
        System.out.println();
        System.out.println("Done.\n");

        System.out.println("Exhibiting message with option to quit...");
        System.out.println("Result should be 'Enter 'q' if you want to quit.'. >>> Result: "); messagesToUser.presentOptionToQuit();
        System.out.println();
        System.out.println("Done.\n");

        System.out.println("Exhibiting message asking user for a number...");
        System.out.println("Result should be 'Enter a number > '. >>> Result: "); messagesToUser.askUserForANumber();
        System.out.println();
        System.out.println("Done.\n");

        System.out.println("Exhibiting message asking user about which operetation should be computed...");
        System.out.println("Result should be 'Choose the number corresponding to the desired operation: 1 for addition 2 for subtraction 3 for multiplication 4 for division 5 to stop computations > '. >>> Result: ");
        messagesToUser.askUserWhichOperation();
        System.out.println();
        System.out.println("Done.\n");

        System.out.println("Exhibiting message after selection of addition...");
        System.out.println("Result should be 'Operation selected: addition'. >>> Result: ");
        messagesToUser.selectedOperation("addition");
        System.out.println();
        System.out.println("Done.\n");

        System.out.println("Exhibiting message after selection of subtraction...");
        System.out.println("Result should be 'Operation selected: subtraction'. >>> Result: ");
        messagesToUser.selectedOperation("subtraction");
        System.out.println();
        System.out.println("Done.\n");

        System.out.println("Exhibiting message after selection of multiplication...");
        System.out.println("Result should be 'Operation selected: multiplication'. >>> Result: ");
        messagesToUser.selectedOperation("multiplication");
        System.out.println();
        System.out.println("Done.\n");

        System.out.println("Exhibiting message after selection of division...");
        System.out.println("Result should be 'Operation selected: division'. >>> Result: ");
        messagesToUser.selectedOperation("division");
        System.out.println();
        System.out.println("Done.\n");

        System.out.println("Exhibiting message after selection of stop...");
        System.out.println("Result should be 'Operation selected: stop computations'. >>> Result: ");
        messagesToUser.selectedOperation("stop");
        System.out.println();
        System.out.println("Done.\n");

        System.out.println("Exhibiting message after invalid selection...");
        System.out.println("Result should be 'Error: Selected option does not exist.'. >>> Result: ");
        messagesToUser.selectedOperation("invalid");
        System.out.println();
        System.out.println("Done.\n");

        System.out.println("Exhibiting message asking if user wishes to keep computing...");
        System.out.println("Result should be 'Do you want to keep on computing? ('y' or 'n') >'. >>> Result: ");
        messagesToUser.askUserIfKeepOnComputing();
        System.out.println();
        System.out.println("Done.\n");

    }
}
