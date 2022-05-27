package com.company.controllers;

import com.company.models.CopyPaper;
import com.company.models.NotePad;
import com.company.models.OfficeSupplie;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllOfficeSupplieTest {

    @Test public void loadAfisareTest(){

        ControllOfficeSupplie controllOfficeSupplie=new ControllOfficeSupplie();
        controllOfficeSupplie.afisare();
    }

    @Test public void nrElemListaTest(){

        ControllOfficeSupplie controllOfficeSupplie=new ControllOfficeSupplie();
        assertEquals(5,controllOfficeSupplie.nrElemLista());
    }

    @Test public void addOfficeSupplieTest(){

        NotePad notePad=new NotePad("4,NotePad,11223454,33.5,300,line,50,red,cardboard");
        ControllOfficeSupplie controllOfficeSupplie=new ControllOfficeSupplie();
        int nrInitial=controllOfficeSupplie.nrElemLista();
        controllOfficeSupplie.addOfficeSupplie(notePad);

        assertEquals(nrInitial+1,controllOfficeSupplie.nrElemLista());

    }

    @Test public void updateTest(){

        NotePad notePad=new NotePad(4,"11223454",33.5,300,"line",50,"red","cardboard");

        ControllOfficeSupplie controllOfficeSupplie=new ControllOfficeSupplie();

        controllOfficeSupplie.update(notePad);

        controllOfficeSupplie.afisare();

    }

    @Test public void deleteTest(){

        ControllOfficeSupplie controllOfficeSupplie=new ControllOfficeSupplie();

        controllOfficeSupplie.delete(2);

        controllOfficeSupplie.afisare();

    }

    @Test public void listaProduseTest(){

        ControllOfficeSupplie controllOfficeSupplie=new ControllOfficeSupplie();

        controllOfficeSupplie.listaNumeProduse();
    }

    @Test public void bubbleSortAlfabeticTest(){

        ControllOfficeSupplie controllOfficeSupplie=new ControllOfficeSupplie();
        controllOfficeSupplie.bubbleSortAlfabetic();

    }

    @Test public void returnProdusByNameTest(){

        ControllOfficeSupplie controllOfficeSupplie=new ControllOfficeSupplie();
        System.out.println(controllOfficeSupplie.returnProdusByName("PencilBox").descriereOfficeSupplie());

    }

    @Test public void verificareStockTest(){

        NotePad notePad=new NotePad("4,NotePad,11223454,33.5,0,line,50,red,cardboard");
        ControllOfficeSupplie controllOfficeSupplie=new ControllOfficeSupplie();
        controllOfficeSupplie.verificareStock(notePad);

    }

    @Test public void numarDeProdusedisponibileTest(){

        NotePad notePad=new NotePad("4,NotePad,11223454,33.5,10,line,50,red,cardboard");
        ControllOfficeSupplie controllOfficeSupplie=new ControllOfficeSupplie();
        assertEquals(10,controllOfficeSupplie.nrDeProduseDisponibile(notePad));

    }

    @Test public void pozOfficeSupplie(){

        ControllOfficeSupplie controllOfficeSupplie=new ControllOfficeSupplie();

        assertEquals(0,controllOfficeSupplie.pozOfficeSupplie(1));
    }

}