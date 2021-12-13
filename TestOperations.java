import calculator.Operations;
/* Implements tests for class Operations
* @author Alejandro Costa
* @version 0.1 2021-12-02
*/
public class TestOperations
{
    public static void main(String[] args)
    {
        System.out.println("Testing method add()...");
        System.out.println("Result should be 2.0. >>> Result: " + Operations.add(1, 1));
        System.out.println("Ok");

        System.out.println("Testing method subtract()...");
        System.out.println("Result should be 2.0. >>> Result: " + Operations.subtract(7, 5));
        System.out.println("Ok");

        System.out.println("Testing method multiply()...");
        System.out.println("Result should be 10.0. >>> Result: " + Operations.multiply(2, 5));
        System.out.println("Ok");

        System.out.println("Testing method divide()...");
        System.out.println("Result should be 2.0. >>> Result: " + Operations.divide(4, 2));
        System.out.println("Ok");
    }
}
