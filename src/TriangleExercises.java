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
}
