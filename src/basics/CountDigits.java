package basics;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigits1(65454));
    }

    private static int countDigits(int n) {
        return (int)(Math.log10(n) + 1);
    }

    private static int countDigits1(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}
