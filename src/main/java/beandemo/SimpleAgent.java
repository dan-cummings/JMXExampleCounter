package beandemo;

import javax.management.*;
import java.lang.management.*;

public class SimpleAgent {
   private MBeanServer mbs = null;

   public SimpleAgent() {

// Get the platform MBeanServer
       mbs = ManagementFactory.getPlatformMBeanServer();
// Unique identification of MBeans
        Counter counterBean;
        try {
            counterBean = new Counter();
      ObjectName counterName = null;
// Uniquely identify the MBeans and register them with the platform MBeanServer 
         counterName = new ObjectName("CounterAgent:name=mynewcounter");
         mbs.registerMBean(counterBean, counterName);
      } catch(Exception e) {
         e.printStackTrace();
      }
   }

 
//  Utility method: so that the application continues to run
   public static void waitForEnterPressed() {
      try {
         System.out.println("Press <enter> to continue...");
         System.in.read();
      } catch (Exception e) {
         e.printStackTrace();
      }
    }
}