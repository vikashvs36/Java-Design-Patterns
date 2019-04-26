package StructuralDesignPatterns.Composite.example1.bean;

public class Leaf implements Organization {

    String name;
    int teamSize;

    public Leaf(String name, int teamSize) {
        this.name = name;
        this.teamSize = teamSize;
    }

    @Override
    public void getTeamSize() {
        System.out.println(name+" : "+teamSize);
    }
}
