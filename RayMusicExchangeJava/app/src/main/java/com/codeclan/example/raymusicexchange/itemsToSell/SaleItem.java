package com.codeclan.example.raymusicexchange.itemsToSell;

/**
 * Created by user on 19/01/2018.
 */

public abstract class SaleItem {


    protected int wholesalePrice;
    protected int salePrice;


    public SaleItem(int wholesalePrice, int salePrice) {

        this.wholesalePrice = wholesalePrice;
        this.salePrice      = salePrice;

    }


    public int getWholesalePrice() {
        return wholesalePrice;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setWholesalePrice(int wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice      = salePrice;
    }

}
