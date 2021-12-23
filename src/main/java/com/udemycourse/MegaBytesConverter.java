package com.udemycourse;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kilobytes) {

        if (kilobytes < 0) {
            System.out.println("Invalid Value");
        } else if (kilobytes == 1024) {
            System.out.println(kilobytes + " KB = " + "1 MB and 0 KB");
        } else if (kilobytes < 1024) {
            System.out.println(kilobytes + " KB = " + "0 MB and " + kilobytes + " KB");
        } else if (kilobytes > 1024) {
            int countMega = kilobytes / 1024;
            int anotherKiloBytes = kilobytes - (countMega * 1024);
            System.out.println(kilobytes + " KB = " + countMega + " MB and " + anotherKiloBytes + " KB");
        }
    }
}
