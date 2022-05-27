package com.company.models;

public class Pen extends OfficeSupplie{

    private String inkColor;
    private String inkType;


    public Pen(String atribute){

        super(atribute);
        this.inkColor=atribute.split(",")[5];
        this.inkType=atribute.split(",")[6];
    }

    public Pen(int officeSupplieId, String code, double price, int stock,String inkColor, String inkType){

        super(officeSupplieId,"Pen",code,price,stock);
        this.inkColor=inkColor;
        this.inkType=inkType;
    }


    public void setInkColor(String inkColor){

        this.inkColor=inkColor;
    }

    public String getInkColor(){

        return this.inkColor;
    }

    public void setInkType(String inkType){

        this.inkType=inkType;
    }

    public String getInkType(){

        return this.inkType;
    }


    public String descrierePen(){

        String text=super.descriereOfficeSupplie();
        text+="Ink color: "+getInkColor()+"\n";
        text+="Ink type: "+getInkType()+"\n";

        return text;

    }
}
