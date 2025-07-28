package basics;

public class Pallindrome {
    public static void main(String[] args) {
        System.out.println(checkPallindrome(10101));
    }

    private static boolean checkPallindrome(int n) {
        int temp = n;
        int reversed = 0;
        while (temp > 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        return n == reversed;

    }
}