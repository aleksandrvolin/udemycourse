package com.udemycourse;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int years) {

        if (years < 0 || years > 9999) {
            return false;
        } else if ((years % 4 == 0) && (years % 100 != 0) || (years % 400 == 0)) {
            return true;
        } else {
            return false;
        }


    }


    public static int getDaysInMonth(int month, int years) {

        if (month < 1 || month > 12) {
            return -1;
        } else if (years < 0 || years > 9999) {
            return -1;
        } else if (isLeapYear(years) == false) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;

                case 2:
                    return 28;

                case 4:
                case 9:
                case 6:
                case 11:
                    return 30;

            }
        } else if (isLeapYear(years) == true) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;

                case 2:
                    return 29;

                case 4:
                case 9:
                case 6:
                case 11:
                    return 30;

            }
        } else {

        }
        return -1;
    }

}
