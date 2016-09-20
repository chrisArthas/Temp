package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
//http://baidu.lecai.com/lottery/draw/list/50?type=latest&num=300

public class Lottery {
	
	private static String HTML_SOURCE = "D:\\lottery.html";
	
	private static String READ_PATH = "D:\\read.txt";
	
	private static String OUTPUT_PATH = "D:\\out.txt";
	
	private static double RED_RATE = 0.1818182;
	
	private static double BLUE_RATE = 0.0625;
	
	private static int FINAL_BLUE = 0;
	
	private static String FINAL_RED = "";
	
	 //历史总次数
	static int totalPeriod = 0;
	
	//历史出现次数
	static int red1 = 0;	
	static int red2 = 0;
	static int red3 = 0;	
	static int red4 = 0;
	static int red5 = 0;	
	static int red6 = 0;
	static int red7 = 0;	
	static int red8 = 0;
	static int red9 = 0;	
	static int red10 = 0;
	static int red11 = 0;	
	static int red12 = 0;
	static int red13 = 0;	
	static int red14 = 0;
	static int red15 = 0;	
	static int red16 = 0;
	static int red17 = 0;	
	static int red18 = 0;
	static int red19 = 0;	
	static int red20 = 0;
	static int red21 = 0;	
	static int red22 = 0;
	static int red23 = 0;	
	static int red24 = 0;
	static int red25 = 0;	
	static int red26 = 0;
	static int red27 = 0;	
	static int red28 = 0;
	static int red29 = 0;	
	static int red30 = 0;
	static int red31 = 0;	
	static int red32 = 0;
	static int red33 = 0;	
	
	static int blue1 = 0;
	static int blue2 = 0;
	static int blue3 = 0;
	static int blue4 = 0;
	static int blue5 = 0;
	static int blue6 = 0;
	static int blue7 = 0;
	static int blue8 = 0;
	static int blue9 = 0;
	static int blue10 = 0;
	static int blue11 = 0;
	static int blue12 = 0;
	static int blue13 = 0;
	static int blue14 = 0;
	static int blue15 = 0;
	static int blue16 = 0;
	
	//与概率次数差值
	static double redN1 = 0;	
	static double redN2 = 0;
	static double redN3 = 0;	
	static double redN4 = 0;
	static double redN5 = 0;	
	static double redN6 = 0;
	static double redN7 = 0;	
	static double redN8 = 0;
	static double redN9 = 0;	
	static double redN10 = 0;
	static double redN11 = 0;	
	static double redN12 = 0;
	static double redN13 = 0;	
	static double redN14 = 0;
	static double redN15 = 0;	
	static double redN16 = 0;
	static double redN17 = 0;	
	static double redN18 = 0;
	static double redN19 = 0;	
	static double redN20 = 0;
	static double redN21 = 0;	
	static double redN22 = 0;
	static double redN23 = 0;	
	static double redN24 = 0;
	static double redN25 = 0;	
	static double redN26 = 0;
	static double redN27 = 0;	
	static double redN28 = 0;
	static double redN29 = 0;	
	static double redN30 = 0;
	static double redN31 = 0;	
	static double redN32 = 0;
	static double redN33 = 0;	
	
	static double blueN1 = 0;
	static double blueN2 = 0;
	static double blueN3 = 0;
	static double blueN4 = 0;
	static double blueN5 = 0;
	static double blueN6 = 0;
	static double blueN7 = 0;
	static double blueN8 = 0;
	static double blueN9 = 0;
	static double blueN10 = 0;
	static double blueN11 = 0;
	static double blueN12 = 0;
	static double blueN13 = 0;
	static double blueN14 = 0;
	static double blueN15 = 0;
	static double blueN16 = 0;
	

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		analysisDta(HTML_SOURCE);
		
