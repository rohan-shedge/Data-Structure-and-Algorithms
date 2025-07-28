package pattern.star;

//https://takeuforward.org/pattern/pattern-4-right-angled-number-pyramid-ii/
public class Pattern_4_Right_Angled_Number_Pyramid_2 {
    public static void main(String[] args) {
        int N = 5;
        for (int i = 0; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}
