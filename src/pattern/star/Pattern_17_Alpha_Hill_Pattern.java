package pattern.star;
//https://takeuforward.org/pattern/pattern-17-alpha-hill-pattern/
public class Pattern_17_Alpha_Hill_Pattern {
    public static void main(String[] args) {
        int N = 5;
        for (int i = 1; i < N; i++) {
            char ch = 65;
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(ch++);
            }
            ch--;
            for (int j = 0; j < i - 1; j++) {
                System.out.print(--ch);
            }
            System.out.println();
        }
    }
}
