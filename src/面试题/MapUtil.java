package 面试题;

import java.util.Map;
/**
 *  m = { "a": 1, "b": { "c": 2,"d": [3,4],"g": { "c": 2,"d": [3,4] } },"f": { "c": 2,"d": [3,4] } } 
 */

public class MapUtil {
	
	private String tempKey = null ;
	
	private Map<String,Object> newMap = null;

	public Map<String, Object> parse(Map<String, Object> map) {
		
		if (map == null || map.size() == 0)
			return map;

		for (Map.Entry<String, Object> element : map.entrySet()) {
			String key = element.getKey();//获取map集合中的键
			Object value = element.getValue();//值
			if (value instanceof Map) {
				tempKey = key;
				Map<String, Object> subMap = (Map<String, Object>) value;
				parse(subMap);
			} else {
				if(tempKey != null){
					newMap.put(tempKey+"."+key,value);
				}else{
					newMap.put(key, value);
				}
			}

		}
		return null;

	}

}
