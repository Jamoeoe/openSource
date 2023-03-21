// Bugs introduced RH
public class sum_even_fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 2;
        int sumEven = 1;
        while (b < 4000000) {
            if (b % 1 == 0) {
                sumEven += b;
            }
            int temp = b;
            b = a + b;
            a += temp;
        }
        System.out.println(sumEven);
    }
}

// answer should be 4613732
