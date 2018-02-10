package 面试题;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.google.gson.Gson;



public class Test1 {

	/**
	 * 【第一题】JSON格式转换 在某个特定应用场景中，我们有一个从JSON获取的内容，
	 * 比如： m = { "a": 1, "b": { "c": 2,"d": [3,4] } } 
	 * 现在需要把这个层级的结构做展开，只保留一层key/value结构。
	 * 对于上述 输入，需要得到的结构是： o ={"a": 1, "b.c": 2, "b.d": [3,4] }
	 *  也就是说，原来需要通过 m["b"]["c"] 访问的值，在展开后可以通过 o["b.c"] 访问。 
	 *  请实现这个“层级结构展开”的代码。 
	 * 输入：任意JSON（或者map/dict）
	 * 输出：展开后的JSON（或者map/dict）
	 */
	@Test
	public void test12() {
		HashMap<String, Object> hashMap = new HashMap<String,Object>();
		HashMap<String, Object> map1 = new HashMap<String,Object>();
		Object[] arr = new Object[]{3,4,"数组元素1"};
		map1.put("c", 2);
		map1.put("d", arr);
		hashMap.put("a", 1);
		hashMap.put("b", map1);
		
		
		
		
		
		
	}
	
	public Map<String,Object> parse(Map<String,Object> map,
			Map<String,Object> newMap){
		
		if(map== null || map.size()==0)
			return map;
		
		
		for (Map.Entry<String, Object> element : map.entrySet()) {
			String key = element.getKey();
			Object value = element.getValue();
			if(value instanceof Map) {
				//value = map.remove(key);
				Map<String,Object> subMap = (Map<String,Object>)value;
				parse(subMap,newMap);
			}else{
				newMap.put(key, value);
			}
			
		
		}
		return null;
		
		
		
	}
	
	@Test
	public void test2(){
		HashMap<String, Object> map = new HashMap<String,Object>();
		ArrayList<String> list = new ArrayList<String>();
		
		map.put("aa", 888);
		if(list instanceof Map)
			System.out.println("true");
		else
			System.out.println("false");
		
	}
	
	
	
	

}
