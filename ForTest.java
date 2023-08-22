package practice_programs;

//Power of 2 using for loop
class ForTest {
    public static void main(String args[]) {
        long p = 0;
        int n;
        double q;
        System.out.println("2 to power -n \t n \t 2 to power n");
        for (n = 0; n < 10; n++) {
            if (n == 0) {
                p = 1;
            } else {
                p = p * 2;
            }
            q = 1.0 / (double) p;
            System.out.println(q + "              " + n + "      " + p);
        }
    }
}
