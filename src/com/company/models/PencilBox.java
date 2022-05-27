package com.company.models;

public class PencilBox extends  OfficeSupplie {


    private int nrOfpockets;


    public PencilBox(String atribute){

        super(atribute);

        this.nrOfpockets=Integer.parseInt(atribute.split(",")[5]);

    }

    public PencilBox(int officeSupplieId,String code, double price, int stock, int nrOfpockets){

        super(officeSupplieId,"PencilBox",code,price,stock);
        this.nrOfpockets=nrOfpockets;
    }



    public void setNrOfpockets(int nrOfpockets){

        this.nrOfpockets=nrOfpockets;
    }

    public int getNrOfpockets(){

        return this.nrOfpockets;
    }


    public String descrierePencilBox(){

        String text=super.descriereOfficeSupplie();
        text+="Number of pockets: "+getNrOfpockets()+"\n";

        return text;
    }
}
