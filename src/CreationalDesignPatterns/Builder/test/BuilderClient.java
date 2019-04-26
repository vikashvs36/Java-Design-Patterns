package CreationalDesignPatterns.Builder.test;

import CreationalDesignPatterns.Builder.bean.User;

public class BuilderClient {

    public static void main(String[] args) {

        User user=new User.Builder(1, "Vikash", "Singh").build();
        System.out.println(user);
        User emp=new User.Builder(1, "Rahul", "Singh").setFirstName("Raj").build();
        System.out.println(emp);
    }
}
