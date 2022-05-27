package com.company.views;

import com.company.controllers.ControllOfficeSupplie;
import com.company.models.*;

import java.util.Scanner;

public class ViewCustomer {

    private ControllOfficeSupplie controllOfficeSupplie;
    private Scanner scanner;


    public ViewCustomer(){

        this.controllOfficeSupplie=new ControllOfficeSupplie();
        this.scanner=new Scanner(System.in);
    }

    public void meniu(){

        System.out.println("Apasati tasta 1 pentru a afisa produsele vandute de noi.");
        System.out.println("Apasati tasta 2 pentru a afisa produsele in ordine alfabetica");
        System.out.println("Apasati tasta 3 pentru a verifica daca un anumit produs mai este in stoc");
        System.out.println("Apasati tasta 4 pentru a afisa stocul disponibil al produsului selectat");

    }

    public void play(){

        boolean running=true;

        while(running==true){

            meniu();

            int alegere=Integer.parseInt(scanner.nextLine());

            switch (alegere) {

                case 1: listaProduse();
                break;
                case 2: produseleInOrdineAlfabetica();
                break;
                case 3: verificareDisponibilitateProdus();
                break;
                case 4: stockDisponibil();
                break;
            }
        }
    }

    public void listaProduse(){

        System.out.println("Produsele vandute de noi sunt urmatoarele: \n");

        controllOfficeSupplie.listaNumeProduse();
    }

    public void produseleInOrdineAlfabetica(){

        System.out.println("Produsele asezate in ordine alfabetica sunt urmatoarele: \n");

        controllOfficeSupplie.bubbleSortAlfabetic();
    }

    public void verificareDisponibilitateProdus(){

        System.out.println("Introduceti numele produsului");

        String numeProdus=scanner.nextLine();

        controllOfficeSupplie.verificareStock(controllOfficeSupplie.returnProdusByName(numeProdus));
    }

    public void stockDisponibil(){

        System.out.println("Introduceti numele produsului");

        String numeProdus=scanner.nextLine();

        System.out.println(controllOfficeSupplie.nrDeProduseDisponibile(controllOfficeSupplie.returnProdusByName(numeProdus)));

    }
}


