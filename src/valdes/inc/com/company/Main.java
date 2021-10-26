package valdes.inc.com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = readXAndNAndE("Input x: ");
        int n = readXAndNAndE("Input n: ");
        int e = readXAndNAndE("Input e: ");

        double sumOfSequence = calculateSumOfSequence(x, n);
        double sumOfSequenceMoreThanEpsilon = calculateSumOfSequenceMoreThanEpsilon(x, n, e);
        double sumOfSequenceMoreThanEpsilonDivideTen = calculateSumOfSequenceMoreThanEpsilon(x, n, e / 10);
        double functionValue = calculateValueOfFunction(x);

        System.out.println("1. сумма n слагаемых заданного вида = " + sumOfSequence);
        System.out.println("2. сумма тех слагаемых, которые по абсолютной величине больше e = " + sumOfSequenceMoreThanEpsilon);
        System.out.println("3. сумму тех слагаемых, которые по абсолютной величине больше e/10 = " + sumOfSequenceMoreThanEpsilonDivideTen);
        System.out.println("4. значение функции с помощью методов Math = " + functionValue);
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

    private static int calculateSumOfSequenceMoreThanEpsilon(double x, int n, double e){
        int sumOfSequenceMoreThanEpsilon = 0;

        for (int i = 1; i <= n; i++) {
            double nMemberOfSequence = getNMemberOfSequence(x, i);
            if (Math.abs(nMemberOfSequence) > e) {
                sumOfSequenceMoreThanEpsilon += getNMemberOfSequence(x, i);
            }
        }

        return sumOfSequenceMoreThanEpsilon;
    }

    private static double getNMemberOfSequence(double x, int n) {
        return Math.pow(x, n - 1);
    }

    private static double calculateValueOfFunction(double x){
        return 1 / Math.pow((1 - x), 2);
    }
}
