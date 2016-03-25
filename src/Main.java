import java.util.*;


public class Main
{
	static Scanner scn=new Scanner(System.in);
	static int x=1;
	//簡單加密系統
	public static void main(String[] args)
	{
		info();
		help();
		encode();
			
		
	}
	public static void encode()
	{
		//加密區
		System.out.println("請輸入要加密的文字");
		String s1=scn.next();
		char[] ca1=new char[s1.length()];
		ca1=s1.toCharArray();
		System.out.println();
		for(int i :ca1)
		{
			i=i+x;
			System.out.print((char)i);
		}
		
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
