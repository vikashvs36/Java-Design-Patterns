package StructuralDesignPatterns.Composite.example2.test;

import StructuralDesignPatterns.Composite.example2.bean.Directory;
import StructuralDesignPatterns.Composite.example2.bean.File;

public class Test {

    public static void main(String[] args) {
        File pdf=new File("PDF");
        File text=new File("txt");
        File xls=new File("xls");
        File xlsx=new File("xlsx");
        File java=new File("java");
        File c=new File("c");
        File cpp=new File("cpp");

        Directory pdfFormate=new Directory("PDF_Formate");
        Directory ExcelFormate=new Directory("Excel_Formate");
        Directory wordFormate=new Directory("Word_Formate");
        Directory program=new Directory("program_Formate");
        Directory D_drive=new Directory("D_drive");

        ExcelFormate.add(xls);
        pdfFormate.add(pdf);
        ExcelFormate.add(xlsx);
        ExcelFormate.add(wordFormate);
        wordFormate.add(text);
        program.add(java);
        program.add(c);
        program.add(cpp);
        D_drive.add(program);
        D_drive.add(wordFormate);
        D_drive.add(pdfFormate);
        D_drive.add(ExcelFormate);

//        pdfFormate.CDF();
//        ExcelFormate.CDF();
//        wordFormate.CDF();
//        program.CDF();
        D_drive.CDF();
    }
}
