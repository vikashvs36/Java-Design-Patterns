package StructuralDesignPatterns.Composite.example2.bean;

import java.util.ArrayList;
import java.util.List;

public class Directory implements AbstractFile {

    private String name;
    private List<AbstractFile> files=new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(AbstractFile file){
        files.add(file);
    }

    @Override
    public void CDF() {
        System.out.println(name);
        for (AbstractFile file: files) {
            file.CDF();
        }

    }
}
