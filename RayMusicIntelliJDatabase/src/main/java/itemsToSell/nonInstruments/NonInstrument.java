package itemsToSell.nonInstruments;

import itemsToSell.SaleItem;
import itemsToSell.nonInstruments.typeAndMakeEnums.NonInstrumentMake;
import itemsToSell.nonInstruments.typeAndMakeEnums.NonInstrumentType;

/**
 * Created by user on 19/01/2018.
 */

public class NonInstrument extends SaleItem {


    private NonInstrumentType typeEnum;
    private NonInstrumentMake   makeEnum;
    private String              typeString;
    private String              makeString;
    private String              name;


    public NonInstrument(int wholesalePrice, int salePrice, String name, NonInstrumentType type, NonInstrumentMake make) {

        super(wholesalePrice, salePrice);
        setType(type, type.toString());
        setMake(make, make.toString());
        this.name       = name;

    }


    public String getName() {
        return name;
    }

    public void setType(NonInstrumentType type, String typeString) {
        this.typeEnum   = type;
        this.typeString = typeString;
    }

    public void setMake(NonInstrumentMake make, String makeString) {
        this.makeEnum   = make;
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
