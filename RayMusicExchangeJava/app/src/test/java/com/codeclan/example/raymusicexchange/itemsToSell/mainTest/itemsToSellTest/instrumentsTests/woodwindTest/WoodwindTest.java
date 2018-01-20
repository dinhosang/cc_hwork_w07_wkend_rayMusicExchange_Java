package com.codeclan.example.raymusicexchange.itemsToSell.mainTest.itemsToSellTest.instrumentsTests.woodwindTest;

import com.codeclan.example.raymusicexchange.itemsToSell.instruments.woodwind.Woodwind;
import com.codeclan.example.raymusicexchange.itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMake;
import com.codeclan.example.raymusicexchange.itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMaterial;
import com.codeclan.example.raymusicexchange.itemsToSell.instruments.typeMakeMaterialEnums.InstrumentType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 20/01/2018.
 */

public class WoodwindTest {


    Woodwind flute;


    @Before
    public void before(){

        flute = new Woodwind(3,4, "Y8-HF3", InstrumentMaterial.PLASTIC,
                InstrumentType.FLUTE, InstrumentMake.BRANBON, 8);

    }


    @Test
    public void getNumberOfToneHoles(){
        assertEquals(8, flute.getNumberOfToneHoles());
    }

    @Test
    public void canPlayWoodwindInstrument(){
        assertEquals("A playful tune arises", flute.play());
    }

}
