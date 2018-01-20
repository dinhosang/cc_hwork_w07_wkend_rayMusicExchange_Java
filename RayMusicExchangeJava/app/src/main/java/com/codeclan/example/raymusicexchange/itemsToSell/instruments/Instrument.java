package com.codeclan.example.raymusicexchange.itemsToSell.instruments;

import com.codeclan.example.raymusicexchange.itemsToSell.SaleItem;
import com.codeclan.example.raymusicexchange.itemsToSell.instruments.typeAndMakeEnums.InstrumentMake;
import com.codeclan.example.raymusicexchange.itemsToSell.instruments.typeAndMakeEnums.InstrumentType;

/**
 * Created by user on 19/01/2018.
 */

public abstract class Instrument extends SaleItem {


    protected String            name;
    protected InstrumentType    typeEnum;
    protected InstrumentMake    makeEnum;
    protected String            typeString;
    protected String            makeString;


    public Instrument(int wholesalePrice, int salePrice, String name, InstrumentType typeEnum, InstrumentMake makeEnum) {

        super(wholesalePrice, salePrice);
        this.name       = name;
        setMake(makeEnum, makeEnum.toString());
        setType(typeEnum, typeEnum.toString());
        

    }


    public void setType(InstrumentType type, String typeString) {
        this.typeEnum   = type;
        this.typeString = typeString;
    }

    public String getName() {
        return name;
    }

    public InstrumentType getTypeEnum() {
        return typeEnum;
    }

    public InstrumentMake getMakeEnum() {
        return makeEnum;
    }

    public void setMake(InstrumentMake makeEnum, String makeString) {
        this.makeEnum   = makeEnum;
        this.makeString = makeString;
    }

    public String getTypeString() {
        return typeString;
    }

    public String getMakeString() {
        return makeString;
    }

    public abstract String play();

}
