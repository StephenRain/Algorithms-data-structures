package ������;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.google.gson.Gson;



public class Test1 {

	/**
	 * ����һ�⡿JSON��ʽת�� ��ĳ���ض�Ӧ�ó����У�������һ����JSON��ȡ�����ݣ�
	 * ���磺 m = { "a": 1, "b": { "c": 2,"d": [3,4] } } 
	 * ������Ҫ������㼶�Ľṹ��չ����ֻ����һ��key/value�ṹ��
	 * �������� ���룬��Ҫ�õ��Ľṹ�ǣ� o ={"a": 1, "b.c": 2, "b.d": [3,4] }
	 *  Ҳ����˵��ԭ����Ҫͨ�� m["b"]["c"] ���ʵ�ֵ����չ�������ͨ�� o["b.c"] ���ʡ� 
	 *  ��ʵ��������㼶�ṹչ�����Ĵ��롣 
	 * ���룺����JSON������map/dict��
	 * �����չ�����JSON������map/dict��
	 */
	@Test
	public void test12() {
		HashMap<String, Object> hashMap = new HashMap<String,Object>();
		HashMap<String, Object> map1 = new HashMap<String,Object>();
		Object[] arr = new Object[]{3,4,"����Ԫ��1"};
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
