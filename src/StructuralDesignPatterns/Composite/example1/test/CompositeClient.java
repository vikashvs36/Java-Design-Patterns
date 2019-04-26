package StructuralDesignPatterns.Composite.example1.test;

import StructuralDesignPatterns.Composite.example1.bean.Composite;
import StructuralDesignPatterns.Composite.example1.bean.Leaf;
import StructuralDesignPatterns.Composite.example1.bean.Organization;

public class CompositeClient {

    public static void main(String[] args) {


        Composite composite=new Composite("Company");
        Composite department1=new Composite("Managment");
        Organization gMTeamSize=new Leaf("HR", 50);
        Composite department2=new Composite("IT");
        Organization gITeamSize=new Leaf("Software", 250);

        department1.addOrganization(gMTeamSize);
        department2.addOrganization(gITeamSize);
        composite.addOrganization(department1);
        composite.addOrganization(department2);

        composite.getTeamSize();        // To show company, department and his leaf and team size
//        department2.getTeamSize();      // To show IT department and his leaf and team size
//        gITeamSize.getTeamSize();       // To show leaf and team size


    }
}
