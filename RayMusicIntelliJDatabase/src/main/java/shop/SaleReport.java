package shop;

import java.time.LocalDate;
import java.util.ArrayList;


public class SaleReport {


    ArrayList<ReportEntry> saleReports;


    public SaleReport(){

        this.saleReports = new ArrayList<>();

    }


    public ArrayList<ReportEntry> getAllEntries() {
        ArrayList<ReportEntry> copySaleReports = new ArrayList<>(saleReports);
        return copySaleReports;
    }

    public void addEntry(ReportEntry... entries) {
        for(ReportEntry entry: entries) {
            this.saleReports.add(entry);
        }
    }

    public void addEntry(ArrayList<ReportEntry> entries) {
        this.saleReports.addAll(entries);
    }

    public void removeEntry(ReportEntry entry) {
        this.saleReports.remove(entry);
    }

    public ArrayList<ReportEntry> getEntriesByItem(String itemType) {
        ArrayList<ReportEntry> entriesDesired = new ArrayList<>();

        for(ReportEntry entry: this.saleReports){
            if(entry.getItemTypeSold().equals(itemType)){
                entriesDesired.add(entry);
            }
        }

        return entriesDesired;
    }

    public ArrayList<ReportEntry> getEntriesBetweenInclusive(LocalDate startDate, LocalDate endDate) {
        ArrayList<ReportEntry> entriesDesired = new ArrayList<>();

        for(ReportEntry entry: this.saleReports){
            LocalDate dateOfSale = entry.getDateOfSale();
            if(dateOfSale.isAfter(startDate.minusDays(1)) && dateOfSale.isBefore(endDate.plusDays(1))){
                entriesDesired.add(entry);
            }
        }

        return entriesDesired;
    }

    public boolean checkEntryExists(ReportEntry entryToCheckFor) {
        for(ReportEntry entry: this.saleReports){
            if(entry.equals(entryToCheckFor)){
                return true;
            }
        }

        return false;
    }

    public int getTotalMarkUpBetweenDates(LocalDate startDate, LocalDate endDate) {

        ArrayList<ReportEntry> entriesDesired = getEntriesBetweenInclusive(startDate, endDate);

        return getTotalMarkupInChosenArrayList(entriesDesired);
    }


    public int getTotalMarkUpByItem(String itemType) {

        ArrayList<ReportEntry> entriesDesired = getEntriesByItem(itemType);
        return getTotalMarkupInChosenArrayList(entriesDesired);
    }


    public int getTotalMarkUpByItemBetweenDatesInclusive(String itemType, LocalDate startDate, LocalDate endDate) {
        ArrayList<ReportEntry> entriesDesiredByTime = getEntriesBetweenInclusive(startDate, endDate);
        ArrayList<ReportEntry> entriesDesireByTimeAndItemTYpe = new ArrayList<>();

        for(ReportEntry entry: entriesDesiredByTime){
            if(entry.getItemTypeSold().equals(itemType)){
                entriesDesireByTimeAndItemTYpe.add(entry);
            }
        }

        return getTotalMarkupInChosenArrayList(entriesDesireByTimeAndItemTYpe);

    }

    private int getTotalMarkupInChosenArrayList(ArrayList<ReportEntry> entries){
        int totalMarkUp = 0;

        if(entries.size() != 0) {
            for (ReportEntry entry : entries) {
                totalMarkUp += entry.getMarkUp();
            }
        }

        return totalMarkUp;
    }


}
