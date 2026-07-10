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

        System.out.println("");
        System.out.println("");
        N = 5;
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N - i - 1; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");
        N = 5;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2* N-2*(i+1)+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
