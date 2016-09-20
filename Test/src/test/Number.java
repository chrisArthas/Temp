package test;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Number {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Date ss = strToDate("20160411");

//		transfer();
//		testString();
//		testRight();
		testNum();
	}
	
	public static Date strToDate(String strDate) {
		  SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		  ParsePosition pos = new ParsePosition(0);
		  Date strtodate = formatter.parse(strDate, pos);
		  
		  
		  SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd");
		  String ss = formatter2.format(strtodate);
		  
		  System.out.println(ss.toString());
		  return strtodate;
		}
	
	public static void transfer()
	{
		String num = "0.94";
		System.out.println("parse: "+Double.parseDouble(num));
		System.out.println("value: "+Double.valueOf(num));
	}
	
	public static void testString()
	{
		String data = "1234567";
        String parts[] = data.split("\\.");
        String num = parts[0];
        int length = num.length();
        String finalStr = "";
        while (length - 3 > 0)
        {
        	String tmp = ","+num.substring(length - 3,length);
            finalStr = tmp + finalStr;
            length = length -3;
        }
        String left = num.substring(0,length);

        if(parts.length >1)
        {
            System.out.println(left + finalStr + "."+parts[1]);
        }else
        {
            System.out.println(left + finalStr);
        }

	}
	
	public static void testRight()
	{
		int time = 600;
		System.out.println((time/7>>0));
	}
	
	public static void testNum()
	{
		double num = 9.1;
		DecimalFormat df = new DecimalFormat("#.00");  
        System.out.println(df.format(num)); 
	}
	

}
