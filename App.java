package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n :");
        int n = scanner.nextInt();

        System.out.print("m :");
        int m = scanner.nextInt();

        float[] firstCoffecients = new float[n + 1];
        float[] secondCoffecients = new float[m + 1];

        System.out.println("firstCoffecients:");
        for (int i = 0; i < n + 1; i++) {
            System.out.print("offecients " + i + " :");
            firstCoffecients[i] = scanner.nextInt();
        }

        System.out.println("secondCoffecients:");
        for (int i = 0; i < m + 1; i++) {
            System.out.print("coffecients " + i + " :");
            secondCoffecients[i] = scanner.nextInt();
        }

        String result = "";

        for (int i = 0; i < n + 1; i++) {
            for (int y = 0; y < m + 1; y++) {
                float coffecient = firstCoffecients[i] * secondCoffecients[y];
                float power = i + y;
                result += Float.toString(coffecient) + "X^" + Float.toString(power) + "+";
            }
        }
        
        System.out.println(result);
    }
}