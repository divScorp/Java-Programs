public class numConTrick{
    public static void main(String[] argv) {
        int x = 28;                           // sample number
//        if (argv.length > 0)
//            x = Integer.parseInt(argv[0]);    // number from command line

        System.out.printf("%d dec == %s bin\n", x, dec2m(x, 2));
        System.out.printf("%d dec == %s oct\n", x, dec2m(x, 8));
        System.out.printf("%d dec == %s hex\n", x, dec2m(x, 16));
    }

    static String dec2m(int N, int m) {
        String str = "";
        for (int n = N; n > 0; n /= m) {
            int rem = n % m;
            str = rem < 10 ? rem + str : (char) ('A' - 10 + rem) + str;
        }
        return str;
    }
}