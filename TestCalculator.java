/** Tests for class Calculator
* @author Alejandro Costa
* @version 0.1
**/
public class TestCalculator
{
    public static void main(String[] args)
    {
        System.out.println("Testing creation of object...");
        Calculator aCalculator = testCreation();
        System.out.println("Object created");
        System.out.println("Testing the initial result of the calculator...");
        System.out.println("Result should be 0.0 >>> Result: " + testInitialResult());
        System.out.println("OK");
    }

    private static Calculator myCalculator = new Calculator();

    /** Tests if object of class Calculator can be created **/
    public static Calculator testCreation()
    {
        Calculator myCalculator = new Calculator();
        return myCalculator;
    }

    /** Tests if the initial result of the calculator is zero **/
    public static double testInitialResult()
    {
        double initialResult = myCalculator.getResult();
        return initialResult;
    }



}
