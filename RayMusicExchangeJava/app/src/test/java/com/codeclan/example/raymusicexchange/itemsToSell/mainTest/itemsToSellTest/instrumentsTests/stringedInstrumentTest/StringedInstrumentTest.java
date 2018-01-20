package com.codeclan.example.raymusicexchange.itemsToSell.mainTest.itemsToSellTest.instrumentsTests.stringedInstrumentTest;

import com.codeclan.example.raymusicexchange.itemsToSell.instruments.StringedInstrument.StringedInstrument;
import com.codeclan.example.raymusicexchange.itemsToSell.instruments.typeAndMakeEnums.InstrumentMake;
import com.codeclan.example.raymusicexchange.itemsToSell.instruments.typeAndMakeEnums.InstrumentType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/01/2018.
 */

public class StringedInstrumentTest {


    StringedInstrument viola;


    @Before
    public void before(){

        viola = new StringedInstrument(5, 7, "Model-ATZ",
                InstrumentType.VIOLA, InstrumentMake.CECIJHO, 4);

    }


    @Test
    public void canGetNumberOfStrings(){
        assertEquals(4, viola.getNumberOfStrings());
    }

    @Test
    public void canPlayStringedInstrument(){
        assertEquals("The strings leave a pleasing sound", viola.play());
    }



}
