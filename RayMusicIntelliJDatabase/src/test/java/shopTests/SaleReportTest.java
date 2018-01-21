package shopTests;

import itemsToSell.instruments.typeMakeMaterialEnums.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import shop.ReportEntry;
import shop.SaleReport;


import java.time.LocalDate;
import java.util.ArrayList;


import static org.junit.Assert.assertEquals;

public class SaleReportTest {


    SaleReport  report;
    ReportEntry entry1;
    ReportEntry entry2;
    ReportEntry entry3;
    ReportEntry entry4;
    LocalDate   date1;
    LocalDate   date2;
    LocalDate   date3;
    LocalDate   date4;


    @Before
    public void before(){

        report  = new SaleReport();
        date1   = LocalDate.of(2019, 02, 03);
        date2   = LocalDate.of(2019, 01, 05);
        date3   = LocalDate.of(2018, 05, 03);
        date4   = LocalDate.of(2017, 05, 03);

        entry1  = new ReportEntry(date1,"book", 4,
                                    5, 1, "Jenny Jenny");

        entry2  = new ReportEntry(date2,"drum", 4,
                                    6, 2, "Jenny Jenny");

        entry3  = new ReportEntry(date3,"book", 4,
                                    7, 3, "Jenny Jenny");

        entry4  = new ReportEntry(date4,"flute", 4,
                                    5, 1, "Jenny Jenny");

    }


    @Test
    public void canAddEntryToReport(){
        assertEquals(0, report.getAllEntries().size());
        report.addEntry(entry1);
        assertEquals(1, report.getAllEntries().size());
    }

    @Test
    public void canRemoveEntryFromReport(){
        report.addEntry(entry1);
        report.addEntry(entry2);
        assertEquals(2, report.getAllEntries().size());
        report.removeEntry(entry1);
        assertEquals(1, report.getAllEntries().size());
    }

    @Test
    public void canGetEntriesBetweenDates(){
        report.addEntry(entry1, entry2, entry3, entry4);

        LocalDate startDate = LocalDate.of(2017, 01, 01);
        LocalDate endDate   = LocalDate.of(2018, 10, 01);

        ArrayList<ReportEntry> chosenEntries = report.getEntriesBetweenInclusive(startDate, endDate);

        assertEquals(2, chosenEntries.size());
    }

    @Test
    public void canCheckEntryExists(){
        report.addEntry(entry1, entry3, entry4);

        assertEquals(true, report.checkEntryExists(entry3));
        assertEquals(false, report.checkEntryExists(entry2));
    }

    @Test
    public void canGetAllEntriesOfItemType(){
        report.addEntry(entry1, entry2, entry3, entry4);

        assertEquals(2, report.getEntriesByItem("book").size());

    }

    @Test
    public void canGetTotalMarkUpByTimePeriod(){

        report.addEntry(entry1, entry2, entry3, entry4);

        LocalDate startDate1 = LocalDate.of(2018, 01, 01);
        LocalDate endDate1   = LocalDate.of(2019, 01, 30);

        assertEquals(5, report.getTotalMarkUpBetweenDates(startDate1, endDate1));

        LocalDate startDate2 = LocalDate.of(2016, 01, 01);
        LocalDate endDate2   = LocalDate.of(2016, 01, 30);

        assertEquals(0, report.getTotalMarkUpBetweenDates(startDate2, endDate2));
    }

    @Test
    public void canGetTotalMarkUpByItemSold(){
        report.addEntry(entry1, entry2, entry3, entry4);
        assertEquals(4, report.getTotalMarkUpByItem("book"));
    }

    @Test
    public void canGetTotalMarkUpByItemSoldInTimePeriod(){
        report.addEntry(entry1, entry2, entry3, entry4);

        LocalDate startDate = LocalDate.of(2019, 01, 01);
        LocalDate endDate   = LocalDate.of(2019, 10, 30);

        assertEquals(1, report.getTotalMarkUpByItemBetweenDatesInclusive("book", startDate, endDate));
    }

}
