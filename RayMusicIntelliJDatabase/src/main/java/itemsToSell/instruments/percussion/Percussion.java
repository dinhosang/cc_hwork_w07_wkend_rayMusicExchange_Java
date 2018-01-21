package itemsToSell.instruments.percussion;

import itemsToSell.instruments.Instrument;
import itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMake;
import itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMaterial;
import itemsToSell.instruments.typeMakeMaterialEnums.InstrumentType;

/**
 * Created by user on 20/01/2018.
 */

public class Percussion extends Instrument {


    private int numberOfBeaters;


    public Percussion(int wholesalePrice, int salePrice, String name,
                      InstrumentMaterial material, InstrumentType typeEnum,
                      InstrumentMake makeEnum, int numberOfBeaters)
    {

        super(wholesalePrice, salePrice, name, material, typeEnum, makeEnum);
        this.numberOfBeaters = numberOfBeaters;

    }


    @Override
    public String play() {
        return "A sound forms as you strike";
    }

    public int getNumberOfBeaters() {
        return numberOfBeaters;
    }
}
