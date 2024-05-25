package assignment5.assignment5_1;

public class Singleton {
	//The use of volatile ensures proper visibility of the instance variable across threads.
    private static volatile Singleton instance;
    private static int count = 0;

    private Singleton() {
        count++;
    }

    public static Singleton getInstance() {
    	//Double-checked locking is implemented in the getInstance method.
    	if (instance == null) {
        	//The synchronized block ensures that only one thread can create an instance at a time.
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        
    	/*The main method demonstrates creating 10 threads, each
    	calling ThreadSafeSingleton.getInstance().*/
    	for (int i = 0; i < 10; ++i) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton.getInstance();
                }
            }).start();
        }

        // Pause to allow all threads to finish
    	//After allowing some time for the threads to finish, it prints the count.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count: " + count);
    }
}
