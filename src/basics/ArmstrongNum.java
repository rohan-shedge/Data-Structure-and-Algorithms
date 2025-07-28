package basics;

public class ArmstrongNum {
    public static void main(String[] args) {
        System.out.println(ArmStrong(1533));
    }

    private static boolean ArmStrong(int n) {
        int pow = countDigits(n);
        int temp = n;
        int newNumber = 0;
        while (temp > 0) {
            newNumber += Math.pow(temp % 10, pow);
            temp /= 10;
        }
        return newNumber == n;
    }

    private static int countDigits(int n) {
        return (int)(Math.log10(n) + 1);
    }
}