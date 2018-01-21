package itemsToSellTests.instrumentsTests.woodwindTest;

import itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMake;
import itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMaterial;
import itemsToSell.instruments.typeMakeMaterialEnums.InstrumentType;
import itemsToSell.instruments.woodwind.Woodwind;

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
