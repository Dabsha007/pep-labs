
public class Pyramid {
    /**
     * Return a string that is a pyramid of size n, made of of asterisks and no spaces.
     *     for example:
     *
     *     size 3:
     *     *
     *     **
     *     ***
     *
     *     size 5:
     *     *
     *     **
     *     ***
     *     ****
     *     *****
     *
     * The newline character can be written as \n .
     * The tests will not be affected by a newline character at the beginning or end of the entire pyramid.
     *
     * Here's a hint: you could use a for loop inside of a for loop for this problem. The outer for loop
     * can determine the current 'row', and the inner for loop can print an asterisk an amount of times based on the
     * current 'row'.
     *
     * @param n the size of the pyramid.
     * @return a string representation of the pyramid.
     */
    public String returnPyramid(int n){
        String Pyrmaid = n;                    // i wrote this line of code
        if(int i = 0; i <= n.lenght ; i++ ){   // i wrote this line of code
            Pyrmaid = Pyrmaid + i + "";        // i wrote this line of code

        }
        return "Pyramid";                      // i wrote this Pyramid the return was empty " ";
    }
}
