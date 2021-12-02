/** Tests for class Calculator
* @author Alejandro Costa
* @version 0.1
**/
public class TestCalculator
{
    public static void main(String[] args)
    {
        System.out.println("Testing creation of object...");
        Calculator aCalculator = new Calculator();
        System.out.println("Object created");

        System.out.println("Testing the initial result of the calculator...");
        System.out.println("Result should be 0.0 >>> Result: " + aCalculator.getResult());
        System.out.println("OK");

        System.out.println("Testing for addition...");
        aCalculator.add(30);
        System.out.println("Result should be 30.0 >>> Result: " + aCalculator.getResult());
        System.out.println("OK");

        System.out.println("Testing for subtraction...");
        aCalculator.subtract(15);
        System.out.println("Result should be 15.0 >>> Result: " + aCalculator.getResult());
        System.out.println("OK");

        System.out.println("Testing for erasing the results of all computations...");
        aCalculator.eraseResults();
        System.out.println("Result should be 0.0 >>> Result: " + aCalculator.getResult());
        System.out.println("OK");

    }

}
