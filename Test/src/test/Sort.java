package test;

import java.util.Collection;
import java.util.Collections;

public class Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Integer.parseInt("01"));
	
//		int nums[] = {33,24,52,34,6,3,63,42,56,38,53,59};
////		quickSort(nums,0,11);
//		bubbleSort1(nums,11);
//		for(int i = 0 ; i<nums.length;i++)
//		{
//			System.out.print(nums[i]+" ");
//		}
	}
	
	static void bubbleSort1(int a[], int n)  
	{  
	       int i, j;  
	       for (i = 0; i < n; i++)  
	              for (j = 0; j < n - i; j++)  
	                     if (a[j] > a[j+1])  
	                    	 swap(a, j,j+1);  
	}  
	
	public static void swap(int a[],int num1,int num2)
	{
		int temp = a[num1];
		a[num1] = a[num2];
		a[num2] = temp;
	}
	

	
	public static void quickSort(int args[],int l ,int r)
	{	
		if(l<r)
		{
			int i = l;
			int j = r;
			int x = args[i];
			while(i<j)
			{
				while(i<j && args[j]>=x)//从右边开始找出小于X的数
				{
					j--;
				}
				if(i < j)
				{
					args[i] = args[j];// 讲小于x的数 填入左边的坑
					i++;
				}
				while(i<j && args[i]<=x)// 从左开始找 大于x的数
				{
					i++;
				}
				if(i<j)
				{
					args[j] = args[i];//填入 右边刚挖的坑
					j--;
				}
			}
			args[i] = x;//设置中间值
			//分治 
			quickSort(args,l,i-1);
			quickSort(args,i+1,r);

		}
	}
	
	
	
}
