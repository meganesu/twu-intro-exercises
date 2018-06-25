public class TriangleExercises {
    public String oneStar() {
        return "*";
    }

    public String horizontalLine(int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + "*";
        }
        return s;
    }

    public String verticalLine(int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + "*\n";
        }
        return s;
    }

    public String rightTriangle(int n) {
        String s = "";
        for (int line = 0; line < n; line++) {
            for (int star = 0; star < line + 1; star++) {
                s = s + "*";
            }
            s = s + "\n";
        }
        return s;
    }
}
