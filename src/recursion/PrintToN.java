package recursion;

//https://takeuforward.org/recursion/print-name-n-times-using-recursion/
public class PrintToN {
    public static void main(String[] args) {
        PrintToN obj = new PrintToN();
        obj.printNos(10);
    }

    private void printNos(int N) {
        if (N <= 0) {
            return;
        }
        printNos(N - 1);
        System.out.print(N + " ");
    }

/*    public void printNos(int N) {
        int i = 1;
        while (i < N) {
            System.out.print(i + " ");
            i++;
        }
    }*/
}
