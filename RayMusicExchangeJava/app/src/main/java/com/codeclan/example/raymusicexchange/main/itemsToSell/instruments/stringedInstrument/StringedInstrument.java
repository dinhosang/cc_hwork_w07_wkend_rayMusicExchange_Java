package com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.stringedInstrument;

import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.Instrument;
import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMake;
import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMaterial;
import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.typeMakeMaterialEnums.InstrumentType;

/**
 * Created by user on 19/01/2018.
 */

public class StringedInstrument extends Instrument {


    private int numberOfStrings;

    
    public StringedInstrument(int wholesalePrice, int salePrice, String name, InstrumentMaterial material, InstrumentType typeEnum, InstrumentMake makeEnum, int numberOfStrings) {
        
        super(wholesalePrice, salePrice, name, material, typeEnum, makeEnum);
        this.numberOfStrings = numberOfStrings;
        
    }


    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(){
        return "The strings leave a pleasing sound";
    }

}
