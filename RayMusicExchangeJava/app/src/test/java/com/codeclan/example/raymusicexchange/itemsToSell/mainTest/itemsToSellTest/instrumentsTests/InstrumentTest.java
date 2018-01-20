package com.codeclan.example.raymusicexchange.itemsToSell.mainTest.itemsToSellTest.instrumentsTests;

import com.codeclan.example.raymusicexchange.itemsToSell.instruments.Instrument;
import com.codeclan.example.raymusicexchange.itemsToSell.instruments.StringedInstrument.StringedInstrument;
import com.codeclan.example.raymusicexchange.itemsToSell.instruments.typeAndMakeEnums.InstrumentMake;
import com.codeclan.example.raymusicexchange.itemsToSell.instruments.typeAndMakeEnums.InstrumentType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/01/2018.
 */

public class InstrumentTest {


    Instrument guitar;


    @Before
    public void before(){

        guitar = new StringedInstrument(3, 6, "Model-MTC2", InstrumentType.GUITAR, InstrumentMake.FENBAR, 6);

    }


    @Test
    public void canGetName(){
        assertEquals("Model-MTC2", guitar.getName());
    }

    @Test
    public void canGetTypeEnum(){
        assertEquals(InstrumentType.GUITAR, guitar.getTypeEnum());
    }

    @Test
    public void canGetMakeEnum(){
        assertEquals(InstrumentMake.FENBAR, guitar.getMakeEnum());
    }

    @Test
    public void canGetTypeString(){
        assertEquals("guitar", guitar.getTypeString());
    }

    @Test
    public void canGetMakeString(){
        assertEquals("fenbar", guitar.getMakeString());
    }

    @Test
    public void canPlayStringedInstrument(){
        assertEquals("The strings leave a pleasing sound", guitar.play());
    }


}
