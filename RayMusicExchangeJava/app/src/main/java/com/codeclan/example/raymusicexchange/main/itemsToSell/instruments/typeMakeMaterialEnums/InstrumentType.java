package com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.typeMakeMaterialEnums;

/**
 * Created by user on 19/01/2018.
 */

public enum InstrumentType {


    GUITAR, VIOLA, FLUTE, SAXOPHONE, TRUMPET, TUBA, PIANO, DRUM;


    @Override
    public String toString(){
        return super.toString().toLowerCase();
    }

}
