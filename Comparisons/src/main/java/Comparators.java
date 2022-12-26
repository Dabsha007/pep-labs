
/**
 * If we want to make programs that "do something", we're going to need to create instructions that change
 * depending on the current state of the program.
 * Therefore, we're inevitably going to run into boolean expressions (ie true/false statements).
 * Let's start with the different ways to compare two numbers, in this case a and b.
 * 
 * Additional Resource if needed: https://www.oreilly.com/library/view/java-for-dummies/9781118239742/a17.html
 */
public class Comparators {
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is equal to b, false otherwise.
     */
    public boolean isEqual(int a, int b){
        return false;
        int a = 8;
        int b = 6; 
        boolean result = (a == b); 
}

    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is greater than b, false otherwise.
     */
    public boolean greaterThan(int a, int b){
        return true;
        int a = 8; 
        int b = 6;
        boolean result = (a > b);  
    }
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is less than b, false otherwise.
     */
    public boolean lessThan(int a, int b){
        return ;
        int a = 8; 
        int b = 6; 
    }
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is greater than or equal to b, false otherwise.
     */
    public boolean greaterThanOrEqualTo(int a, int b){
        return false;
        int a = 6;
        int b = 8; 
    }
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is less than or equal to b, false otherwise.
     */
    public boolean lessThanOrEqualTo(int a, int b){
        return false;
        int a = 8; 
        int b = 6; 

    }

    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is not equal to b, false otherwise.
     */
    public boolean notEqualTo(int a, int b){
        return false;
        int a = 8;
        int b = 8;
    }
}
public static void main (String []args){
    Comparators c = new Comparators(); 
    boolean return1 = c.isEqual(8, 6); 
    System.out.println(return1); 

    boolean return2 = c.greaterThan(6, 8); 
    System.out.println(return2); 

    boolean return3 = c.lessThan(8, 6);
    System.out.println(return3 ); 

    boolean return4 = c.greaterThanOrEqualTo(6, 8); 
    System.out.println(return4); 

    boolean return5 = c.lessThanOrEqualTo(8, 6); 
    System.out.println(return5); 

    boolean return6 = c.notEqualTo(8, 8);
    System.out.println(return6); 

}
}