package beandemo;

public interface CounterMBeani {

    // Setter Method for the mBean attribute (required)
    public void setCounter(int count);
 
    // Getter method for the mBean attribute (required)
    public int getCounter();

    // Method to print count directly to the console (optional)
    public void tellCount();
    
    // Method to increment the count by 1 (optional)
    public void incrCount();

    // Method to decrement the count by 1 (optional)
    public void decrCount();
 }