package com.saqqu.advanceddateformatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AdvDateFormatter {

    public static String getThFormattedDate(String date, String currentFormat) {

        String finalstr = "", day = "", month = "", year = "";
        Date dateft = null;
        Date dateft2 = null;
        Date dateft3 = null;
        int dayvalu = 0;
        String sufix = "";
        try {
            dateft = new SimpleDateFormat(currentFormat).parse(date);
            day = new SimpleDateFormat("d").format(dateft);

            dateft2 = new SimpleDateFormat(currentFormat).parse(date);
            month = new SimpleDateFormat("MMM").format(dateft2);

            dateft2 = new SimpleDateFormat(currentFormat).parse(date);
            year = new SimpleDateFormat("yyyy").format(dateft2);

            dayvalu = Integer.parseInt(day);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (dayvalu == 1 || dayvalu % 20 == 1 || dayvalu % 30 == 1) {
            sufix = "st";
        } else if (dayvalu == 2 || dayvalu % 20 == 2) {
            sufix = "nd";
        } else if (dayvalu == 3 || dayvalu % 20 == 3) {
            sufix = "rd";
        } else {
            sufix = "th";
        }
        return day + sufix + " " + month + ", " + year;

    }

    public static String getThFormattedDate(String date, String currentFormat, boolean showYear, boolean showMonth) {

        String finalstr = "", day = "", month = "", year = "";
        Date dateft = null;
        Date dateft2 = null;
        Date dateft3 = null;
        int dayvalu = 0;
        String sufix = "";
        try {
            dateft = new SimpleDateFormat(currentFormat).parse(date);
            day = new SimpleDateFormat("d").format(dateft);

            dateft2 = new SimpleDateFormat(currentFormat).parse(date);
            month = new SimpleDateFormat("MMM").format(dateft2);

            dateft2 = new SimpleDateFormat(currentFormat).parse(date);
            year = new SimpleDateFormat("yyyy").format(dateft2);

            dayvalu = Integer.parseInt(day);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (dayvalu == 1 || dayvalu % 20 == 1 || dayvalu % 30 == 1) {
            sufix = "st";
        } else if (dayvalu == 2 || dayvalu % 20 == 2) {
            sufix = "nd";
        } else if (dayvalu == 3 || dayvalu % 20 == 3) {
            sufix = "rd";
        } else {
            sufix = "th";
        }
        return day + sufix + (showMonth ? (" " + month) : "") + (showYear ? (", " + year) : "");

    }


    public static String getDateThFormatBefore(int beforeDays, String date, String currentFormat) {

        String dayBefore = "";
        try {
            Date givenDate = new SimpleDateFormat(currentFormat).parse(date);

            Date myDate = new Date(givenDate.getTime() - (1000 * 60 * 60 * 24 * beforeDays));
            SimpleDateFormat dateFormat = new SimpleDateFormat(currentFormat);
            dayBefore = dateFormat.format(myDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return getThFormattedDate(dayBefore, currentFormat);
    }

}
