package beandemo;

/**
 * Main class which creates the simple agent object to instantiate our mBean and register it with the management server.
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
