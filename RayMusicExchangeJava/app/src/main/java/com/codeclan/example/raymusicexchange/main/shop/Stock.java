package com.codeclan.example.raymusicexchange.main.shop;

import com.codeclan.example.raymusicexchange.main.itemsToSell.SaleItem;
import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.keyboard.KeyboardInstrument;
import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.percussion.Percussion;
import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.stringedInstrument.StringedInstrument;
import com.codeclan.example.raymusicexchange.main.itemsToSell.instruments.woodwind.Woodwind;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 20/01/2018.
 */

public class Stock {


    private ArrayList<SaleItem>     inventory;


    public Stock(){

        this.inventory              = new ArrayList<>();

    }



    public int getInventorySize() {
        return this.inventory.size();
    }

    public void addInventory(SaleItem... items) {
        this.inventory.addAll(Arrays.asList(items));
    }

    public void addInventory(ArrayList<SaleItem> items) {
        this.inventory.addAll(items);
    }

    public ArrayList<SaleItem> getInventory() {
        ArrayList<SaleItem> copyInventory = new ArrayList<>();

        copyInventory.addAll(this.inventory);

        return copyInventory;
    }

    public boolean hasItem(SaleItem item) {

        for(SaleItem inventoryItem: this.inventory){
            if(inventoryItem.equals(item)){
                return true;
            }
        }

        return false;
    }

    public void removeItem(SaleItem item) {
        this.inventory.remove(item);
    }
}
