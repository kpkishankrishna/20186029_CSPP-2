import java.util.Scanner;

/*
 * In the previous module you have created List ADT.
 * ADTs are developed as reusable libraries
 * i.e., anyone who needs the ADT can use it in their program
 * A program that uses the ADT is called a "client" of the ADT
 * The client typically instantiates an object of the ADT
 * and invokes the public methods on the ADT object.
 *
 * This assignment is to practice the idea of client to the ADT.
 * Client class is Fibonacci and the client needs to use the List ADT
 * to store fibonacci numbers in the List ADT.
 * So, Fibonacci is going to instantiate an object of List ADT
 * generate fibonacci numbers and add them to the list
 * by invoking the add method provided in the List ADT.
 *
 */
/**
 * Class for fibonacci.
 */

public final class Fibonacci {
    /**
     * private Class for fibonacci.
     */
    private Fibonacci() {

    }
    /*
     * fib is a static method takes a argument n
     * n is the count of the fibonacci numbers to be generated.
     * The method returns a List with the n fibonacci numbers.
     *
     * Look for the hint.txt if some of the testcases fail.
     */
    /**
     * list of Fibonacci numbers.
     *
     * @param      nthfibonacci     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static List fib(final int nthfibonacci) {
        // todo - complete this method
        List objectlist = new List(nthfibonacci);
        int numberone = 0, numbertwo = 1;
        objectlist.add(numberone);
        objectlist.add(numbertwo);
        for (int i = 2; i < nthfibonacci; i++) {
            int fibonaccinumber = numberone + numbertwo;
            objectlist.add(fibonaccinumber);
            numberone = numbertwo;
            numbertwo = fibonaccinumber;
        }
        return objectlist;
    }
    /**
     * Main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fib(n));
    }
}

