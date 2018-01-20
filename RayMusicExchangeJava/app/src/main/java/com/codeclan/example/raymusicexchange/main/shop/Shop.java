package com.codeclan.example.raymusicexchange.main.shop;

import com.codeclan.example.raymusicexchange.main.itemsToSell.SaleItem;
import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.stringedInstrument.StringedInstrument;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 20/01/2018.
 */

public class Shop {


    private String name;
    private ArrayList<SaleItem> stock;


    public Shop(String name) {

        this.name = name;
        this.stock = new ArrayList<>();

    }


    public String getName() {
        return this.name;
    }

    public int getStockSize() {
        return this.stock.size();
    }

    public void addStock(SaleItem... items) {
        this.stock.addAll(Arrays.asList(items));
    }
}
