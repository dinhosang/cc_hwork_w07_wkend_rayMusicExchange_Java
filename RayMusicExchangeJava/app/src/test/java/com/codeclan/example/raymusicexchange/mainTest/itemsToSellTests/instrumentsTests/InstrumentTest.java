package com.codeclan.example.raymusicexchange.mainTest.itemsToSellTests.instrumentsTests;

import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.Instrument;
import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.stringedInstrument.StringedInstrument;
import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.woodwind.Woodwind;
import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMake;
import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMaterial;
import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.typeMakeMaterialEnums.InstrumentType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/01/2018.
 */

public class InstrumentTest {


    Instrument guitar;
    Instrument saxophone;


    @Before
    public void before(){

        guitar = new StringedInstrument(3, 6, "Model-MTC2", InstrumentMaterial.WOOD, InstrumentType.GUITAR, InstrumentMake.FENBAR, 6);
        saxophone = new Woodwind(5,8, "Y8-HF3", InstrumentMaterial.BRASS, InstrumentType.SAXOPHONE, InstrumentMake.ZELMIRE, 6);

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
    public void canGetMaterial(){
        assertEquals(InstrumentMaterial.BRASS, saxophone.getMaterial());
    }

    @Test
    public void canPlayDifferentInstrument(){
        assertEquals("The strings leave a pleasing sound", guitar.play());
        assertEquals("A playful tune arises", saxophone.play());
    }


}
