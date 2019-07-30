package beandemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String argv[]) {
        SimpleAgent agent = new SimpleAgent();
        System.out.println("SimpleAgent is running...");
        SimpleAgent.waitForEnterPressed();
     }
}
