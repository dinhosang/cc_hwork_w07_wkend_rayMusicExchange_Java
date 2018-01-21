package shop;

import itemsToSell.SaleItem;
import itemsToSell.instruments.keyboard.KeyboardInstrument;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Created by user on 20/01/2018.
 */

public class Shop {


    private String      name;
    private Stock       stock;
    private SaleReport  report;
    private int         balance;


    public Shop(String name, int startingBalance) {

        this.name       = name;
        this.stock      = new Stock();
        this.report     = new SaleReport();
        this.balance    = startingBalance;

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

    public SaleReport getReport() {
        SaleReport copyReport = new SaleReport();
        ArrayList<ReportEntry> allEntries = this.report.getAllEntries();
        copyReport.addEntry(allEntries);
        return copyReport;
    }

    public void sellItemToCustomerOnDate(SaleItem item, String customerDetail, LocalDate dateOfSale) {
        if(this.stock.hasItem(item)) {

            ReportEntry newEntry = new ReportEntry(dateOfSale, item.getTypeString(), item.getWholesalePrice(),
                    item.getSalePrice(), item.calculateMarkUp(), customerDetail);

            this.balance += item.calculateMarkUp();

            this.report.addEntry(newEntry);

            stock.removeItem(item);
            
        }
        
        // would throw an error here
    }

    public int getBalance() {
        return balance;
    }

    public void addToBalance(int amount) {
        if(amount >= 0) {
            this.balance += amount;
        }
    }

    public void removeFromBalance(int amount) {
        if(amount >= 0) {
            this.balance -= amount;
        }
    }


}
