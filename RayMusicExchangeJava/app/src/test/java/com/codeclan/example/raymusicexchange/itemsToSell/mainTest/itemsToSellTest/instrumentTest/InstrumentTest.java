package com.codeclan.example.raymusicexchange.itemsToSell.mainTest.itemsToSellTest.instrumentTest;

import com.codeclan.example.raymusicexchange.itemsToSell.instruments.Instrument;
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

        guitar = new Instrument(3, 6, "Model-MTC2", InstrumentMake.FENBAR);
        guitar.setType(InstrumentType.GUITAR, InstrumentType.GUITAR.toString());

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
    public void canSetType(){
        assertEquals(InstrumentType.GUITAR, guitar.getTypeEnum());
    }

    @Test
    public void canSetMake(){
        guitar.setMake(InstrumentMake.ROBSON, InstrumentMake.ROBSON.toString());
        assertEquals(InstrumentMake.ROBSON, guitar.getMakeEnum());
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
    public void canPlay(){
        assertEquals("ha", guitar.play());
    }


}
