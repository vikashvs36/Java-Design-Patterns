package CreationalDesignPatterns.Singleton.Way5;

public class InnerClassSingleton {
    // Create private constructor to don't create object of the same class from outside.
    private InnerClassSingleton(){}

    private static class HelperClass{
        private static final InnerClassSingleton instance=new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance(){
        return HelperClass.instance;
    }
}

/*
* When JVM load the same class (InnerClassSingleton) the HelperClass will not load at the same time but it will load
* and create the object of the HelperClass at the time of calling getInstance().
*
* */

class InnerClassTest{
    public static void main(String[] args) {
        for (int i=0; i<5; i++){
            System.out.println(InnerClassSingleton.getInstance().hashCode());
        }
    }
}
