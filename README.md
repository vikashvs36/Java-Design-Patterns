# Java-Design-Patterns
Design patterns implemented using Java. It is very popular among software developers because it's define to solve 
common software problem. 




> ## **INTRODUCTION**
Java Design Patterns are divided into three categories :– 
* Creational design patterns
    * Singleton Pattern
    * Factory Pattern
    * Abstract Factory Pattern
    * Builder Pattern    
    * Prototype Pattern
* Structural design patterns
* Behavioral design patterns.


> ## **Singleton Pattern**
If our requirement is create one one instance per object then we should go for Singleton Pattern. It  is used for 
logging, drivers objects, caching. ie: System class is design in java.
 
    public class Singleton {
    
        // Create private constructor to don't create object of the same class from outside.
        private InnerClassSingleton(){}
    
        // Create inner class
        private static class HelperInner{
            private static final Singleton instance=new Singleton();
        }
    
        // Create getInstance() method to get instance of the Singleton class.
        public static Singleton getInstance(){
            return HelperInner.instance;
        }
    }
 
 
> ## **Factory Pattern**

Factory pattern is just define an interface or abstract class for creating an object but let the subclasses decide 
which class to instantiate at the runtime. It means single factory class returns the different sub classes bassed 
on the input type provided. 
 
ie:-
 
    Animal dog= AnimalFactory.createFactory("dog"); 
    Animal cat= AnimalFactory.createFactory("cat"); 
 
> ## **Abstract Factory Pattern**
 
Abstract Factory Pattern is similar to the Factory pattern. Abstract factory provides the abstraction for factories.
There is no required to if-else switch case logic like factory design pattern. It makes loosely coupled code and remove
the burden from client to factory. So it's easy to extend.
  
 ie:-
 
    Bank sbiBank= BankFactory.createBank(new SbiFactory());
    Bank iciciBank= BankFactory.createBank(new IciciFactory());
    
> ## **Builder Pattern**
Builder pattern was introduced to solve some of the problems with Factory and Abstract Factory design patterns when the
Object contains a lot of attributes.

    public static class Builder{
        // Optional Data variables
        private String firstName;
        private String lastName;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public User build(){
            return new User(this);
            // return new User(this); // you can use either this or put the all define variable names.
        }
    }
    
    // How to use Builder class
    User emp=new User.Builder().setFirstName("Vikash").build();
    
Note :- There are many disadvantage of to use Builder design pattern.

> ## **Prototype Pattern**
Prototype pattern is used when the object creation is very costly and its takes lots of time and resource and we have
already available the similar object. So this pattern provides a mechanism to copy the original object to a new object 
and then modify it according to our needs

    Company company=new Company();
    company.loadData();
    
    //Use the clone method to get the Employee object
    Company vs= (Company) company.clone();

There are two types of Prototype pattern
 * Shallow cloning
 
 There is a problem with shallow cloning that is, if first reference of the object is changed then all reference of 
 the object is changed.
 
    public class Company implements Cloneable {
    
        private List<String> employees=new ArrayList<>();
        
        // This is called shallow cloning
        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }   

 * Deep cloning
 
 We use deep cloning to overcume of the problem of the shallow cloning.

    public class Company implements Cloneable {
    
        private List<String> employees=new ArrayList<>();
        
        // This is called deep cloning
        @Override
        protected Company clone() throws CloneNotSupportedException {
            List<String> temp=new ArrayList<>();
            for (String s: this.getEmployees()) {
                temp.add(s);
            }
            return new Company(temp);
        }
     }