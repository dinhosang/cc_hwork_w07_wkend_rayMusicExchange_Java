package com.codeclan.example.raymusicexchange.itemsToSell.instruments.StringedInstrument;

import com.codeclan.example.raymusicexchange.itemsToSell.instruments.Instrument;
import com.codeclan.example.raymusicexchange.itemsToSell.instruments.typeAndMakeEnums.InstrumentMake;
import com.codeclan.example.raymusicexchange.itemsToSell.instruments.typeAndMakeEnums.InstrumentType;

/**
 * Created by user on 19/01/2018.
 */

public class StringedInstrument extends Instrument {


    private int numberOfStrings;

    
    public StringedInstrument(int wholesalePrice, int salePrice, String name, InstrumentType typeEnum, InstrumentMake makeEnum, int numberOfStrings) {
        
        super(wholesalePrice, salePrice, name, typeEnum, makeEnum);
        this.numberOfStrings = numberOfStrings;
        
    }


    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(){
        return "The strings leave a pleasing sound";
    }

}
