public class DiamondExercises {
    public String isoscelesTri(int n) {
        String s = "";
        for (int line = 0; line < n; line++) {
            for (int i = 0; i < n - (line + 1); i++) {
                s = s + " ";
            }
            for (int i = 0; i < 2*line + 1; i++) {
                s = s + "*";
            }
            s = s + "\n";
        }
        return s;
    }

    public String diamond(int n) {
        String s = isoscelesTri(n);
        for (int i = n-1; i > 0; i--) {
            for (int sp = 0; sp < n - i; sp++) {
                s = s + " ";
            }
            for (int st = 0; st < (2*n - 1) - (2*(n-i)); st++) {
                // # stars = (max # stars in diamond) - (2 * # preceding spaces)
                s = s + "*";
            }
            s = s + "\n";
        }
        return s;
    }

    public String diamondName(int n, String name) {
        String s = "";
        for (int line = 0; line < n-1; line++) {
            for (int i = 0; i < n - (line + 1); i++) {
                s = s + " ";
            }
            for (int i = 0; i < 2*line + 1; i++) {
                s = s + "*";
            }
            s = s + "\n";
        }
        s = s + name + "\n";
        for (int i = n-1; i > 0; i--) {
            for (int sp = 0; sp < n - i; sp++) {
                s = s + " ";
            }
            for (int st = 0; st < (2*n - 1) - (2*(n-i)); st++) {
                // # stars = (max # stars in diamond) - (2 * # preceding spaces)
                s = s + "*";
            }
            s = s + "\n";
        }
        return s;
    }
}
