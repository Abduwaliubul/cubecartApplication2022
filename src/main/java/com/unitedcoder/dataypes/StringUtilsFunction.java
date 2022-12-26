package com.unitedcoder.dataypes;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsFunction {
    public static void main(String[] args) {

        String s1="learn java is fun";
        String s2="selenium test automation";
        String name="alim";
        String s="hgjhgyghiuhtydrdfjlgtrfyoiuuyderdu,";
        String s3="100";

        System.out.println(StringUtils.reverse(s1));
        System.out.println(StringUtils.reverseDelimited(s1,' '));
        System.out.println(StringUtils.reverseDelimited(s2,','));
        System.out.println(StringUtils.capitalize(name));

        System.out.println(StringUtils.countMatches(s,"j"));
        System.out.println(StringUtils.isEmpty(name));

        System.out.println(StringUtils.isNumeric(s));
        System.out.println(StringUtils.isNumeric(s3));
    }
}
