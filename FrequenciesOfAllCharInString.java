package hashmapoctober13;
import java.util.HashMap;

public class FrequenciesOfAllCharInString {
	public static void main(String [] args) {
		String str ="aaabbbcccddeeeffffksacd";
		HashMap<Character, Integer> frequncy = new HashMap<>();
		for(int i =0 ; i<str.length();i++) {
			Character ch = str.charAt(i);
			if(frequncy.containsKey(ch)) {
				Integer value = frequncy.get(ch);
				value++;
				frequncy.put(ch,value);
			}else {
				frequncy.put(ch, 1);
			}
		}
		for(Character key : frequncy.keySet()) {
			System.out.println(key +" = "+ frequncy.get(key));
		}
	}

}
