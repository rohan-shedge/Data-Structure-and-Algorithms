package algorithms.string;

public class HackerRank_CamelCase {
	public static void main(String[] args) {
		String str = "rohanIsABadBoy";
		int count = 0;
		for (char c : str.toCharArray()) {
			if (c >= 65 && c <= 90) {
				count ++;
			}
		}
		System.out.println(count + 1);
		
		System.out.println("***************");	
		//solution 2: Using  String Split
		str = "rohanIsABadBoy";
		String[] parts = str.split("[A-Z]");
		System.out.println(parts.length);
		
		System.out.println("***************");	
		//solution 3: Using  String Split
		str = "rohanIsABadBoy";
		count = (int) (str.chars()
					   .filter(c -> Character.isUpperCase(c))
					   .count() + 1);
		System.out.println(count);
		
		
		
		
		
	}
}