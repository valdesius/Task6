package valdes.inc.com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = readXAndNAndE("Input x: ");
        int n = readXAndNAndE("Input n: ");
        calculateSumOfSequence(x, n);
    }

    private static int readXAndNAndE(String text){
        int x = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Input  ");
            x = scanner.nextInt();
        } catch (Exception e) {
            System.out.print("Неверно введенные данные ");
            System.exit(1);
        }
        return x;
    }
    //1 пункт
    private static int calculateSumOfSequence(int x, int n){
        int growXInPow = 0;
        int growNumber = 1;
        int sumOfSequence = 0;

        for (int i = 1; i <= n; i++){
            for (int j = 0; j <= n; j++) {
                System.out.println(growXInPow);
                growXInPow += Math.pow(x, j);
            }}



        sumOfSequence = growNumber * growXInPow;
        System.out.println(sumOfSequence);

        return 0;
    }




}
