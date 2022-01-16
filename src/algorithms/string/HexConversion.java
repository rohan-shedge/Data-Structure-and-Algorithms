package algorithms.string;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;

public class Try {

	private static String toHex(String value)
	{
		String encodedStr = "";
		for ( char c: value.toCharArray() )
		{
			encodedStr += Integer.toString( c, 16 );
		}
		return encodedStr;
	}
	
	
	public static String toBase64Hex(String _input)
	{
		String hex = "";
		if (_input != null)
		{
			byte[] raw = Base64.decodeBase64(_input);
			hex = new String(Hex.encodeHex(raw));
		}
		return hex;
	}
	
	public static void main(String[] args) {
		
		
		 // create a Optional
        Optional<Integer> op1
            = Optional.ofNullable(9455);
  
        // print value
        System.out.println("Optional 1: "
                           + op1);
		
		System.out.println(Try.toHex("A"));
		
		System.out.println("-------------");

		
		
		byte[] c = new byte[] {99, 100, 101};
		String str = new String(c);
		System.out.println(str);
		
		System.out.println(Charset.defaultCharset().displayName());
		
		String str1 = "Man ";   
		byte[] bytesOfString = str1.getBytes(Charset.forName("UTF-8"));
	    for(int i=0; i< bytesOfString.length ; i++) {
	         System.out.print(bytesOfString[i] +" ");
	      
	    }
	    System.out.println();
	    System.out.println("世界您好!");
		
	}

}
