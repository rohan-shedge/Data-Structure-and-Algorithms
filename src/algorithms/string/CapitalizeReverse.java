package algorithms.string;

/**
 * 
 * 
 * @author shedger
 * Reverse words in a string and capitalize the first letter.
 * 
 * Reverse the words in a string and capitalize the first letter of each reversed word,
   preserving the capitalization in the original string. 
   For eg: "Hello World" would be transformed to "OlleH DlroW".
 *
 */
public class CapitalizeReverse {
	public static void main(String[] args) {
		String str = "hello world";
		StringBuilder newString = new StringBuilder();
		String[] strArray = str.split(" ");
		for(String s : strArray) {
			//ToUpperCase of 1st Char
			Character c = Character.toUpperCase(s.charAt(0));
			String ndString = s.substring(1);
			String Inter = c +  ndString;
			StringBuilder temp =  new StringBuilder(Inter).reverse();
			newString.append(temp);
			newString.append(" ");
		}
		System.out.println(newString);
	}
}
