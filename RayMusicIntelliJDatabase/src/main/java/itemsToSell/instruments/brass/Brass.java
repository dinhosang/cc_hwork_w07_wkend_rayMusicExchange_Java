package itemsToSell.instruments.brass;

import itemsToSell.instruments.Instrument;
import itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMake;
import itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMaterial;
import itemsToSell.instruments.typeMakeMaterialEnums.InstrumentType;

/**
 * Created by user on 20/01/2018.
 */

public class Brass extends Instrument {


    private int numberOfValves;


    public Brass(int wholesalePrice, int salePrice, String name, InstrumentMaterial material,
                 InstrumentType typeEnum, InstrumentMake makeEnum, int numberOfValves)
    {

        super(wholesalePrice, salePrice, name, material, typeEnum, makeEnum);
        this.numberOfValves = numberOfValves;

    }


    @Override
    public String play() {
        return "The notes come out full blast";
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }
}
