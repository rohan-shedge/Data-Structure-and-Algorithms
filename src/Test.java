public class Test {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 12;
        Test test = new Test();
        System.out.println(test.gcd(num1, num2));
    }

    private int gcd(int num1, int num2) {
        int gcd = 1;
        for (int i = 2; i < Math.min(num1, num2); i++) {
            if ((num1 % i == 0) && (num2 % i == 0)) {
                gcd = i;
            }
        }
        return gcd;
    }
}




