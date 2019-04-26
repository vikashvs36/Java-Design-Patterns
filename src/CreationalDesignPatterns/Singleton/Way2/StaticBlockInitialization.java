package CreationalDesignPatterns.Singleton.Way2;

public class StaticBlockInitialization {

    private static StaticBlockInitialization staticBlockInitialization;

    // Static method use to create object of the same class, Static block execute only one time in whole life at the time of class is loaded.
    static {
        try{
            staticBlockInitialization=new StaticBlockInitialization();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    // Create private type constructor to don't create object from outside of the class.
    private StaticBlockInitialization(){}

    // To get only one instance of the class.
    public static StaticBlockInitialization getInstance(){
        return staticBlockInitialization;
    }
}

class StaticBlockInitializationTest{
    public static void main(String[] args) {

        // All times called methods are same instance
        for (int i=0; i<5; i++) {
            System.out.println(StaticBlockInitialization.getInstance().hashCode());
        }

    }
}

/*
* Note : Both eager initialization and static block initialization creates the instance even before it’s being used and
* that is not the best practice to use because it has a drawback that instance will created even if user might not be use it ahead.
*
* So, for remove the drawback we should go with Lazy Initialization
* */