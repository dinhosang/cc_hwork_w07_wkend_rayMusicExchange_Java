package itemsToSellTests.instrumentsTests.keyboardTest;


import itemsToSell.instruments.keyboard.KeyboardInstrument;
import itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMake;
import itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMaterial;
import itemsToSell.instruments.typeMakeMaterialEnums.InstrumentType;

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
