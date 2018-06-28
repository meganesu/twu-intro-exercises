import java.util.ArrayList;

public class PrimeFactors {
    public ArrayList<Integer> generate(int n) {
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();

        // Make negative values positive.
        boolean isNegative = false;
        if (n < 0) {
            isNegative = true;
            n = n * -1;
        }

       for (int i = 1; i < n; i++) {
           if (n % i == 0 && isPrime(i)) {
               primeFactors.add(i);
           }
       }

       // If n was originally negative, then prime factors will also be negative.
       if (isNegative) {
            for (int i = 0; i < primeFactors.size(); i++) {
                primeFactors.set(i, primeFactors.get(i) * -1);
            }
       }

       return primeFactors;
    }

    public boolean isPrime(int n) {
        // Make negative values positive. This assumes negative numbers can be prime.
        if (n < 0) n = n * -1;

        if (n == 0 || n == 1) return false;

        // Assume a number is prime unless proven otherwise
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
