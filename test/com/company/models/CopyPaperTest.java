package com.company.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CopyPaperTest {


    @Test public void descrierePlusConstructorAtributeTest(){

        CopyPaper copyPaper=new CopyPaper(3,"6574838746",11.5,300,2,"fabric","A4");

        assertEquals("Office supplie ID: 3\n" +
                "Office supplie name: CopyPaper\n" +
                "Code: 6574838746\n" +
                "Price: 11.5\n" +
                "Stock: 300\n" +
                "Thickness: 2\n" +
                "Composition: fabric\n" +
                "Format: A4\n",copyPaper.descriereCopyPaper());
    }

    @Test public void descrierePlusConstructorTextTest(){

        CopyPaper copyPaper=new CopyPaper("3,CopyPaper,6574838746,11.5,300,2,fabric,A4");

        assertEquals("Office supplie ID: 3\n" +
                "Office supplie name: CopyPaper\n" +
                "Code: 6574838746\n" +
                "Price: 11.5\n" +
                "Stock: 300\n" +
                "Thickness: 2\n" +
                "Composition: fabric\n" +
                "Format: A4\n",copyPaper.descriereCopyPaper());

    }

    @Test public void setGetTest(){

        CopyPaper copyPaper=new CopyPaper("3,CopyPaper,6574838746,11.5,300,2,fabric,A4");

        copyPaper.setThickness(3);
        assertEquals(3,copyPaper.getThickness());

        copyPaper.setComposition("fiber");
        assertEquals("fiber",copyPaper.getComposition());

        copyPaper.setFormat("A3");
        assertEquals("A3",copyPaper.getFormat());
    }

}