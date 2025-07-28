package pattern.star;

//https://takeuforward.org/pattern/pattern-11-binary-number-triangle-pattern/
public class Pattern_11_Binary_Number_Triangle_Pattern {
    public static void main(String[] args) {
        int N = 5;
        int flag = -1;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                flag = 0;
            } else if (i % 2 != 0) {
                flag = 1;
            }

            for (int j = 0; j < i; j++) {
                System.out.print(flag);
                flag = 1 - flag;
            }
            System.out.println();
        }
    }
}