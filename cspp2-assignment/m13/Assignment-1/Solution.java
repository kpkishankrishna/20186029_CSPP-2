import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for set.
 * @author :
 */
class Set {
    //your code goes here...
    //Good luck :-)
    /**
    * Declaring an array list.
    */
    private int[] list;
    /**
    * Declaring a variable size.
    */
    private int size;
    /**
     * Constructs the object.
     */
    Set() {
        size = 0;
        final int magic = 100;
        list = new int[magic];
    }
    /**
     * returns size.
     *
     * @return     returns size.
     */
    public int size() {
        return size;
    }
    /**
     * contains method.
     *
     * @param      item  The item
     *
     * @return     true or false.
     */
    public boolean contains(final int item) {
        for (int i = 0; i < size; i++) {
            if (list[i] == item) {
                return true;
            }
        }
        return false;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        if (size == 0) {
            return "{}";
        }
        String str = "{";
        for (int i = 0; i < size - 1; i++) {
            str += list[i] + ", ";
        }
        return str + list[size - 1] + "}";
    }
    /**
     * add method.
     *
     * @param      item  The item
     */
    public void add(final int item) {
        if (size == list.length) {
            resize();
        }
        if (!contains(item)) {
            list[size++] = item;
        }
    }
    /**
     * resize.
     */
    private void resize() {
        /**.
         * array.
         */
        list = Arrays.copyOf(list, 2 * size);
    }
    /**
     * add all elements.
     *
     * @param      newArray  The new array
     */
    public void add(final int[] newArray) {
        for (int i = 0; i < newArray.length; i++) {
            add(newArray[i]);
        }
    }
    /**
     * intersection.
     *
     * @param      newSet  The new set
     *
     * @return     set.
     */
    public Set intersection(final Set newSet) {
        int[] newArray = newSet.list;
        Set intersect = new Set();
        for (int i = 0; i < size; i++) {
            if (newSet.contains(list[i])) {
                intersect.add(list[i]);
            }
        }
        return intersect;

    }
    /**
     * retain all.
     *
     * @param      newArray  The new array
     *
     * @return     { description_of_the_return_value }
     */
    public Set retainAll(final int[] newArray) {
        Set retain = new Set();
        if (size == 0 || newArray.length == 0) {
            size = 0;
            return retain;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < newArray.length; j++) {
                if (list[i] == newArray[j]) {
                    retain.add(list[i]);
                }

            }
        }
        return retain;
    }
    /**
     * cartesian.
     *
     * @param      newSet  The new set
     *
     * @return     array.
     */
    public int[][] cartesianProduct(final Set newSet) {
        if (size == 0 || newSet.size() == 0) {
            return null;
        }
        int[][] array = new int[size * newSet.size][2];
        int k = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < newSet.size(); j++) {
                array[k][0] = list[i];
                array[k][1] = newSet.get(j);
                k++;
            }
        }
        return array;

    }
    /**
     * gets the particular value in that index.
     *
     * @param      index  The index
     *
     * @return     { description_of_the_return_value }
     */
    public int get(final int index) {
        // Replace the code below to write the code for get
        // if (index < 0 || index >= size) {
        //     return -1;
        // }
        return list[index];
    }
}








/**
 * Solution class for code-eval.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * helper function to convert string input to int array.
     *
     * @param      s     { string input from test case file }
     *
     * @return     { int array from the given string }
     */
    public static int[] intArray(final String s) {
        String input = s;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (s.contains("[")) {
            input = s.substring(1, s.length() - 1);
        }
        return Arrays.stream(input.split(","))
               .mapToInt(Integer::parseInt)
               .toArray();
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this set
        Set s = new Set();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
            case "size":
                System.out.println(s.size());
                break;
            case "contains":
                System.out.println(s.contains(Integer.parseInt(tokens[1])));
                break;
            case "print":
                System.out.println(s);
                break;
            case "add":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    s.add(intArray[0]);
                } else {
                    s.add(intArray);
                }
                break;
            case "intersection":
                s = new Set();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(s.intersection(t));
                break;
            case "retainAll":
                s = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s.retainAll(intArray));
                break;
            case "cartesianProduct":
                s = new Set();
                t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                break;
            default:
                break;
            }
        }
    }
}

