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
		for(int i=1 ; i<=10 ; i++) {
			caculate(i) ;	
		}	
	}
}
