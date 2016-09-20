package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class History {
	
	private static String data1 = "F:\\download\\2010.txt";
	private static String data2 = "F:\\download\\2011.txt";
	private static String data3 = "F:\\download\\2012.txt";
	private static String data4 = "F:\\download\\2013.txt";
	private static String data5 = "F:\\download\\2014.txt";
	private static String data6 = "F:\\download\\2015.txt";
	private static String data7 = "F:\\download\\2009.txt";
	private static String data8 = "F:\\download\\2008.txt";
	private static String data9 = "F:\\download\\2007.txt";
	private static String data10 = "F:\\download\\2006.txt";
	private static String data11 = "F:\\download\\2005.txt";
	private static String data12 = "F:\\download\\2004.txt";
	private static String data13 = "F:\\download\\2003.txt";
	private static String data14 = "F:\\download\\2016.txt";
	
	private static String READ_PATH = "D:\\read.txt";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readHistory(data1);
		readHistory(data2);
		readHistory(data3);
		readHistory(data4);
		readHistory(data5);
		readHistory(data6);
		readHistory(data7);
		readHistory(data8);
		readHistory(data9);
		readHistory(data10);
		readHistory(data11);
		readHistory(data12);
		readHistory(data13);
		readHistory(data14);

	}
	
	public static void readHistory(String fileName) {
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
            	String result = tempString.substring(11, 31);
            	result = result.replace("|", "-");
            	System.out.println(result);
            	outPut(result,READ_PATH);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }
	public static void outPut(String result,String address)
	{
		try
		{
			File file = new File(address);
			if(!file.exists())
			{
				file.createNewFile();
			}
			
			FileOutputStream fopt = new FileOutputStream(file,true);
			StringBuffer sb=new StringBuffer();
	        sb.append(result+"\n");
	        fopt.write(sb.toString().getBytes("utf-8"));
	        fopt.close();
		}catch(Exception e)
		{
			System.out.println("output exception");
		}

	}

}
