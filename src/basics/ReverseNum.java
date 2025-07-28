package basics;

public class ReverseNum {
    public static void main(String[] args) {
        System.out.println(reverse(10400));
    }

    private static int reverse(int n) {
        int temp = n;
        int reversed = 0;
        while (temp > 0) {
            reversed = reversed* 10 + temp % 10;
            temp /= 10;
        }
        return reversed;

    }

    private static int reverse1(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}
