package com.company.models;

public class OfficeSupplie {

    private int officeSupplieId;
    private String name;
    private String code;
    private double price;
    private int stock;


    public OfficeSupplie(String atribute){

        this.officeSupplieId=Integer.parseInt(atribute.split(",")[0]);
        this.name=atribute.split(",")[1];
        this.code=atribute.split(",")[2];
        this.price=Double.parseDouble(atribute.split(",")[3]);
        this.stock=Integer.parseInt(atribute.split(",")[4]);
    }

    public OfficeSupplie(int officeSupplieId, String name, String code, double price, int stock){

        this.officeSupplieId=officeSupplieId;
        this.name=name;
        this.code=code;
        this.price=price;
        this.stock=stock;
    }


    public void setOfficeSupplieId(int officeSupplieId){

        this.officeSupplieId=officeSupplieId;
    }

    public int getOfficeSupplieId(){

        return this.officeSupplieId;
    }

    public void setName(String name){

        this.name=name;
    }

    public String getName(){

        return  this.name;
    }

    public void setCode(String code){

        this.code=code;
    }

    public String getCode(){

        return this.code;
    }

    public void setPrice(double price){

        this.price=price;
    }

    public double getPrice(){

        return this.price;
    }

    public void setStock(int stock){

        this.stock=stock;
    }

    public int getStock(){

        return this.stock;
    }


    public String descriereOfficeSupplie(){

        String text="Office supplie ID: "+getOfficeSupplieId()+"\n";
        text+="Office supplie name: "+getName()+"\n";
        text+="Code: "+getCode()+"\n";
        text+="Price: "+getPrice()+"\n";
        text+="Stock: "+getStock()+"\n";

        return text;
    }

}
