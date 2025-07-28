package pattern.star;

//https://takeuforward.org/pattern/pattern-12-number-crown-pattern/
public class Pattern_12_Number_Crown_Pattern {
    public static void main(String[] args) {
        int N = 6;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 0; j < (2 * N - 2 * i) ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0  ; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
