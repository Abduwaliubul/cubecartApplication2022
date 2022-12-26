package com.unitedcoder.dataypes;

import java.sql.ResultSet;

public class StringDemo2 {
    public static void main(String[] args) {
        String city="Amsterdam";
        String country="NetherLand";
        String course="Java Selenium Test Automation";
        String Space=" ";
        int L=city.length();
        System.out.println(L);
        int i1=country.indexOf("a");
        System.out.println(i1);
       System.out.println(course.indexOf("Test"));
      System.out.println(Space.length());

System.out.println("Index of first e:"+country.indexOf("e"));
System.out.println("index of last e"+country.lastIndexOf("e"));
      System.out.println(city.toUpperCase());
      System.out.println(course.toLowerCase());

      course=course.replace("Java","/");
      System.out.println(course);
      String data="03-09-2022";
      data=data.replace("-","/");
      System.out.println(data);

      String value="2345, 9876";
      value=value.replace(",",".").replace(" ","");
      System.out.println(value);


      String result="About 18.760.000.000 results";
     // result＝result.replace("About","").replace("results","");
     // result=result.replace("About","").replace("results","").trim();
      System.out.println(result);




      //sub string
        System.out.println(result.substring(5,10));
       int beginIndex=result.indexOf("1");
       int endIndex=result.lastIndexOf("0");
       System.out.println("begin Index : "+beginIndex);
       System.out.println("End Index :"+endIndex);
       System.out.println(result.substring(beginIndex,endIndex+1));
       // System.out.println(result.substring(6,20));



        //compare two string
        String s1="java";
        String s2="Java";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));


        //string concatenation
        int i3=100;
        int i2=200;
        System.out.println(i3+i2);
        String v1="100";
        String v2="200";
        String v3="hello";
        String v4="world";
        System.out.println(v3+v4);
        System.out.println(v1+v2);















    }
}
