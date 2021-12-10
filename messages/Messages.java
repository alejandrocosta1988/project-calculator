package messages;
/*
* Class defined to keep all messages that may be sent to users of Calculator Application.
* @author Alejandro Costa
* @version 0.1 2021-12-07
*/
public class Messages
{
    private String welcomeMessage = "\nWelcome to Calculator!";
    private String presentOptionToQuit = "Enter 'q' if you want to quit.\n> ";
    private String askUserForANumber = "Enter a number\n> ";
    private String askUserWhichOperation = "Choose the number corresponding to the desired operation:\n1 for addition\n2 for subtraction\n3 for multiplication\n4 for division\n5 to stop computations\n> ";

    public Messages(){};

    // Displays a welcome message to the user
    public void welcomeMessage()
    {
        System.out.println(this.welcomeMessage);
    }

    public void presentOptionToQuit()
    {
        System.out.print(this.presentOptionToQuit);
    }

    public void askUserForANumber()
    {
        System.out.print(this.askUserForANumber);
    }

    public void askUserWhichOperation()
    {
        System.out.print(this.askUserWhichOperation);
    }

}
