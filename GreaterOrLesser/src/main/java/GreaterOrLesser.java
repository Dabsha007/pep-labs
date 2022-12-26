
public class GreaterOrLesser {
    /**
     * Let's say part of a calculator app has to judge whether one number is bigger than another. This problem will
     * require you to use an if/else statement.
     *
     * @param a first number to be compared.
     * @param b second number to be compared.
     * @return  If a is less than b, return the string "Lesser". if a is greater than b, return "Greater".
     *          If neither is true, return "Equal". This problem is case-sensitive!
     */
    public String decide(int a, int b){
        return "Equal";
        int a = 8;
        int b = 8;
        String decide;
    
        if( a <= b){
    System.out.println("Lesser");
        }else if(a >= b){
    System.out.println("Greater");
        }else if(a == b){
    System.out.println("Equal");
        }
    }
    public static void main(String[]args){
        String str = new String("Equal");
        String s = str.decide(8, 8);
        System.out.println(s);
}
}
