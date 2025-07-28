package pattern.star;
//https://takeuforward.org/pattern/pattern-8-inverted-star-pyramid/
public class Pattern_8_Inverted_Star_Pyramid {
    public static void main(String[] args) {
        int N = 5;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0 ; j < 2* N - (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}