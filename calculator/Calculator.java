/** Implements a calculator that uses methods defined in the class Operations to perform computations and store the obtained results. Calculator contains methods to show results to the user, to erase the stored results to restart computations, and to increment the stored result with further computations of the four basic arithmetical operations (addition, subtraction, multiplication and division).
* @author Alejandro Costa
* @version 1.0 2021-12-11
**/
public class Calculator
{
    /**
    * {@value result} keeps track of the result of all computations. If you need to recompute everything, you should use the method eraseResults(). To exhibit results, use method getResult().
    * **/
    private double result;

    /**
    * Starts an instance of class Calculator
    **/
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

    /**
    * Erases stored result to allow computations to start from zero again
    **/
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

    /**
    * @param x A double or int
    * Multiplies by x and stores the result. Use method getResult() to access the result of the computation.
    **/
    public void multiply(double x)
    {
        this.result = Operations.multiply(this.result, x);
    }

    /**
    * @param x A double or int
    * Divides by x and stores the result. Use method getResult() to access the result of the computation.
    **/
    public void divide(double x)
    {
        this.result = Operations.divide(this.result, x);
    }

}
