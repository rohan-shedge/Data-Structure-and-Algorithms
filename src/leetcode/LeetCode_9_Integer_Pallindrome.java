package leetcode;

public class LeetCode_9_Integer_Pallindrome {
	public static void main(String[] args) {
		System.out.println(integerPallindrome(1212));
	}

	
	 private static boolean integerPallindrome(int num) {
		 
		 int original = num;
		 int remainder, reversed = 0;
		 while (num != 0) {
			 remainder = num % 10;
			 reversed = reversed * 10 + remainder;
			 num = num/10;
		 }
		 
 		 return original == reversed;
	 }		 
	/*
	 * private static boolean integerPallindrome() { int num = 12210;
	 * 
	 * if (num < 0 || (num%10 == 0 && num != 0)) return false; int temp = 1, count =
	 * 0; while (temp <= num) { count++; temp = temp * 10; }
	 * 
	 * int originalCount = count; int middle = count/2 - 1; List<Integer> original =
	 * new ArrayList<>(); List<Integer> list_1 = new ArrayList<>(); List<Integer>
	 * list_2 = new ArrayList<>();
	 * 
	 * int i = 0; while(num>0) { original.add(num%10); num = num/10; }
	 * 
	 * i = 0; temp = 0; while (temp <= middle) { list_1.add(original.get(temp));
	 * temp++; }
	 * 
	 * 
	 * while (count-1 > middle) { list_2.add(original.get(count-1)); count-- ; }
	 * 
	 * if (originalCount%2 != 0) { list_2.remove(originalCount/2); }
	 * 
	 * return list_1.equals(list_2); }
	 */
}
