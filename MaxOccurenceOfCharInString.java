package hashmapoctober13;
import java.util.*;

public class MaxOccurenceOfCharInString {
	public static void main(String [] args) {
		
		String str = "tit for tat is a proverb";
		str.toLowerCase();
		
		HashMap <Character, Integer> datamap = new HashMap<>();
		
		for(int i=0; i<str.length();i++) {
			Character ch = str.charAt(i);
			
			if(ch >='a' && ch<='z') {
				if(datamap.containsKey(ch)) {
					Integer value = datamap.get(ch);
					value++;
					datamap.put(ch, value);
					
				}
				else {
					datamap.put(ch, 1);
				}
			}
			
		}
		int max= 0;
		char maxchar=0;
		
		for(Character key: datamap.keySet()) {
			int value = datamap.get(key);
			if(value>max) {
				max=value;
				maxchar= key;
			}
		}
		System.out.println(maxchar +" occurs "+ max+" times");
	}

}
