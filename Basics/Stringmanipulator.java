package Basics;
import java.util.ArrayList;
import java.util.List;
public class Stringmanipulator {

	public static String geekify(String line) {
		int iteration = line.length() / 2;
		char[] chars;
		chars = line.toCharArray();
		for(int i=0; i<iteration; i++) {
			int a = i * 2;
			chars[a] = Character.toUpperCase(chars[a]);
			a--;
			if(a>0) {
				chars[a] = Character.toLowerCase(chars[a]);
			}
		}
		return String.valueOf(chars);
	}
	
	public static String seperateVowels(String line) {
		List<String> vowels = new ArrayList<String>();
		List<String> consonants = new ArrayList<String>();
		char[]input;
		String output = "";
		input = line.toCharArray();
		for(int i=0; i<line.length(); i++) {
			if(Character.toString(input[i]).equalsIgnoreCase("a") || Character.toString(input[i]).equalsIgnoreCase("e") || Character.toString(input[i]).equalsIgnoreCase("i") || Character.toString(input[i]).equalsIgnoreCase("o") || Character.toString(input[i]).equalsIgnoreCase("u")) {
				vowels.add(Character.toString(input[i]));
			}else if(Character.toString(input[i]).matches("[a-zA-Z]")){
				consonants.add(Character.toString(input[i]));
			}
		}
		for(String s : vowels) {
			output += s;
		}
		for(String s : consonants) {
			output += s;
		}
		return output;
	}
}
