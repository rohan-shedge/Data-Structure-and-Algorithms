package recursion;

import java.util.Arrays;
import java.util.Objects;

public class Recursion {
    public static void main(String[] args) {
        Recursion r = new Recursion();
        r.printTillN(1, 10);
        System.out.println();
        System.out.println(r.sumOfNumbers(5));

        r.printName(1, 3, "Rohan");
        System.out.println();
        System.out.println(r.factorial(5));
        System.out.println();
        int[] array =  {1, 2, 3, 4, 5};
        Arrays.stream(array).forEach(System.out::print);
        r.reverseArray(1, array);
        System.out.println();
        Arrays.stream(array).forEach(System.out::print);
        System.out.println();
        System.out.println("Madam -> " + r.isPalindrome("madam"));
        System.out.println();
        System.out.println("5 -> " + r.fibonacci(5));

    }


    void printTillN(int i, int N) {
        if (i > N) {
            return;
        }
        System.out.print(i + " ");
        printTillN(++i, N);
    }

    void printName(int i , int N, String name) {
        if (i > N) {
            return;
        }
        System.out.print(name + " ");
        printName(i+1, N, name);
    }

    int sumOfNumbers(int N) {
        if (N <= 0) {
            return N;
        }
        return N + sumOfNumbers(N-1);
    }

    int factorial(int n) {
        if (n <= 0) {
            return 1;
        }
        return n * factorial(n-1);
    }

    void reverseArray(int i, int[] array) {
        if (i <= array.length/2) {
            int temp = array[i-1];
            array[i-1] = array[array.length-i];
            array[array.length-i] = temp;
            reverseArray(++i, array);
        }
    }

    boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static int fibonacci(int N) {
        if (N <= 1) {
            return N;
        }
        int last = fibonacci(N - 1);
        int slast = fibonacci(N - 2);
        return last + slast;
    }
}
