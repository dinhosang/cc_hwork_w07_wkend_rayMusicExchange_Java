package com.codeclan.example.raymusicexchange.itemsToSell.mainTest.itemsToSellTest.instrumentsTests.keyboardTest;


import com.codeclan.example.raymusicexchange.itemsToSell.instruments.keyboard.KeyboardInstrument;
import com.codeclan.example.raymusicexchange.itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMake;
import com.codeclan.example.raymusicexchange.itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMaterial;
import com.codeclan.example.raymusicexchange.itemsToSell.instruments.typeMakeMaterialEnums.InstrumentType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 20/01/2018.
 */

public class keyboardInstrumentTest {


    KeyboardInstrument piano;


    @Before
    public void before(){

        piano = new KeyboardInstrument(10, 14, "YT384-Piano",
                InstrumentMaterial.WOOD, InstrumentType.PIANO, InstrumentMake.BARTOLO, 88);

    }


    @Test
    public void canGetNumberOfKeys(){
        assertEquals(88, piano.getNumberOfKeys());
    }

}
