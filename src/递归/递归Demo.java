package �ݹ�;
/**
 * ��10�Ľ׳�
 * 
 */
public class �ݹ�Demo {

	public static void main(String[] args) {
		
		int result = �ݹ�Demo.getResult(4);
		System.out.println(result);
		
	}
	
	public static int getResult(int num){
		if(num == 1){
			return 1;
		}
		
		return getResult(num-1) * num;
		
	}

}
