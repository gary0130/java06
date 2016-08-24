import java.util.*;

import android.R.integer;
import android.R.string;

public class Main
{
	static Scanner scn=new Scanner(System.in);
	static int x=1;
	//簡單加密系統
	public static void main(String[] args)
	{	
		info();
		while(1==1){
			
		//help();
		encode();
			}
		
		
	}
	 
	public static void encode()
	{
		//轉換成整數型
		System.out.println("請輸入要加密的文字");
		String s1=scn.nextLine(),s2="",s3="";
		char[] ca1=new char[s1.length()];
		char[] decode=new char[s1.length()];
		ca1=s1.toCharArray();
		System.out.println();
		
		//數字補零
		for(int i=0;i<s1.length();i++)
		{
			//加密
			decode[i]=(char) ((int)(ca1[i])-7);//7是偏移量
			s3=s3+decode[i];
		
			String j=String.valueOf((int)ca1[i]);
			
			if(j.length()==2){j="0"+j;}
			s2=s2+String.valueOf(j);
		}
		
		//打印
		System.out.println(s2);
		System.out.println(s3);
		
		
		
	}
	static void info()
	{
		System.out.println("簡單加密");
	}
	static void help()
	{
		System.out.println("請輸入參數");
		x=scn.nextInt();
	}
	static void unencode()
	{
		
	}
}
