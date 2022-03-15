package Practice;

public class Task80 {
    public static void main(String[] args) {

        double[][] a = {
                {1.4, 2.0, 3.3, 2},
                {4, 1.5, 6.1, 1},
                {1.2, 3.1, 4, 1.6}
        };

        //Double and print array

        for (double row = 0; row < a.length; row++) {
            System.out.print(a[(int) row] + " ");
        }
    }
}
