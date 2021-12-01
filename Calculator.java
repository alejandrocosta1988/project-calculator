/** Implements a calculator with methods to add, subtract, multiply and divide
* @author Alejandro Costa
* @version 0.1 2021-11-30
**/
public class Calculator
{
    /**
    * {@value result} keeps track of the result of all computations. If you need to recompute everything, you should use the method eraseResults().
    * **/
    private double result;

    public Calculator()
    {
        result = 0;
    }

    /**
    * Displays the result stored in the Calculator.
    **/
    public double getResult()
    {
        return this.result;
    }

    /**
    * @param x A double or int
    * @param y A double or int
    * Adds a and b and stores the result of the computation in the Calculator result. Use method getResult() to access the result of the computation.
    **/
    public void add(double x, double y)
    {
        double additionResult = x + y;
        this.result += additionResult;
    }

    /**
    * Erases the results of all computations. The value of result is set back to zero.
    **/
    public void eraseResult()
    {
        this.result = 0;
    }
}
