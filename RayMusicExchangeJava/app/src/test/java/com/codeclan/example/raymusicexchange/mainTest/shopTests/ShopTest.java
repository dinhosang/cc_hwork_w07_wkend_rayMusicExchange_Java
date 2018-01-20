package com.codeclan.example.raymusicexchange.mainTest.shopTests;

import com.codeclan.example.raymusicexchange.main.itemsToSell.SaleItem;
import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.brass.Brass;
import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.keyboard.KeyboardInstrument;
import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.percussion.Percussion;
import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.stringedInstrument.StringedInstrument;
import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMake;
import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMaterial;
import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.typeMakeMaterialEnums.InstrumentType;
import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.woodwind.Woodwind;
import com.codeclan.example.raymusicexchange.main.itemsToSell.nonInstruments.NonInstrument;
import com.codeclan.example.raymusicexchange.main.itemsToSell.nonInstruments.typeAndMakeEnums.NonInstrumentMake;
import com.codeclan.example.raymusicexchange.main.itemsToSell.nonInstruments.typeAndMakeEnums.NonInstrumentType;
import com.codeclan.example.raymusicexchange.main.shop.Shop;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 20/01/2018.
 */

public class ShopTest {


    private Shop                shop;

    private StringedInstrument  guitar;
    private Woodwind            saxophone;
    private Percussion          drum;
    private KeyboardInstrument  piano;
    private Brass               trumpet;

    private NonInstrument       book;
    private NonInstrument       sticks;
    private NonInstrument       amp;

    private ArrayList<SaleItem> exampleStock;


    @Before
    public void before(){

        shop            = new Shop("Ray's Music Exchange");


        guitar          = new StringedInstrument(3, 6, "Model-MTC2",
                InstrumentMaterial.WOOD, InstrumentType.GUITAR,
                InstrumentMake.FENBAR, 6);

        saxophone       = new Woodwind(5,8, "Y8-HF3",
                InstrumentMaterial.BRASS, InstrumentType.SAXOPHONE,
                InstrumentMake.ZELMIRE, 6);

        drum            = new Percussion(7, 12, "MXT-9D",
                InstrumentMaterial.WOOD, InstrumentType.DRUM,
                InstrumentMake.ALOSOS, 2);

        piano           = new KeyboardInstrument(10, 14, "YT384-Piano",
                InstrumentMaterial.WOOD, InstrumentType.PIANO,
                InstrumentMake.BARTOLO, 88);

        trumpet         = new Brass(8, 12, "JYH8R",
                InstrumentMaterial.BRASS, InstrumentType.TRUMPET,
                InstrumentMake.BASSALCHEMY, 10);


        book            = new NonInstrument(3, 7, "Learn All Music",
                NonInstrumentType.BOOK, NonInstrumentMake.OMNIRS);

        sticks          = new NonInstrument(1, 4, "BeatTheBest(tm)",
                NonInstrumentType.DRUMSTICK, NonInstrumentMake.FACTOR);

        amp             = new NonInstrument(4, 5, "PH-45-AMP",
                NonInstrumentType.AMPLIFIER, NonInstrumentMake.LARK);

        exampleStock    = new ArrayList<>(Arrays.asList(piano, trumpet, book, sticks, amp, amp));


    }


    @Test
    public void canGetName(){
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void canGetStockSize(){
        assertEquals(0, shop.getStockSize());
    }

    @Test
    public void canAddOneItemToStock(){
        shop.addStock(guitar);
        assertEquals(1, shop.getStockSize());
    }

    @Test
    public void canAddMultipleItemsToStockCommaSeparated(){
        shop.addStock(guitar, sticks, saxophone);
        assertEquals(3, shop.getStockSize());
    }

    @Test
    public void canAddMultipleItemsToStockInSimpleArray(){
        SaleItem[] items            = {guitar, book, piano, amp};

        shop.addStock(items);

        assertEquals(4, shop.getStockSize());
    }

    @Test
    public void canAddMultipleItemsToStockInArrayList(){
        ArrayList<SaleItem> items   =  new ArrayList<>(Arrays.asList(guitar, book, piano, amp));

        shop.addStock(items);

        assertEquals(4, shop.getStockSize());
    }

    @Test
    public void canGetAllStock(){
        ArrayList<SaleItem> items   =  new ArrayList<>(Arrays.asList(guitar, book, piano, amp));

        shop.addStock(items);

        assertEquals(items, shop.getAllStock());
    }

    @Test
    public void canCalculateMarkupForItems(){
        assertEquals(11, shop.calculateMarkupOnSelectedItems(guitar, drum, saxophone));
    }

//
//    below does not work, see test underneath this one to see how it can be made to work by
//    including the type once more in the instantiation
//
//    @Test
//    public void canCalculateMarkupForItemsAsArrayList(){
//        ArrayList<SaleItem> items =  new ArrayList<>(Arrays.asList(guitar, drum));
//        assertEquals(11, stock.calculateMarkupOnSelectedItems(items));
//    }
//

    @Test
    public void canCalculateMarkupForItemsAsArrayList(){
        ArrayList<SaleItem> items =  new ArrayList<SaleItem>(Arrays.asList(guitar, drum));
        assertEquals(8, shop.calculateMarkupOnSelectedItems(items));
    }

    @Test
    public void canCalculateMarkUpForAllStock(){
        ArrayList<SaleItem> items = new ArrayList<>(Arrays.asList(piano, trumpet, book, sticks, amp, amp));
        shop.addStock(items);

        assertEquals(17, shop.calculateTotalInventoryMarkup());

    }

    @Test
    public void canCheckIfItemExistsInStock(){
        shop.addStock(exampleStock);

        assertEquals(true, shop.hasItem(piano));
        assertEquals(false, shop.hasItem(saxophone));
    }

}
