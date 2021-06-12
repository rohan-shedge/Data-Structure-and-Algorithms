package algorithms.string;

public class HackerRank_SuperReducedString {
	public static void main(String[] args) {
		String str = "aabbccDDeef";
		int i = 0;
		while(i < str.length() -1) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				str = str.substring(0, i) + str.substring(i+2); 
				i = 0;
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
