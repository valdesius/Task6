package valdes.inc.com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = readXAndNAndE("Input x: ");
        int n = readXAndNAndE("Input n: ");

        double sumOfSequence = calculateSumOfSequence(x, n);
        System.out.println("1. сумма n слагаемых заданного вида = " + sumOfSequence);

    }

    private static int readXAndNAndE(String text){
        int x = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print(text);
            x = scanner.nextInt();
        } catch (Exception e) {
            System.out.print("Not correct data... ");
            System.exit(1);
        }
        return x;
    }

    private static double calculateSumOfSequence(int x, int n){
        double growPowInX = 0;
        double growNumber = 1;
        double partOfSequence = 0;
        double sumOfSequence = 0;

        for (int j = 0; j < n; j++){
            growPowInX = Math.pow(x, j); // возведение икса в степень
            partOfSequence = growNumber * growPowInX;
            sumOfSequence += partOfSequence;

            growNumber += 1;
        }
        return sumOfSequence;
    }
}
