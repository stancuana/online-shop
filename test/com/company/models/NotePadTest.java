package com.company.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotePadTest {

    @Test public void descrierePlusConstructorAtributeTest(){

        NotePad notePad=new NotePad(4,"11223454",33.5,300,"line",50,"red","cardboard");

        assertEquals("Office supplie ID: 4\n" +
                "Office supplie name: NotePad\n" +
                "Code: 11223454\n" +
                "Price: 33.5\n" +
                "Stock: 300\n" +
                "Page type: line\n" +
                "Number of pages: 50\n" +
                "Color: red\n" +
                "Covers type: cardboard\n",notePad.descriereNotePad());
    }

    @Test public void descrierePlusConstructorTextTest(){

        NotePad notePad=new NotePad("4,NotePad,11223454,33.5,300,line,50,red,cardboard");

        assertEquals("Office supplie ID: 4\n" +
                "Office supplie name: NotePad\n" +
                "Code: 11223454\n" +
                "Price: 33.5\n" +
                "Stock: 300\n" +
                "Page type: line\n" +
                "Number of pages: 50\n" +
                "Color: red\n" +
                "Covers type: cardboard\n",notePad.descriereNotePad());
    }

    @Test public void setGetTest(){

        NotePad notePad=new NotePad("4,NotePad,11223454,33.5,300,line,50,red,cardboard");

        notePad.setPageType("squars");
        notePad.setNumberOfPages(100);
        notePad.setColor("green");
        notePad.setCoversType("thin paper");

        assertEquals("squars",notePad.getPageType());
        assertEquals(100,notePad.getNumberOfPages());
        assertEquals("green",notePad.getColor());
        assertEquals("thin paper",notePad.getCoversType());

    }


}