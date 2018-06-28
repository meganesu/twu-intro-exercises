import java.util.ArrayList;

public class IntroExercises {
    public static void main(String[] args) {
        // Test triangle exercises
        TriangleExercises t = new TriangleExercises();

        System.out.println(t.oneStar());
        System.out.println();

        System.out.println(t.horizontalLine(8));
        System.out.println();

        System.out.println(t.verticalLine(3));

        System.out.println(t.rightTriangle(3));

        // Test diamond exercises
        DiamondExercises d = new DiamondExercises();

        System.out.println(d.isoscelesTri(3));

        System.out.println(d.diamond(3));
        System.out.println(d.diamond(8));

        System.out.println(d.diamondName(3, "Megan"));

        // Test fizzbuzz exercise
        FizzBuzz fb = new FizzBuzz();

        System.out.println(fb.fizzBuzz(100));

        // Test prime factors exercise
        PrimeFactors pf = new PrimeFactors();

        ArrayList<Integer> factors = pf.generate(30);
        System.out.println(factors);

        factors = pf.generate(49);
        System.out.println(factors);
    }
}
