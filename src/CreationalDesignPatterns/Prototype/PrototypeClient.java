package CreationalDesignPatterns.Prototype;

public class PrototypeClient {

    public static void main(String[] args) throws CloneNotSupportedException {
        Company company=new Company();
        company.setId(1);
        company.loadData();


        //Use the clone method to get the Employee object
        Company vs= (Company) company.clone();
        vs.setId(2);
//        jft.loadData();


        company.getEmployees().remove(2);
        System.out.println(company);
        System.out.println(vs);
    }
}
