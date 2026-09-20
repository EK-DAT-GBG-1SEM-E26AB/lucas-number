public class LucasNumber {

    public int calculate(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 3;
        }
        return calculate(n - 1) + calculate(n - 2);
    }
}
