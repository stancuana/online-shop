package com.company.models;

public class CopyPaper extends OfficeSupplie {

    private int thickness;
    private String composition;
    private String format;


    public CopyPaper(String atribute){

        super(atribute);
        this.thickness=Integer.parseInt(atribute.split(",")[5]);
        this.composition=atribute.split(",")[6];
        this.format=atribute.split(",")[7];
    }

    public CopyPaper(int officeSupplieId, String code, double price, int stock,int thickness, String composition, String format){

        super(officeSupplieId,"CopyPaper",code,price,stock);
        this.thickness=thickness;
        this.composition=composition;
        this.format=format;
    }


    public void setThickness(int thickness){

        this.thickness=thickness;
    }

    public int getThickness(){

        return this.thickness;
    }

    public void setComposition(String composition){

        this.composition=composition;
    }

    public String getComposition(){

        return this.composition;
    }

    public void setFormat(String format){

        this.format=format;
    }

    public String getFormat(){

        return this.format;
    }


    public String descriereCopyPaper(){

        String text=super.descriereOfficeSupplie();
        text+="Thickness: "+getThickness()+"\n";
        text+="Composition: "+getComposition()+"\n";
        text+="Format: "+getFormat()+"\n";

        return text;
    }
}
