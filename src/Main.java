import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void Example1() {
        Scanner scanner = new Scanner(System.in);

        double x = 0;
        double z = 0;
        double fact = 0;

        for (int i = 1; i <= 15; i++) {
            fact = 1;
            for (int j = 1; j <= i; j++) {
                fact *= i;
            }
            System.out.print("Введите Х :");
            x = scanner.nextDouble();

            z = (i + x) / fact;
            System.out.println("X =  " + x + " Z = " + z);
        }
    }

    public static void Example2() {
        int x = 101;
        int count = 0;
        do {
            if (x % 19 == 0) {
                System.out.println(x);
                ++count;
            }
            ++x;
        } while (count <= 15);
    }

    public static void Example3() {
        int x = 501;
        int count = 0;
        do {
            if (x % 13 == 0 || x % 17 == 0) {
                System.out.println(x);
                count++;
            }
            x++;
        } while (count <= 20);
    }

    public static void Example4(){
        int library[] = new int[35];
        Random random = new Random(10000);
        for (int i = 0; i < library.length; i++) {
            library[i] = random.nextInt(30000);
        }

        int sum = 0;

        for (int i = 0; i < library.length; i++) {
            sum += library[i];
        }

        System.out.println(sum);

        if (sum >= 100000 && sum <= 999999) {
            System.out.println("Шестизначное.");
        } else {
            System.out.println("Не шестизначное.");
        }
    }

    public static void main(String[] args) {

    }
}