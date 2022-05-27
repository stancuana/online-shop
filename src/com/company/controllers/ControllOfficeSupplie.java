package com.company.controllers;

import com.company.models.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllOfficeSupplie {

    private ArrayList<OfficeSupplie> officeSupplies;

    public void load() {
        try {

            File file = new File("c:\\mycode\\JavaBasics\\OOP\\mostenirea\\Tema7OnlineShop\\src\\com\\company\\resources\\officeSupplies.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {

                String text = scanner.nextLine();

                if(text.split(",")[1].equals("CopyPaper")){
                    CopyPaper copyPaper=new CopyPaper(text);
                    officeSupplies.add(copyPaper);
                }

                if(text.split(",")[1].equals("NotePad")){
                    NotePad notePad=new NotePad(text);
                    officeSupplies.add(notePad);
                }

                if(text.split(",")[1].equals("Pen")) {
                    Pen pen = new Pen(text);
                    officeSupplies.add(pen);
                }

                if(text.split(",")[1].equals("PencilBox")){

                    PencilBox pencilBox=new PencilBox(text);
                    officeSupplies.add(pencilBox);
                }

                if(text.split(",")[1].equals("Scissors")){

                    Scissors scissors=new Scissors(text);
                    officeSupplies.add(scissors);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ControllOfficeSupplie(){
        officeSupplies=new ArrayList<>();
        load();
    }

    public void addOfficeSupplie(OfficeSupplie officeSupplie){

        if(officeSupplie.getName().equals("CopyPaper")){

            CopyPaper copyPaper=(CopyPaper) officeSupplie;
            officeSupplies.add(copyPaper);
        }

        if(officeSupplie.getName().equals("NotePad")){

            NotePad notePad=(NotePad) officeSupplie;
            officeSupplies.add(notePad);
        }

        if(officeSupplie.getName().equals("Pen")){

            Pen pen=(Pen) officeSupplie;
            officeSupplies.add(pen);
        }

        if(officeSupplie.getName().equals("PencilBox")){

            PencilBox pencilBox=(PencilBox) officeSupplie;
            officeSupplies.add(pencilBox);
        }

        if(officeSupplie.getName().equals("Scissors")){

            Scissors scissors=(Scissors) officeSupplie;
            officeSupplies.add(scissors);
        }
    }

    public void afisare(){

        for(int i=0; i<officeSupplies.size();i++){

           if(officeSupplies.get(i) instanceof CopyPaper){

               System.out.println(((CopyPaper) officeSupplies.get(i)).descriereCopyPaper());
           }
           if(officeSupplies.get(i) instanceof NotePad){

               System.out.println(((NotePad) officeSupplies.get(i)).descriereNotePad());
           }
           if(officeSupplies.get(i) instanceof Pen){

               System.out.println(((Pen) officeSupplies.get(i)).descrierePen());
           }
           if(officeSupplies.get(i) instanceof PencilBox){

               System.out.println(((PencilBox) officeSupplies.get(i)).descrierePencilBox());
           }
           if(officeSupplies.get(i) instanceof Scissors){

               System.out.println(((Scissors) officeSupplies.get(i)).descriereScissors());
           }
        }
    }

    public int pozOfficeSupplie(int id){

        int poz=-1;

        for(int i=0; i<officeSupplies.size();i++){

            if(officeSupplies.get(i).getOfficeSupplieId()==id) {

                poz = i;
            }
        }
        return poz;
    }

    public void update(OfficeSupplie officeSupplie){

        int poz=pozOfficeSupplie(officeSupplie.getOfficeSupplieId());

        if(poz!=-1){

            if(officeSupplies.get(poz) instanceof CopyPaper){

                CopyPaper copyPaper=(CopyPaper) officeSupplies.get(poz);
                CopyPaper nou=(CopyPaper) officeSupplie;

                copyPaper.setComposition(nou.getComposition());
                copyPaper.setFormat(nou.getFormat());
                copyPaper.setThickness(nou.getThickness());
            }

           if(officeSupplies.get(poz) instanceof  NotePad){

                NotePad notePad=(NotePad) officeSupplies.get(poz);
                NotePad nou=(NotePad) officeSupplie;

                notePad.setColor(nou.getColor());
                notePad.setCoversType(nou.getCoversType());
                notePad.setNumberOfPages(nou.getNumberOfPages());
                notePad.setPageType(nou.getPageType());
           }

            if(officeSupplies.get(poz) instanceof Pen){

                Pen pen=(Pen) officeSupplies.get(poz);
                Pen nou=(Pen) officeSupplie;

                pen.setInkType(nou.getInkType());
                pen.setInkColor(nou.getInkColor());
            }

            if(officeSupplies.get(poz) instanceof PencilBox){

                PencilBox pencilBox=(PencilBox) officeSupplies.get(poz);
                PencilBox nou=(PencilBox) officeSupplie;

                pencilBox.setNrOfpockets(nou.getNrOfpockets());
            }

            if(officeSupplies.get(poz) instanceof Scissors){

                Scissors scissors=(Scissors) officeSupplies.get(poz);
                Scissors nou=(Scissors) officeSupplie;

                scissors.setBladesLength(nou.getBladesLength());
                scissors.setHandlesMaterial(nou.getHandlesMaterial());
            }
        }
    }

    public void delete(int id){

        int poz=pozOfficeSupplie(id);

        if(poz!=-1) {

            if (officeSupplies.get(poz) instanceof CopyPaper) {
                officeSupplies.remove(poz);
            }
            if (officeSupplies.get(poz) instanceof NotePad) {
                officeSupplies.remove(poz);
            }
            if (officeSupplies.get(poz) instanceof Pen) {
                officeSupplies.remove(poz);
            }
            if (officeSupplies.get(poz) instanceof PencilBox) {
                officeSupplies.remove(poz);
            }
            if (officeSupplies.get(poz) instanceof Scissors) {
                officeSupplies.remove(poz);
            }
        }
   }

   public int nrElemLista(){

        int contor=0;

        for(int i=0; i<officeSupplies.size();i++){

            contor++;
        }
        return contor;
   }

   public void listaNumeProduse(){

        for(int i=0; i<officeSupplies.size();i++){

            System.out.println(officeSupplies.get(i).getName());
        }
   }

   public void bubbleSortAlfabetic(){

        int flag=1;

        do{

            flag=1;

            for(int i=0; i<officeSupplies.size()-1;i++){

                if(officeSupplies.get(i).getName().compareTo(officeSupplies.get(i+1).getName())>0){

                    OfficeSupplie aux=officeSupplies.get(i);
                    officeSupplies.set(i,officeSupplies.get(i+1));
                    officeSupplies.set(i+1,aux);

                    flag=0;
                }
            }

        }while (flag==0);

        afisare();
   }

   public OfficeSupplie returnProdusByName(String name){

        for(int i=0; i<officeSupplies.size();i++){

            if(officeSupplies.get(i).getName().equals(name)){

                return officeSupplies.get(i);
            }
        }
        return null;
   }

   public void verificareStock(OfficeSupplie officeSupplie){

        if(officeSupplie.getStock()!=0){

            System.out.println("Produsul este in stoc");

        }else{

            System.out.println("Produsul NU mai este in stoc!");
        }
   }

   public int nrDeProduseDisponibile(OfficeSupplie officeSupplie){

       if(officeSupplie.getStock()!=0){

           return officeSupplie.getStock();

       }else{

           System.out.println("Produsul numai este in stock");
       }
        return 0;
   }

}
