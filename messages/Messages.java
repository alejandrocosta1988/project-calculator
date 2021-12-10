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

}
