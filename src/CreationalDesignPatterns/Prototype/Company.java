package CreationalDesignPatterns.Prototype;


import java.util.ArrayList;
import java.util.List;

public class Company implements Cloneable {

    private int id;
    private List<String> employees=new ArrayList<>();

    public Company() { }

    public Company(List<String> employees) {
        this.employees = employees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getEmployees() {
        return employees;
    }

    public void setEmployees(List<String> employees) {
        this.employees = employees;
    }

    public void loadData(){
        for (int i=1;i<=10;i++){
            getEmployees().add("employee"+i);
        }
    }

    // There are two types of cloning first one is shallow cloning and second one is deep cloning.
    // This is called shallow cloning
    /*@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/

    // This is called deep cloning
    @Override
    protected Company clone() throws CloneNotSupportedException {
        List<String> temp=new ArrayList<>();
        for (String s: this.getEmployees()) {
            temp.add(s);
        }
        return new Company(temp);
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", employees=" + employees +
                '}';
    }
}
