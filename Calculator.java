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
        this.result = 0;
    }

    /**
    * Displays the result stored in the Calculator.
    **/
    public double getResult()
    {
        return this.result;
    }

    public void eraseResults()
    {
        this.result = 0;
    }

    /**
    * @param x A double or int
    * Adds x and stores the result. Use method getResult() to access the result of the computation.
    **/
    public void add(double x)
    {
        this.result = Operations.add(this.result, x);
    }

    /**
    * @param x A double or int
    * Subtracts x and stores the result. Use method getResult() to access the result of the computation.
    **/
    public void subtract(double x)
    {
        this.result = Operations.subtract(this.result, x);
    }

}
