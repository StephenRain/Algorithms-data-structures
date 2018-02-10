package cn.itbull08;

public class DirectionDemo {
	
	public static void main(String[] args) {
		
		/**
		 * ö����ĳ�������
			int ordinal()		: ��ȡö���������     �����Ǵ�0��ʼ
			int compareTo(E o)	: ��ȡö���������Ĳ�ֵ
			String name()		: ��ȡö���������
			String toString()	: ��ȡö���������
			public static  T valueOf(Class<T> type,String name)	type��ʾҪ��ȡ��ö�����Class����name��ʾҪ��ȡ��û���������
			public static values() : ��ȡ���е�ö������ص�������ö���������
		 */
		
		// ��ȡһ��ö����
		Direction front = Direction.FRONT;
		Direction back = Direction.BACK;
		Direction left = Direction.LEFT;
		
		// int ordinal()
		int ordinal = back.ordinal();
		System.out.println(ordinal);
		
//		System.out.println("--------------------------------");
//		
//		// int compareTo(E o)
		int i = left.compareTo(front);
		System.out.println(i);
//		
//		System.out.println("--------------------------------");
//		
//		// String name()
		System.out.println(front.name());
//		
//		System.out.println("--------------------------------");
//		
//		// String toString()
//		System.out.println(front.toString());
//		
//		System.out.println("--------------------------------");
//		
//		// public static T valueOf(Class<T> type,String name)	type��ʾҪ��ȡ��ö�����Class����name��ʾҪ��ȡ��û���������
		Direction front1 = Enum.valueOf(Direction.class, "FRONT");
		System.out.println(front1.ordinal());
//		
		 System.out.println("--------------------------------");
//		// values()
		Direction[] values = Direction.values();
		
		for(Direction d : values) {
			System.out.println(d);
		}
		
	}

}
