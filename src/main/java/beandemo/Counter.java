package beandemo;

import javax.management.NotCompliantMBeanException;
import javax.management.StandardMBean;

public class Counter extends StandardMBean implements CounterMBeani {
    private int count = 0;

    public Counter() throws NotCompliantMBeanException {
       super(CounterMBeani.class);
       count = 0;
    }
 
    public Counter(int count) throws NotCompliantMBeanException {
       super(CounterMBeani.class);
       this.count = count;
    }

   @Override
   public void setCounter(int count) {
      this.count = count;
   }

   @Override
   public int getCounter() {
      return count;
   }

   @Override
   public void tellCount() {
      System.out.println("Current count:" + count);
   }

   @Override
   public void incrCount() {
      count++;
   }

   @Override
   public void decrCount() {
      count--;
   }
 }