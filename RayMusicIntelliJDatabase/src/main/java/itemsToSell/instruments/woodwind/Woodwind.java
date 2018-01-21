package itemsToSell.instruments.woodwind;

import itemsToSell.instruments.Instrument;
import itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMake;
import itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMaterial;
import itemsToSell.instruments.typeMakeMaterialEnums.InstrumentType;

/**
 * Created by user on 20/01/2018.
 */

public class Woodwind extends Instrument {


    private int numberOfToneHoles;


    public Woodwind(int wholesalePrice, int salePrice, String name, InstrumentMaterial material, InstrumentType typeEnum, InstrumentMake makeEnum, int numberOfToneHoles) {

        super(wholesalePrice, salePrice, name, material, typeEnum, makeEnum);
        this.numberOfToneHoles = numberOfToneHoles;

    }


    @Override
    public String play() {
        return "A playful tune arises";
    }

    public int getNumberOfToneHoles() {
        return numberOfToneHoles;
    }
}
