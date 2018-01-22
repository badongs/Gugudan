
public class Gugudan {

	public static void main(String[] args) {
		// 2단
//		for(int i=1 ; i<=10 ; i++) {
//			System.out.println( "2 *"+ i +" = " +2*i );	
//		}
		
		// 1단 ~ 10딘
		int i = 0;
		int j = 0;	
		
		for	(j=1 ; j <=10; j++) {
			System.out.println( " *********"+ j +"단 입니다. ********* " );
			for(i=1 ; i<=10 ; i++) {
				System.out.println( j + " * " + i +" = " + j * i );	
			}
		}
	}
}
