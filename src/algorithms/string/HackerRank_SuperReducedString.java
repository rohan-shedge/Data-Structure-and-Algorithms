package algorithms.string;

public class HackerRank_SuperReducedString {
	public static void main(String[] args) {
		String str = "aabbccDD";
		int i = 1;
		while(i < str.length()) {
			if (str.charAt(i - 1) == str.charAt(i)) {
				str = str.substring(0, i - 1) + str.substring(i + 1); 
				i = 1;
			}else {
				i++;
			}
		}
		if (str.length() == 0) {
			System.out.println("Empty String");
		} else {
			System.out.println(str);
		}
	}
}
