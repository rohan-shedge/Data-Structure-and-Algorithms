package pattern.star;

//https://takeuforward.org/pattern/pattern-11-binary-number-triangle-pattern/
public class Pattern_11_Binary_Number_Triangle_Pattern {
    public static void main(String[] args) {
        int N = 5;
        int k = -1;
        for (int i = 0; i < N; i++) {
            k = (i % 2 == 0) ? 1 : 0;
            for (int j = 0; j < i + 1; j++) {
                System.out.print(k);
                k = 1 - k;
            }
            System.out.println();
        }
    }
}