import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// 2단
//		for(int i=1 ; i<=10 ; i++) {
//			System.out.println( "2 *"+ i +" = " +2*i );	
//		}
		
		// 1단 ~ 10딘
		int i = 1;
		//int j = 0;	
		System.out.println( " *********단을 입력해 주세요. ********* " );
		Scanner scanner = new Scanner(System.in);		
		int j  = scanner.nextInt();
//				for	(j=1 ; j <=10; j++) {
//			System.out.println( " *********"+ j +"단 입니다. ********* " );
//			for(int i=1 ; i<=10 ; i++) {
//				System.out.println( j + " * " + i +" = " + j * i );	
//			}
//		}
		
		while(i<=10) {
			System.out.println( j + " * " + i +" = " + j * i );
			i++;
		}
	}
}
