/** Tests for class Calculator
* @author Alejandro Costa
* @version 0.1
**/
public class TestCalculator
{
    public static void main(String[] args)
    {
        Calculator aCalculator = testCreation();
        System.out.println("Result should be 0.0 >>> Result: " + aCalculator.getResult());
    }

    /** Tests if object of class Calculator can be created **/
    public static Calculator testCreation()
    {
        Calculator myCalculator = new Calculator();
        return myCalculator;
    }
}
