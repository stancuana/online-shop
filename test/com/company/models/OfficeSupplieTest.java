package com.company.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfficeSupplieTest {

    @Test public void descrierePlusConstructorAtributeTest(){


        OfficeSupplie officeSupplie=new OfficeSupplie(1,"pen","4005000123",22.5,200);

        assertEquals("Office supplie ID: 1\n" +
                "Office supplie name: pen\n" +
                "Code: 4005000123\n" +
                "Price: 22.5\n" +
                "Stock: 200\n",officeSupplie.descriereOfficeSupplie());


    }

    @Test public void descrierePlusConstructorTextTest(){

        OfficeSupplie officeSupplie=new OfficeSupplie("1,notepad,1230987635,50.99,50");

        assertEquals("Office supplie ID: 1\n" +
                "Office supplie name: notepad\n" +
                "Code: 1230987635\n" +
                "Price: 50.99\n" +
                "Stock: 50\n",officeSupplie.descriereOfficeSupplie());
    }

    @Test public void getSetTest(){

        OfficeSupplie officeSupplie=new OfficeSupplie("1,notepad,1230987635,50.99,50");

        officeSupplie.setOfficeSupplieId(2);
        assertEquals(2,officeSupplie.getOfficeSupplieId());

        officeSupplie.setName("pen");
        assertEquals("pen",officeSupplie.getName());

        officeSupplie.setCode("5555566666");
        assertEquals("5555566666",officeSupplie.getCode());

        officeSupplie.setPrice(45.5);
        assertEquals(45.5,officeSupplie.getPrice());

        officeSupplie.setStock(40);
        assertEquals(40,officeSupplie.getStock());
    }

}