package valdes.inc.com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = readXAndNAndE("Input x: ");
        int n = readXAndNAndE("Input n: ");
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

}
