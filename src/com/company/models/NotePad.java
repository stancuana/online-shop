package com.company.models;

public class NotePad extends OfficeSupplie {

    private String pageType;
    private int numberOfPages;
    private String color;
    private String coversType;

    public NotePad(String atribute){

        super(atribute);
        this.pageType=atribute.split(",")[5];
        this.numberOfPages=Integer.parseInt(atribute.split(",")[6]);
        this.color=atribute.split(",")[7];
        this.coversType=atribute.split(",")[8];

    }

    public NotePad(int officeSupplieId, String code, double price, int stock, String pageType, int numberOfPages, String color, String coversType){

        super(officeSupplieId,"NotePad",code,price,stock);
        this.pageType=pageType;
        this.numberOfPages=numberOfPages;
        this.color=color;
        this.coversType=coversType;

    }


    public void setPageType(String pageType){

        this.pageType=pageType;
    }

    public String getPageType(){

        return this.pageType;
    }

    public void setNumberOfPages(int numberOfPages){

        this.numberOfPages=numberOfPages;
    }

    public int getNumberOfPages(){

        return this.numberOfPages;
    }

    public void setColor(String color){

        this.color=color;
    }

    public String getColor(){

        return this.color;
    }

    public void setCoversType(String coversType){

        this.coversType=coversType;
    }

    public String getCoversType(){

        return this.coversType;
    }


    public String descriereNotePad(){

        String text=super.descriereOfficeSupplie();
        text+="Page type: "+getPageType()+"\n";
        text+="Number of pages: "+getNumberOfPages()+"\n";
        text+="Color: "+getColor()+"\n";
        text+="Covers type: "+getCoversType()+"\n";

        return text;
    }
}
