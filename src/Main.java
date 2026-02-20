import java.util.Scanner;

public class Main {

    public int fibonacci(int n) {
        int k;
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        else
            return k = fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

//        To print fibonacci series
        System.out.print(0 + "\t");
        System.out.print(1 + "\t");
        int a = 0;
        int b = 1;
        for (int i = 1; i < n; i++) {
            int c = a + b;
            System.out.print(c + "\t");
            a = b;
            b = c;
        }

        Main m = new Main();

//      printing the place of the number in the fibonacci series
        System.out.println("\n" + m.fibonacci(n));


    }
}