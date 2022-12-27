public class CombineStrings {
    /**
     * You can combine two strings using the '+' operator.
     * For instance, String bigstr = str1 + str2.
     * This method should return the combination of two Strings.
     * @param a the first part of the string to be combined.
     * @param b the second part of the string to be combined.
     * @return the combination of strings a and b.
     */
    public String combine(String a, String b){
        return "";
    }
    public static void main(String[]args){
        CombineStrings c = new CombineStrings(); 
        String str = c.combine("Hi! Nice to Meet You");
        String str1 = c.combine("welcome to Revature"); 
        String combo = c.combine(str + str1); 
        System.out.println(combo); 

    }
}
