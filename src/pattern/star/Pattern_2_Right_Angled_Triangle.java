package pattern.star;

//https://takeuforward.org/pattern/pattern-2-right-angled-triangle-pattern/
public class Pattern_2_Right_Angled_Triangle {
    public static void main(String[] args) {
        int N = 3;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
