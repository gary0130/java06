import java.util.*;

public class Main {
	static Scanner scn = new Scanner(System.in);
	static int x = 0, y = 0;// 選擇模式及無限模式
	static int numb = 0;// 偏移量
	// 簡單加密系統

	public static void main(String[] args) {
		info();// 說明文字

		while (1 == 1) {
			if (y != 1) {//無限模式，不再詢問
				type();
			}
			if (x != 9) {//顯示說明，不進入encode區
				encode();
			}
		}

	}

	public static void encode() {
		// 轉換成整數型
		Scanner text = new Scanner(System.in);
		System.out.println("請輸入要加密的文字");
		String s1 = text.nextLine(), s2 = "", s3 = "";
		char[] ca1 = new char[s1.length()];
		char[] decode = new char[s1.length()];
		ca1 = s1.toCharArray();

		// 數字補零
		for (int i = 0; i < s1.length(); i++) {
			// 加密
			decode[i] = (char) ((int) (ca1[i]) + numb);// numb是偏移量
			s3 = s3 + decode[i];

			String j = String.valueOf((int) ca1[i]);

			if (j.length() == 2) {
				j = "0" + j;
			}
			s2 = s2 + String.valueOf(j) + " ";
		}

		// 打印
		System.out.println("以下為結果");
		System.out.println("萬國碼:" + s2);
		System.out.println("轉換結果:" + s3);
		System.out.println();

	}

	static void info() {
		System.out.println("簡單加密系統");
		System.out.println("版本:0.8.26");
	}

	static void type() {
		String typex = "", typey = "";
		System.out.println("請輸入模式(輸入9來顯示說明)");
		x = scn.nextInt();// 參數1

		switch (x) {
		case 0:// 簡單轉換
			typex = "簡單轉換";
			break;

		case 1:
			System.out.println("進入偏移模式,請輸入偏移量");
			numb = scn.nextInt();
			typex = "偏移模式,偏移"+numb;
			break;
		case 9:// 說明
			System.out.println("請輸入2個參數,以換行隔開");
			System.out.println("第1參數為支援型態,第2參數為是否開啟記憶模式");
			System.out.println("第一參數目前支援 \n0:將字符轉換成萬國碼 \n1:偏移模式的加密及解密");
			System.out.println("第二參數為記憶模式 \n0為不開啟,每次使用必須輸入2個參數\n1為開啟,每次只要輸入要處理的文字即可");
			System.out.println("看完請重新啟動!!");
			break;
		default:
			x = 0;
			break;
		}
		if (x != 9) {
			System.out.println("是否記憶模式");
			y = scn.nextInt();// 參數2
			
			switch (y) {
			case 0:
				typey="一般";
				break;
			case 1:
				typey="記憶";
				break;
			default:
				break;
			}

			System.out.println("現在是" + typex +","+ typey + "模式");
		}
	}

}
