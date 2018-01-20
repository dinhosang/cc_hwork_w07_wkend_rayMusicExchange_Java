package com.codeclan.example.raymusicexchange.main.shop;

import com.codeclan.example.raymusicexchange.main.itemsToSell.SaleItem;
import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.stringedInstrument.StringedInstrument;
import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.woodwind.Woodwind;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 20/01/2018.
 */

public class Shop {


    private String  name;
    private Stock   stock;


    public Shop(String name) {

        this.name   = name;
        this.stock  = new Stock();

    }


    public String getName() {
        return this.name;
    }

    public int getStockSize() {
        return this.stock.getInventorySize();
    }

    public void addStock(SaleItem... items) {
        this.stock.addInventory(items);
    }

    public void addStock(ArrayList<SaleItem> items) {
        this.stock.addInventory(items);
    }

    public ArrayList<SaleItem> getAllStock() {
        return stock.getInventory();
    }

    public int calculateMarkupOnSelectedItems(SaleItem... items) {
        int totalMarkUp     = 0;

        for(SaleItem item: items){
            totalMarkUp     += item.calculateMarkUp();
        }

        return totalMarkUp;
    }

    public int calculateMarkupOnSelectedItems(ArrayList<SaleItem> items) {
        int totalMarkUp     = 0;

        for(SaleItem item: items){
            totalMarkUp     += item.calculateMarkUp();
        }

        return totalMarkUp;
    }

    public int calculateTotalInventoryMarkup() {
        return calculateMarkupOnSelectedItems(stock.getInventory());
    }

    public boolean hasItem(SaleItem item) {
        return stock.hasItem(item);
    }
}
