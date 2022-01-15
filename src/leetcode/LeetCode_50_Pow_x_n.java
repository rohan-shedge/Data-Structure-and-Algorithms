package leetcode;

public class LeetCode_50_Pow_x_n {
	private static double pow(double x, double y)
	{
		double result = 1;
		double pow = Math.abs(y); 
	    while (pow > 0) 
	    {
	        // y is even
	        if (pow % 2 == 0) 
	        {
	            x = x * x;
	            pow = pow / 2;
	        }
	        // y isn't even
	        else 
	        {
	            result = result * x;
	            pow = pow - 1;
	        }
	    }
	    if (y < 0) {
	    	return (double)1/result;
	    }
	    return result;
	}
	
	public static void main(String[] args) {
		System.out.println(LeetCode_50_Pow_x_n.pow(2, -4));
	}
}