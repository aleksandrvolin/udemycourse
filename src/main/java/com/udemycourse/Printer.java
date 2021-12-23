package com.udemycourse;

public class Printer {

    private int tonerLevel, pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if ((tonerAmount + tonerLevel) > 100) {
                return -1;
            } else {
                tonerLevel += tonerAmount;
                return tonerLevel;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {

        int pagesToPrinted = pages;

        if (duplex) {
            pagesToPrinted = (pages/2)+(pages%2);
        } else {
            pagesToPrinted = pages;
        }
        this.pagesPrinted = pagesPrinted + pagesToPrinted;
        return pagesToPrinted;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
