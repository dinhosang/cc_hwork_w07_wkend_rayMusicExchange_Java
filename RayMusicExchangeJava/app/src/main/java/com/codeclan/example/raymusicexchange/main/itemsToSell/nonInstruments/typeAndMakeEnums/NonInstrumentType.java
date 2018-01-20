package com.codeclan.example.raymusicexchange.main.itemsToSell.nonInstruments.typeAndMakeEnums;

/**
 * Created by user on 19/01/2018.
 */

public enum NonInstrumentType {


    STRINGS,
    BOOK,
    SHEETMUSIC,
    DRUMSTICK,
    AMPLIFIER,
    PLECTRUM,
    MUTE,
    OTHER;


    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
