import java.util.Scanner;

public class Gugudan {
	public static void caculate(int times) {
		int[] rs = new int[10];
		System.out.println( " ********* " + times + "단을 입력해 주세요. ********* " );
		for(int i=0 ; i<rs.length ; i++) {			
			System.out.println( times + " * " + (i+1) +" = " + times * (i+1) );
		}
				
	}
	
	public static void main(String[] args) {
		
		caculate(1) ;
		for(int i=1 ; i<=10 ; i++) {
			caculate(i) ;	
		}
		
		// 1단 ~ 10딘
//		int i = 1;
//		System.out.println( " *********단을 입력해 주세요. ********* " );
//		Scanner scanner = new Scanner(System.in);		
//		int j  = scanner.nextInt();
//		
//		while(i<=10) {
//			System.out.println( j + " * " + i +" = " + j * i );
//			i++;
//		}
//		
//		for(i=1 ; i<=10 ; i++) {
//			System.out.println( j + " * " + i +" = " + j * i );	
//		}
		
//		배열을 이용한 구구단
	
//		System.out.println( " *********단을 입력해 주세요. ********* " );
//		Scanner scanner = new Scanner(System.in);		
//		int j  = scanner.nextInt();
//		
//		int[][] result = new int[9][10];
//		for(int i=0; i < result.length; i++) {
//			
//			for(int j=0; j < result[i].length; j++) {
//				result[i][j] = (i+1) *(j+1);				
//			}
//		}
//		
//		for(int i=0; i < result.length; i++) {
//			System.out.println( " ********* " + i + "단을 입력해 주세요. ********* " );
//			for(int j=0; j < result[i].length; j++) {
//				System.out.println(result[i][j]);
//			}
//		}
		
	}
}
