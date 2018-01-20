package com.codeclan.example.raymusicexchange.itemsToSell.instruments.brass;

import com.codeclan.example.raymusicexchange.itemsToSell.instruments.Instrument;
import com.codeclan.example.raymusicexchange.itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMake;
import com.codeclan.example.raymusicexchange.itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMaterial;
import com.codeclan.example.raymusicexchange.itemsToSell.instruments.typeMakeMaterialEnums.InstrumentType;

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
