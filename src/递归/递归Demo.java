package µİ¹é;
/**
 * Çó10µÄ½×³Ë
 * 
 */
public class µİ¹éDemo {

	public static void main(String[] args) {
		
		int result = µİ¹éDemo.getResult(4);
		System.out.println(result);
		
	}
	
	public static int getResult(int num){
		if(num == 1){
			return 1;
		}
		
		return getResult(num-1) * num;
		
	}

}
