package itemsToSellTests.instrumentsTests.percussionTest;

import itemsToSell.instruments.percussion.Percussion;
import itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMake;
import itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMaterial;
import itemsToSell.instruments.typeMakeMaterialEnums.InstrumentType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 20/01/2018.
 */

public class PercussionTest {


    Percussion drum;


    @Before
    public void before(){

        drum = new Percussion(7, 12, "MXT-9D",
                InstrumentMaterial.WOOD, InstrumentType.DRUM,
                InstrumentMake.ALOSOS, 2);

    }


    @Test
    public void canGetNumberOfBeaters(){
        assertEquals(2, drum.getNumberOfBeaters());
    }

}
