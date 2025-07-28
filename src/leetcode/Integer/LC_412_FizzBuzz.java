package leetcode.Integer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class LC_412_FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add("" + i);
            }
        }
        return list;
    }

    @Test
    public void Test() {
        LC_412_FizzBuzz fizzBuzz =  new LC_412_FizzBuzz();
        List<String> actual = fizzBuzz.fizzBuzz(3);
        List<String> expected = Arrays.asList("1","2","Fizz");
        Assertions.assertEquals(actual, expected);
    }
}

