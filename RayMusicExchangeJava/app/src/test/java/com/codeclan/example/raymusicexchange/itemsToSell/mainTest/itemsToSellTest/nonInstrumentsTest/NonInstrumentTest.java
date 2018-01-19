package com.codeclan.example.raymusicexchange.itemsToSell.mainTest.itemsToSellTest.nonInstrumentsTest;

import com.codeclan.example.raymusicexchange.itemsToSell.nonInstruments.NonInstrument;
import com.codeclan.example.raymusicexchange.itemsToSell.nonInstruments.typeAndMakeEnums.NonInstrumentMake;
import com.codeclan.example.raymusicexchange.itemsToSell.nonInstruments.typeAndMakeEnums.NonInstrumentType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/01/2018.
 */

public class NonInstrumentTest {


    NonInstrument book;


    @Before
    public void before(){

        book = new NonInstrument(3, 7, "Learn All Music", NonInstrumentType.BOOK, NonInstrumentMake.OMNIRS);

    }


    @Test
    public void canGetName(){
        assertEquals("Learn All Music", book.getName());
    }

    @Test
    public void canGetTypeEnum(){
        assertEquals(NonInstrumentType.BOOK, book.getTypeEnum());
    }

    @Test
    public void canGetMakeEnum(){
        assertEquals(NonInstrumentMake.OMNIRS, book.getMakeEnum());
    }

    @Test
    public void canSetType(){
        book.setType(NonInstrumentType.STRINGS, NonInstrumentType.STRINGS.toString());
        assertEquals(NonInstrumentType.STRINGS, book.getTypeEnum());
    }

    @Test
    public void canSetMake(){
        book.setMake(NonInstrumentMake.AQUILA, NonInstrumentMake.AQUILA.toString());
        assertEquals(NonInstrumentMake.AQUILA, book.getMakeEnum());
    }

    @Test
    public void canGetTypeString(){
        assertEquals("book", book.getTypeString());
    }

    @Test
    public void canGetMakeString(){
        assertEquals("omnirs", book.getMakeString());
    }
}
