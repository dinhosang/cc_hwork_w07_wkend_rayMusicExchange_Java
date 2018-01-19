package com.codeclan.example.raymusicexchange.itemsToSell.nonInstruments.typeAndMakeEnums;

/**
 * Created by user on 19/01/2018.
 */

public enum NonInstrumentType {


    STRINGS,
    OTHER,
    BOOK;


    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
