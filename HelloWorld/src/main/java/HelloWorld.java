
public class HelloWorld {
    /**
     * This method must return a hello world String, instead of returning "change me".
     * A test case will check if the behavior is as expected.
     * You can use the test results to check for differences.
     * @return "Hello, world!"
     */
    public String sayHello(){
        return "change me";
    }
    public static void main(String[]args){
        HelloWorld hello = new HelloWorld();
        String result = hello.sayHello(); 
        System.out.println(result);
        System.out.println(hello);  

    }
}