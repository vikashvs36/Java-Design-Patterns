package StructuralDesignPatterns.Composite.example2.bean;

public class File implements AbstractFile {

    public String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void CDF() {
        System.out.println(name);
    }
}
