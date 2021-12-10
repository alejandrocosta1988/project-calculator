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

    }
}