		readHistory(READ_PATH);
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
            	getAllTimes(tempString);
                totalPeriod = totalPeriod+1;
            }
            getRate();
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
	public static void OutPut(String result,String address)
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
	
	public static void  getAllTimes(String temp){
		String[] balls = temp.split("-");
		String redBalls = balls[0];
		String[] readBall = redBalls.split(",");
		int[] redBallsNum = new int[6];
		for(int i = 0;i<6;i++)
		{
			redBallsNum[i] = Integer.parseInt(readBall[i]);
			switch(redBallsNum[i])
			{
			case 1:
				red1 = red1 +1;
				break;
			case 2:
				red2 = red2 +1;
				break;
			case 3:
				red3 = red3 +1;
				break;
			case 4:
				red4 = red4 +1;
				break;
			case 5:
				red5 = red5 +1;
				break;
			case 6:
				red6 = red6 +1;
				break;
			case 7:
				red7 = red7 +1;
				break;
			case 8:
				red8 = red8 +1;
				break;
			case 9:
				red9 = red9 +1;
				break;
			case 10:
				red10 = red10 +1;
				break;
			case 11:
				red11 = red11 +1;
				break;
			case 12:
				red12 = red12 +1;
				break;
			case 13:
				red13 = red13 +1;
				break;
			case 14:
				red14 = red14 +1;
				break;
			case 15:
				red15 = red15 +1;
				break;
			case 16:
				red16 = red16 +1;
				break;
			case 17:
				red17 = red17 +1;
				break;
			case 18:
				red18 = red18 +1;
				break;
			case 19:
				red19 = red19 +1;
				break;
			case 20:
				red20 = red20 +1;
				break;
			case 21:
				red21 = red21 +1;
				break;
			case 22:
				red22 = red22 +1;
				break;
			case 23:
				red23 = red23 +1;
				break;
			case 24:
				red24 = red24 +1;
				break;
			case 25:
				red25 = red25 +1;
				break;
			case 26:
				red26 = red26 +1;
				break;
			case 27:
				red27 = red27 +1;
				break;
			case 28:
				red28 = red28 +1;
				break;
			case 29:
				red29 = red29 +1;
				break;
			case 30:
				red30 = red30 +1;
				break;
			case 31:
				red31 = red31 +1;
				break;
			case 32:
				red32 = red32 +1;
				break;
			case 33:
				red33 = red33 +1;
				break;
			}
		}
		
		
		
		int blueBall = Integer.parseInt(balls[1]);
		switch(blueBall)
		{
		case 1:
			blue1 = blue1 +1;
			break;
		case 2:
			blue2 = blue2 +1;
			break;
		case 3:
			blue3 = blue3 +1;
			break;
		case 4:
			blue4 = blue4 +1;
			break;
		case 5:
			blue5 = blue5 +1;
			break;
		case 6:
			blue6 = blue6 +1;
			break;
		case 7:
			blue7 = blue7 +1;
			break;
		case 8:
			blue8 = blue8 +1;
			break;
		case 9:
			blue9 = blue9 +1;
			break;
		case 10:
			blue10 = blue10 +1;
			break;
		case 11:
			blue11 = blue11 +1;
			break;
		case 12:
			blue12 = blue12 +1;
			break;
		case 13:
			blue13 = blue13 +1;
			break;
		case 14:
			blue14 = blue14 +1;
			break;
		case 15:
			blue15 = blue15 +1;
			break;
		case 16:
			blue16 = blue16 +1;
			break;
		}
	}
	public static void clearData()
	{
		//历史总次数
		 totalPeriod = 0;
		
		//历史出现次数
		 red1 = 0;	
		 red2 = 0;
		 red3 = 0;	
		 red4 = 0;
		 red5 = 0;	
		 red6 = 0;
		 red7 = 0;	
		 red8 = 0;
		 red9 = 0;	
		 red10 = 0;
		  red11 = 0;	
		  red12 = 0;
		  red13 = 0;	
		  red14 = 0;
		  red15 = 0;	
		  red16 = 0;
		  red17 = 0;	
		  red18 = 0;
		  red19 = 0;	
		  red20 = 0;
		  red21 = 0;	
		  red22 = 0;
		  red23 = 0;	
		  red24 = 0;
		  red25 = 0;	
		  red26 = 0;
		  red27 = 0;	
		  red28 = 0;
		  red29 = 0;	
		  red30 = 0;
		  red31 = 0;	
		  red32 = 0;
		  red33 = 0;	
		
		  blue1 = 0;
		  blue2 = 0;
		  blue3 = 0;
		  blue4 = 0;
		  blue5 = 0;
		  blue6 = 0;
		  blue7 = 0;
		  blue8 = 0;
		  blue9 = 0;
		  blue10 = 0;
		  blue11 = 0;
		  blue12 = 0;
		  blue13 = 0;
		  blue14 = 0;
		  blue15 = 0;
		  blue16 = 0;
	}
	
	public static void  getRate()
	{
		double red_suppose_num = totalPeriod * RED_RATE;
		double blue_suppose_num = totalPeriod * BLUE_RATE;
		System.out.println("totalPeriod: "+totalPeriod);
		System.out.println("red_suppose_num: "+red_suppose_num);
		System.out.println("blue_suppose_num: "+blue_suppose_num);
		double[] redN = new double[33];
		double[] blueN = new double[16];

		
		redN[0] = redN1 = red_suppose_num - red1; 
		redN[1] = redN2 = red_suppose_num - red2;
		redN[2] = redN3 = red_suppose_num - red3;
		redN[3] = redN4 = red_suppose_num - red4;
		redN[4] = redN5 = red_suppose_num - red5;
		redN[5] = redN6 = red_suppose_num - red6;
		redN[6] = redN7 = red_suppose_num - red7;
		redN[7] = redN8 = red_suppose_num - red8;
		redN[8] = redN9 = red_suppose_num - red9;
		redN[9] = redN10 = red_suppose_num - red10;
		redN[10] = redN11 = red_suppose_num - red11;
		redN[11] = redN12 = red_suppose_num - red12;
		redN[12] = redN13 = red_suppose_num - red13;
		redN[13] = redN14 = red_suppose_num - red14;
		redN[14] = redN15 = red_suppose_num - red15;
		redN[15] = redN16 = red_suppose_num - red16;
		redN[16] = redN17 = red_suppose_num - red17;
		redN[17] = redN18 = red_suppose_num - red18;
		redN[18] = redN19 = red_suppose_num - red19;
		redN[19] = redN20 = red_suppose_num - red20;
		redN[20] = redN21 = red_suppose_num - red21;
		redN[21] = redN22 = red_suppose_num - red22;
		redN[22] = redN23 = red_suppose_num - red23;
		redN[23] = redN24 = red_suppose_num - red24;
		redN[24] = redN25 = red_suppose_num - red25;
		redN[25] = redN26 = red_suppose_num - red26;
		redN[26] = redN27 = red_suppose_num - red27;
		redN[27] = redN28 = red_suppose_num - red28;
		redN[28] = redN29 = red_suppose_num - red29;
		redN[29] = redN30 = red_suppose_num - red30;
		redN[30] = redN31 = red_suppose_num - red31; 
		redN[31] = redN32 = red_suppose_num - red32;
		redN[32] = redN33 = red_suppose_num - red33;

		
		blueN[0] = blueN1 = blue_suppose_num - blue1;
		blueN[1] = blueN2 = blue_suppose_num - blue2;
		blueN[2] = blueN3 = blue_suppose_num - blue3;
		blueN[3] = blueN4 = blue_suppose_num - blue4;
		blueN[4] = blueN5 = blue_suppose_num - blue5;
		blueN[5] = blueN6 = blue_suppose_num - blue6;
		blueN[6] = blueN7 = blue_suppose_num - blue7;
		blueN[7] = blueN8 = blue_suppose_num - blue8;
		blueN[8] = blueN9 = blue_suppose_num - blue9;
		blueN[9] = blueN10 = blue_suppose_num - blue10;
		blueN[10] = blueN11 = blue_suppose_num - blue11;
		blueN[11] = blueN12 = blue_suppose_num - blue12;
		blueN[12] = blueN13 = blue_suppose_num - blue13;
		blueN[13] = blueN14 = blue_suppose_num - blue14;
		blueN[14] = blueN15 = blue_suppose_num - blue15;
		blueN[15] = blueN16 = blue_suppose_num - blue16;
		
		
		FINAL_BLUE = findBiggest(blueN);
		FINAL_RED = findBigSix(redN);
		
		
		
	
		OutPut(FINAL_RED + " - "+FINAL_BLUE,OUTPUT_PATH);

	}
	
	public static int findBiggest(double[] balls)
	{
		int[] blue = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		bubbleSort1(balls,15,blue);

		System.out.println("biggest: " + balls[0]+" num: "+ blue[0]);
		System.out.println("\n");
		System.out.println("=============blue==============");
		for(int i =0;i<16;i++)
		{
			System.out.print(" "+blue[i]);
		}
		System.out.println("\n");
		return blue[0];
	}
	
	public static String findBigSix(double[] balls)
	{
		int[] bignums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33};
		
		bubbleSort1(balls,32,bignums);
