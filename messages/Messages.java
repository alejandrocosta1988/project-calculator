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

    private String additionSelected = "Operation selected: addition";
    private String subtractionSelected = "Operation selected: subtraction";
    private String multiplicationSelected = "Operation selected: multiplication";
    private String divisionSelected = "Operation selected: division";
    private String stopSelected = "Operation selected: stop computations";
    private String errorOptionDoesNotExist = "Error: Selected option does not exist.";

    private String askUserIfKeepOnComputing = "Do you want to keep on computing? ('y' or 'n')\n> ";

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

    public void selectedOperation(String operation)
    {
        if (operation.equals("addition"))
        {
            System.out.println(this.additionSelected);
        }
        else if (operation.equals("subtraction"))
        {
            System.out.println(this.subtractionSelected);
        }
        else if (operation.equals("multiplication"))
        {
            System.out.println(this.multiplicationSelected);
        }
        else if (operation.equals("division"))
        {
            System.out.println(this.divisionSelected);
        }
        else if (operation.equals("stop"))
        {
            System.out.println(this.stopSelected);
        }
        else
        {
            System.out.println(this.errorOptionDoesNotExist);
        }
    }//closing operation selection message

    public void askUserIfKeepOnComputing()
    {
        System.out.print(this.askUserIfKeepOnComputing);
    }

}
