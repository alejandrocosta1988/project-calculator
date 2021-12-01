/** Implements a calculator with methods to add, subtract, multiply and divide
* @author Alejandro Costa
* @version 0.1 2021-11-30
**/
public class Calculator
{

    private double result;

    public Calculator()
    {
        result = 0;
    }

    public double getResult()
    {
        return this.result;
    }

    public void add(double x, double y)
    {
        double additionResult = x + y;
        this.result += additionResult;
    }

    public void eraseResult()
    {
        this.result = 0;
    }
}
