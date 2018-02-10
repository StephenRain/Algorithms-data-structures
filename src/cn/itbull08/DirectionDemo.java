package cn.itbull08;

public class DirectionDemo {
	
	public static void main(String[] args) {
		
		/**
		 * 枚举类的常见方法
			int ordinal()		: 获取枚举项的索引     索引是从0开始
			int compareTo(E o)	: 获取枚举项索引的差值
			String name()		: 获取枚举项的名称
			String toString()	: 获取枚举项的名称
			public static  T valueOf(Class<T> type,String name)	type表示要获取的枚举类的Class对象，name表示要获取的没举项的名称
			public static values() : 获取所有的枚举项，返回的是所有枚举项的数组
		 */
		
		// 获取一个枚举项
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
//		// public static T valueOf(Class<T> type,String name)	type表示要获取的枚举类的Class对象，name表示要获取的没举项的名称
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
