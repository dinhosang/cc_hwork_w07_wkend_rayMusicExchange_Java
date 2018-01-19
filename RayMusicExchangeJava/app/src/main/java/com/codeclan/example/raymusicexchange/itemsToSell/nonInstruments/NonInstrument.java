package com.codeclan.example.raymusicexchange.itemsToSell.nonInstruments;

import com.codeclan.example.raymusicexchange.itemsToSell.SaleItem;
import com.codeclan.example.raymusicexchange.itemsToSell.nonInstruments.typeAndMakeEnums.NonInstrumentMake;
import com.codeclan.example.raymusicexchange.itemsToSell.nonInstruments.typeAndMakeEnums.NonInstrumentType;

/**
 * Created by user on 19/01/2018.
 */

public class NonInstrument extends SaleItem {


    private NonInstrumentType   typeEnum;
    private NonInstrumentMake   makeEnum;
    private String              typeString;
    private String              makeString;


    public NonInstrument(int wholesalePrice, int salePrice, NonInstrumentType type, NonInstrumentMake make) {

        super(wholesalePrice, salePrice);
        setType(type, type.toString());
        setMake(make, make.toString());

    }


    public void setType(NonInstrumentType type, String typeString) {
        this.typeEnum = type;
        this.typeString = typeString;
    }

    public void setMake(NonInstrumentMake make, String makeString) {
        this.makeEnum = make;
        this.makeString = makeString;
    }

    public NonInstrumentType getTypeEnum() {
        return this.typeEnum;
    }

    public String getTypeString() {
        return this.typeString;
    }

    public NonInstrumentMake getMakeEnum() {
        return this.makeEnum;
    }

    public String getMakeString() {
        return this.makeString;
    }
}
