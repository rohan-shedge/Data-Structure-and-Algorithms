package pattern.star;

//https://takeuforward.org/pattern/pattern-3-right-angled-number-pyramid/
public class Pattern_3_Right_Angled_Number_Pyramid {
    public static void main(String[] args) {
        int N = 5;
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(i  + " ");
            }
            System.out.println("");
        }
    }
}
