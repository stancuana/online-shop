package com.company.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PencilBoxTest {

    @Test public void descrierePlusConstructorAtributeTest(){

        PencilBox pencilBox=new PencilBox(6,"7465748578",17.99,20,4);

        assertEquals("Office supplie ID: 6\n" +
                "Office supplie name: PencilBox\n" +
                "Code: 7465748578\n" +
                "Price: 17.99\n" +
                "Stock: 20\n" +
                "Number of pockets: 4\n",pencilBox.descrierePencilBox());
    }

    @Test public void descrierePlusConstructorTextTest(){

        PencilBox pencilBox=new PencilBox("6,PencilBox,7465748578,17.99,20,4");

        assertEquals("Office supplie ID: 6\n" +
                "Office supplie name: PencilBox\n" +
                "Code: 7465748578\n" +
                "Price: 17.99\n" +
                "Stock: 20\n" +
                "Number of pockets: 4\n",pencilBox.descrierePencilBox());
    }

    @Test public void getSetTest(){

        PencilBox pencilBox=new PencilBox(6,"7465748578",17.99,20,4);

        pencilBox.setNrOfpockets(10);

        assertEquals(10,pencilBox.getNrOfpockets());
    }
}