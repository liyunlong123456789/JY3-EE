package com.neuedu.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class ProUtil {
    //将字符串类型的日期转换成Date类型
    public static Date getStringconverseDate(String srt)
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        java.sql.Date date = null;
        try {
            java.util.Date parse = simpleDateFormat.parse(srt);
             date = new java.sql.Date(parse.getTime());

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
    //拿到商品ID
    public static  String getProId()
    {
        Random random = new Random();
        int i = random.nextInt(100);
        String str = null;
        str = String.valueOf(System.currentTimeMillis());
        if (i<10)
        {
            str += "0"+i;
        }
        return str += i;
    }
}
