package star;
/**
 * ´òÓ¡µ¹Èý½ÇÐÇÐÇ
 */
public class PrintStar {
	public static void main(String[] args) {
		
		for(int i = 1; i<= 5 ; i++){
			for(int j = 1; j <= 6-i; j++){
				System.out.print("*");	
			}
			System.out.println();
		}
	}
}