//		System.out.println(balls[0]+","+balls[1]+","+balls[2]+","+balls[3]+","+balls[4]+","+balls[5]);
		System.out.println("=============red==============");
		for(int i =0;i<33;i++)
		{
			System.out.print(" "+bignums[i]);
		}
		System.out.println("\n");
		
		return bignums[0]+","+bignums[1]+","+bignums[2]+","+bignums[3]+","+bignums[4]+","+bignums[5];
	}
	
	static void bubbleSort1(double a[], int n,int b[])  
	{  
	       int i, j;  
	       for (i = 0; i < n; i++)  
	              for (j = 0; j < n - i; j++)  
	                     if (a[j] < a[j+1])
	                     {
	                    	 swap(a, j,j+1);
	                    	 swap(b, j,j+1);  
	                     }

	       
	}  
	
	public static void swap(double a[],int num1,int num2)
	{
		double temp = a[num1];
		a[num1] = a[num2];
		a[num2] = temp;
	}
	public static void swap(int a[],int num1,int num2)
	{
		int temp = a[num1];
		a[num1] = a[num2];
		a[num2] = temp;
	}
	
	//网页解析
	public static void analysisDta(String fileName) {
        File file = new File(fileName);
        BufferedReader reader = null;
        boolean needRead = false;
        boolean needReadBlue = false;
        String redBalls="";
        String blueBall = "";
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
            	if(needRead)
            	{
            		redBalls= "";
            		redBalls = tempString.replace("</em><em>", ",").replace("<em>", "").replace("</em>", "").replace("</td>", "").trim();
            		needRead = false;
            	}
            	if(tempString.contains("<td class=\"redBalls\">"))
            	{
            		needRead = true;
            	}
            	if(needReadBlue)
            	{
            		blueBall = "";
//            		System.out.println(tempString);
            		blueBall = tempString.replace("<em>", "").replace("</em>", "").trim();
            		needReadBlue = false;
            		System.out.println(redBalls+"-"+blueBall);
            		String result = redBalls+"-"+blueBall;
            		OutPut(result, READ_PATH);            	}
            	if(tempString.contains("<td class=\"blueBalls\">"))
            	{
            		needReadBlue = true;
            	}

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

}
