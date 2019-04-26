package CreationalDesignPatterns.Singleton.Way4;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton threadSafeSingleton;

    // Create private constructor to don't create object from outside of the class.
    private ThreadSafeSingleton(){}

    // Create Method to return CreationalDesignPatterns.Singleton Object
    public static synchronized ThreadSafeSingleton getInstance(){
        // Check instance already present or not, if not then create object.
        if(threadSafeSingleton == null){
            threadSafeSingleton=new ThreadSafeSingleton();
        }
        // return object
        return threadSafeSingleton;
    }
}

/*
* Note : Above implementation works fine and provides thread-safety but it reduces the performance because of the cost
* associated with the synchronized method,
*
* The main problem of this program is it will take more time compare than non-synchronized method.
*
* */

class ThreadSafeSingletonTest{

    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            System.out.println(ThreadSafeSingleton.getInstance().hashCode());
        }
    }
}

