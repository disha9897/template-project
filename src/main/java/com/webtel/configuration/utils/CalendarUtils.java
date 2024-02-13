package com.webtel.configuration.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.Calendar;
import java.util.Date;

public class CalendarUtils {
    
    public static String getCurrentYear()
    {
        String result;
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        result = StringUtils.leftPad(cal.get(Calendar.YEAR)+"", 4, "0");
        return result;
    }

    public static String getCurrentMonth()
    {
        String result;
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        result = StringUtils.leftPad(cal.get(Calendar.MONTH) + 1 +"", 2, "0");
        return result;
    }

    public static String getCurrentDate()
    {
        String result;
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        result = StringUtils.leftPad(cal.get(Calendar.DATE)+"", 2, "0");
        return result;
    }
}
