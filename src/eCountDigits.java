public class eCountDigits {

    public static int countDigits(int n) {

        if (n >-10 && n < 10) {
             return 1;
        }

        return 1 + countDigits(n/10);
    }
}
