package first;

public class SleepandStart {
 
    private static Object obj = new Object();
    public static void main(String args[]) throws InterruptedException
    {
        Thread.sleep(1000);
        System.out.println("Main Thrad");
        synchronized (obj) 
        {
            obj.wait(1000);
            System.out.println("Object thread");
        }
    }
}
