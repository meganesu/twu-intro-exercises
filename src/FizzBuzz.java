public class FizzBuzz {
    public String fizzBuzz(int n) {
        String s = "";
        for (int i = 1; i < n+1; i++) {
            if (i % 3 == 0) {
                s = s + "Fizz";
            }
            if (i % 5 == 0) {
                s = s + "Buzz";
            }
            if (i % 3 != 0 && i % 5 != 0) {
                s = s + i;
            }
            s = s + "\n";
        }
        return s;
    }
}
