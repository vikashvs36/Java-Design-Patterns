package CreationalDesignPatterns.Singleton.Way1;

import java.io.*;

public class EagerInitialization implements Cloneable{// implements Serializable {

    // Create a private variable
    private static EagerInitialization eagerInitialization=new EagerInitialization();

    // Create default type private Constructor to anyone couldn't create object from outside.
    private EagerInitialization(){}

    /*protected Object readResolve(){
        return eagerInitialization;
    }*/

    // Create method to get instance of the class
    public static EagerInitialization getInstance(){
        return eagerInitialization;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
//        return super.clone();
    }
}

class EagerInitializationTest{
    public static void main(String[] args) throws Exception {
        // You can not create Instance of Class because of private type method
        // EagerInitialization eagerInitialization=new EagerInitialization();

        /* All getInstance() method will return same instance whatever how many times you call, isn't metter*/
        /*for (int i=0;i<5;i++) {
            System.out.println(EagerInitialization.getInstance().hashCode());
        }*/

        EagerInitialization eagerInitialization=EagerInitialization.getInstance();

        /*ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("/home/vikash-jft/Documents/s2.ser"));
        outputStream.writeObject(eagerInitialization);

        ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("/home/vikash-jft/Documents/s2.ser"));
        EagerInitialization initialization=(EagerInitialization)inputStream.readObject();
        System.out.println(eagerInitialization.hashCode());
        System.out.println(initialization.hashCode());*/

        System.out.println(eagerInitialization.hashCode());
        System.out.println(EagerInitialization.getInstance().clone().hashCode());
    }
}


/*
*
* Note : You can not handle exception when time of creating object in this approach so we should have to go with
* static block
*
* */