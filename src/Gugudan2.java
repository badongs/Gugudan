import java.util.Scanner;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class Gugudan2 {
	public static void caculeteer() {
		// TODO Auto-generated constructor stub
		System.out.println("구구단 첫번때,두번째 숫자를 넣으시오 (예 : 8,7)");
		Scanner sc1 = new Scanner(System.in);
		//int num1 = sc1.nextInt();
		String str1 = sc1.nextLine();
		
		String[] splitStr= str1.split(",");
		
		int num1 = Integer.parseInt(splitStr[0].trim());
		int num2 = Integer.parseInt(splitStr[1].trim());
		
		/*
		System.out.println("구구단 두번때 숫자를 넣으시오");
		Scanner sc2 = new Scanner(System.in);
		int num2 = sc2.nextInt();
		*/
		
		for(int i=1; i<=num1;i++) {
			System.out.println("*********" + i + "단입니다. ***********");
			for(int j=1; j<=num2;j++) {
				System.out.println(i + " * "+ j + " = " + (i * j));
			}
		}
	}
}
