package itemsToSellTests.instrumentsTests.brassTest;

import itemsToSell.instruments.brass.Brass;
import itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMake;
import itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMaterial;
import itemsToSell.instruments.typeMakeMaterialEnums.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 20/01/2018.
 */

public class BrassTest {


    Brass trumpet;


    @Before
    public void before(){

        trumpet = new Brass(8, 12, "JYH8R", InstrumentMaterial.BRASS,
                InstrumentType.TRUMPET, InstrumentMake.BASSALCHEMY, 10);

    }


    @Test
    public void canGetNumberOfValves(){
        assertEquals(10, trumpet.getNumberOfValves());
    }

}
