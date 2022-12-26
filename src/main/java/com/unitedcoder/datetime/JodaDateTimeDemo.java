package com.unitedcoder.datetime;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


import java.time.ZoneId;
import java.util.Set;

public class JodaDateTimeDemo {
    public static void main(String[] args) {

        DateTime time=new DateTime();
        System.out.println(time);
        DateTimeFormatter formatter= DateTimeFormat.forPattern("yyy-MM-dd-hh-mm-ss-SS");
        System.out.println(time.toString(formatter));


        DateTime universalTime=new DateTime(DateTimeZone.UTC);
        System.out.println(universalTime);


        DateTime istanbulTime=new DateTime(DateTimeZone.forID("Europe/Istanbul"));
        System.out.println(istanbulTime);

        Set<String> timeZones= ZoneId.getAvailableZoneIds();
//        for (String z:timeZones){
//            System.out.println(z);
//        }

        System.out.println(universalTime.getDayOfMonth());
        System.out.println(universalTime.dayOfYear());

        DateTime.Property dayName=universalTime.dayOfWeek();
        System.out.println(dayName.getAsText());

        System.out.println(universalTime.plusMonths(2));

        //get difference
        DateTime beginDateTime=new DateTime("2022-10-14");
        DateTime executionDate=new DateTime();
        Period period1=new Period(beginDateTime,executionDate, PeriodType.days());
        System.out.println(period1.getDays());






        }
}
