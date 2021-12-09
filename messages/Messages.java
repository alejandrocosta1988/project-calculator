/*
* Class defined to keep all messages that may be sent to users of Calculator Application.
* @author Alejandro Costa
* @version 0.1 2021-12-07
*/
class Messages
{
    private String welcomeMessage = "\nWelcome to Calculator!";

    public Messages(){};

    // Displays a welcome message to the user
    public void welcomeMessage()
    {
        
        System.out.print(this.welcomeMessage);
    }

}
