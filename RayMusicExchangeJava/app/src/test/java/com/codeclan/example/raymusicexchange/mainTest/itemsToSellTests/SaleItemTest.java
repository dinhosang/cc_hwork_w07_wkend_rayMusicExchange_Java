package com.codeclan.example.raymusicexchange.mainTest.itemsToSellTests;

import com.codeclan.example.raymusicexchange.main.itemsToSell.SaleItem;
import com.codeclan.example.raymusicexchange.main.itemsToSell.nonInstruments.NonInstrument;
import com.codeclan.example.raymusicexchange.main.itemsToSell.nonInstruments.typeAndMakeEnums.NonInstrumentMake;
import com.codeclan.example.raymusicexchange.main.itemsToSell.nonInstruments.typeAndMakeEnums.NonInstrumentType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/01/2018.
 */

public class SaleItemTest {


    SaleItem item;


    @Before
    public void before(){
        item = new NonInstrument(4, 6, "Learn All Music", NonInstrumentType.BOOK, NonInstrumentMake.OMNIRS);
    }


    @Test
    public void canGetWholesalePrice(){
        assertEquals(4, item.getWholesalePrice());
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(6, item.getSalePrice());
    }

    @Test
    public void canSetWholesalePrice(){
        item.setWholesalePrice(2);
        assertEquals(2, item.getWholesalePrice());
    }

    @Test
    public void canSetSalePrice(){
        item.setSalePrice(8);
    }

    @Test
    public void canCalculateMarkUpOnItem(){
        assertEquals(2, item.calculateMarkUp());
    }

}
