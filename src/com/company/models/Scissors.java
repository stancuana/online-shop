package com.company.models;

public class Scissors extends OfficeSupplie{

    private String handlesMaterial;
    private int bladesLength;


    public Scissors(String atribute){

        super(atribute);

        this.handlesMaterial=atribute.split(",")[5];
        this.bladesLength=Integer.parseInt(atribute.split(",")[6]);
    }

    public Scissors(int officeSupplieId, String code, double price, int stock,String handlesMaterial, int bladesLength){

        super(officeSupplieId,"Scissors",code,price,stock);

        this.handlesMaterial=handlesMaterial;
        this.bladesLength=bladesLength;

    }


    public void setHandlesMaterial(String handlesMaterial){

        this.handlesMaterial=handlesMaterial;
    }

    public String getHandlesMaterial(){

        return this.handlesMaterial;
    }

    public void setBladesLength(int bladesLength){

        this.bladesLength=bladesLength;
    }

    public int getBladesLength(){

        return this.bladesLength;
    }


    public String descriereScissors(){

        String text=super.descriereOfficeSupplie();
        text+="Handles material: "+getHandlesMaterial()+"\n";
        text+="Blades length: "+getBladesLength()+"\n";

        return text;
    }
}
