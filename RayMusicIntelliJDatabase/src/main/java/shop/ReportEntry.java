package shop;

import java.time.LocalDate;

public class ReportEntry {


    private LocalDate       dateOfSale;
    private String          itemTypeSold;
    private int             wholesalePrice;
    private int             salePrice;
    private int             markUp;
    private String          customerDetail;


    public ReportEntry(LocalDate dateOfSale, String itemTypeSold, int wholesalePrice,
                       int salePrice, int markUp, String customerDetail){

        this.dateOfSale     = dateOfSale;
        this.itemTypeSold   = itemTypeSold;
        this.wholesalePrice  = wholesalePrice;
        this.salePrice      = salePrice;
        this.markUp         = markUp;
        this.customerDetail = customerDetail;

    }


    // I think LocalDates are mutable?
    public LocalDate getDateOfSale(){
        LocalDate copyDateOfSale = LocalDate.from(dateOfSale);
        return copyDateOfSale;
    }

    public String getDateOfSaleString() {
        return dateOfSale.toString();
    }


    public String getItemTypeSold() {
        return itemTypeSold;
    }

    public int getWholesalePrice() {
        return wholesalePrice;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public int getMarkUp() {
        return markUp;
    }

    public String getCustomerDetail() {
        return customerDetail;
    }
}
