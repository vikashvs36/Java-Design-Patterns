package CreationalDesignPatterns.Singleton.Way3;

public class LazyInitialization {

    private static LazyInitialization lazyInitialization;

    // Create private constructor to don't create object from outside of the class.
    private LazyInitialization(){}

    // Create Method to return Singleton Object
    public static LazyInitialization getInstance(){

        // Check instance already present or not.
        if(lazyInitialization == null){
            lazyInitialization=new LazyInitialization();
        }

        // return object
        return lazyInitialization;
    }
}


   /*
   *
   * In case of the single-threaded environment it works fine but when we use multithreaded systems, it can cause issues
   * if multiple threads are inside the if condition at the same time. It will destroy the singleton pattern and both
   * threads will get the different instances of the singleton class. So in the next section, we will see a thread-safe
   * singleton class.
    */

class LazyInitializationTest{
    public static void main(String[] args) {

        // All times called methods will be give same instance
        for (int i=0; i<5;i++) {
            System.out.println(LazyInitialization.getInstance().hashCode());
        }
    }
}




