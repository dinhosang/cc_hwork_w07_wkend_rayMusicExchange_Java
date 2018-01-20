package com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.keyboard;

import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.Instrument;
import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMake;
import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMaterial;
import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.typeMakeMaterialEnums.InstrumentType;

/**
 * Created by user on 20/01/2018.
 */

public class KeyboardInstrument extends Instrument {


    private int numberOfKeys;


    public KeyboardInstrument(int wholesalePrice, int salePrice, String name,
                              InstrumentMaterial material, InstrumentType typeEnum,
                              InstrumentMake makeEnum, int numberOfKeys)
    {

        super(wholesalePrice, salePrice, name, material, typeEnum, makeEnum);
        this.numberOfKeys = numberOfKeys;

    }

    @Override
    public String play() {
        return "The keys give a slight 'thud' as you play";
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }
}
