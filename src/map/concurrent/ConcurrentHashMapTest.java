package map.concurrent;

import java.util.concurrent.ConcurrentHashMap;
import org.junit.Test;
public class ConcurrentHashMapTest {
	
	@Test
	public void test(){
		
		ConcurrentHashMap<String, Object> currentMap = new ConcurrentHashMap<>();
		
		currentMap.put("username001", "ÕÅÈı");
		currentMap.put("username002", "Lisi");
		currentMap.put("username003", "wngwu");
		currentMap.put("username004", "zhaoliu");
		
		System.out.println(1 << 30);
		
	}

}
