package com.codeclan.example.raymusicexchange.itemsToSell.instruments.typeAndMakeEnums;

/**
 * Created by user on 19/01/2018.
 */

public enum InstrumentType {


    GUITAR, VIOLA;


    @Override
    public String toString(){
        return super.toString().toLowerCase();
    }

}
