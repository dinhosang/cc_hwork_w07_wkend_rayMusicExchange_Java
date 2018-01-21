package shopTests;

import itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMake;
import itemsToSell.instruments.typeMakeMaterialEnums.InstrumentMaterial;
import itemsToSell.instruments.typeMakeMaterialEnums.InstrumentType;
import itemsToSell.instruments.woodwind.Woodwind;
import itemsToSell.nonInstruments.NonInstrument;
import itemsToSell.nonInstruments.typeAndMakeEnums.NonInstrumentMake;
import itemsToSell.nonInstruments.typeAndMakeEnums.NonInstrumentType;
import org.junit.Before;
import org.junit.Test;
import shop.ReportEntry;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;


public class ReportEntryTest {


    ReportEntry                     entryForInstrumentSale;
    ReportEntry                     entryForNonInstrumentSale;

    LocalDate                       dateOfSale1;
    LocalDate                       dateOfSale2;

    Woodwind                        saxophone;
    NonInstrument                   book;

    String                          customerDetail1;
    String                          customerDetail2;


    @Before
    public void before(){

        saxophone                   = new Woodwind(5,8, "Y8-HF3",
                                                    InstrumentMaterial.BRASS, InstrumentType.SAXOPHONE,
                                                    InstrumentMake.ZELMIRE, 6);

        book                        = new NonInstrument(3, 7, "Learn All Music",
                                                        NonInstrumentType.BOOK, NonInstrumentMake.OMNIRS);

        customerDetail1             = "Jenny Means";
        customerDetail2             = "Freddy Jones";

        dateOfSale1                 = LocalDate.of(2018, 01, 11);
        dateOfSale2                 = LocalDate.now().plusDays(4).plusWeeks(2);

        entryForInstrumentSale      = new ReportEntry(dateOfSale1, saxophone.getTypeString(),
                                                    saxophone.getWholesalePrice(), saxophone.getSalePrice(),
                                                    saxophone.calculateMarkUp(), customerDetail1);

        entryForNonInstrumentSale   = new ReportEntry(dateOfSale2, book.getTypeString(), book.getWholesalePrice(),
                                                        book.getSalePrice(), book.calculateMarkUp(), customerDetail2);

    }


    @Test
    public void canGetDateOfSale(){
        assertEquals(dateOfSale2, entryForNonInstrumentSale.getDateOfSale());
    }

    @Test
    public void canGetDateOfSaleString(){
        assertEquals("2018-01-11", entryForInstrumentSale.getDateOfSaleString());
    }

    @Test
    public void canGetItemTypeSold(){
        assertEquals("saxophone", entryForInstrumentSale.getItemTypeSold());
        assertEquals("book", entryForNonInstrumentSale.getItemTypeSold());
    }

    @Test
    public void canGetWholeSalePrice(){
        assertEquals(5, entryForInstrumentSale.getWholesalePrice());
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(8,  entryForInstrumentSale.getSalePrice());
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(3, entryForInstrumentSale.getMarkUp());
    }

    @Test
    public void canGetCustomerDetails(){
        assertEquals("Freddy Jones", entryForNonInstrumentSale.getCustomerDetail());
    }

}
