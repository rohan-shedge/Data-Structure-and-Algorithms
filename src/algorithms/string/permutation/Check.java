package algorithms.string.permutation;

class Check {
	public static void main(String[] args) {
		String additionalData = "9515324545454546501";
		int initialIndex = 0;
		int lastIndex = 2;
		String value = null;
		if (initialIndex < additionalData.length() && "95".equals(additionalData.substring(initialIndex, lastIndex))) {
			int length = Integer.parseInt(additionalData.substring(lastIndex, lastIndex + 2));
			value = additionalData.substring(lastIndex + 2, length);
		}
		System.out.println("value is " + value);
	}
}