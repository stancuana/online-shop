package com.company.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScissorsTest {

    @Test public void descrierePlusConstructorAtributeTest(){

        Scissors scissors=new Scissors(7,"5466666654",12,400,"plastic",12);

        assertEquals("Office supplie ID: 7\n" +
                "Office supplie name: Scissors\n" +
                "Code: 5466666654\n" +
                "Price: 12.0\n" +
                "Stock: 400\n" +
                "Handles material: plastic\n" +
                "Blades length: 12\n",scissors.descriereScissors());
    }

    @Test public void descrierePlusConstructorTextTest(){

        Scissors scissors=new Scissors("7,Scissors,5466666654,12,400,plastic,12");

        assertEquals("Office supplie ID: 7\n" +
                "Office supplie name: Scissors\n" +
                "Code: 5466666654\n" +
                "Price: 12.0\n" +
                "Stock: 400\n" +
                "Handles material: plastic\n" +
                "Blades length: 12\n",scissors.descriereScissors());
    }

    @Test public void getSetTest(){

        Scissors scissors=new Scissors("7,Scissors,5466666654,12,400,plastic,12");

        scissors.setBladesLength(10);
        scissors.setHandlesMaterial("wood");

        assertEquals("wood",scissors.getHandlesMaterial());
        assertEquals(10,scissors.getBladesLength());
    }

}