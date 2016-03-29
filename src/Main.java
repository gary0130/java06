import java.util.*;

public class Main
{
	static Scanner scn=new Scanner(System.in);
	static int x=1;
	//簡單加密系統
	public static void main(String[] args)
	{
		while(1==1){
			info();
		//help();
		encode();
			}
		
		
	}
	public static void encode()
	{
		//轉換成整數型
		System.out.println("請輸入要加密的文字");
		String s1=scn.nextLine(),s2="";
		char[] ca1=new char[s1.length()];
		ca1=s1.toCharArray();
		System.out.println();
		
		//數字補零
		for(int i :ca1)
		{
			String j=String.valueOf(i);
			if(j.length()==2){j="0"+j;}
			s2=s2+String.valueOf(j);
		}
		
		//打印
		System.out.println(s2);
		
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
