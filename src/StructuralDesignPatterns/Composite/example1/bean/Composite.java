package StructuralDesignPatterns.Composite.example1.bean;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Organization {

    String name;
    List<Organization> organizations=new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addOrganization(Organization organization){
        organizations.add(organization);
    }

    public void display(){
        System.out.println(name);
    }

    @Override
    public void getTeamSize() {
        System.out.println(name);
        for (Organization organization: organizations){
            organization.getTeamSize();
        }
    }
}
