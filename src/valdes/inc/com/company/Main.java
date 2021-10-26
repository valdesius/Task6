package valdes.inc.com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = readXAndNAndE("Input x: ");
        int n = readXAndNAndE("Input n: ");
        int sumOfSequence = calculateSumOfSequence(x, n);
        System.out.println(sumOfSequence);
    }

    private static int readXAndNAndE(String text){
        int x = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Input x,n ");
            x = scanner.nextInt();
        } catch (Exception e) {
            System.out.print("Неверно введенные данные ");
            System.exit(1);
        }
        return x;
    }

    private static int calculateSumOfSequence(int x, int n){
        int growXInPow = 0;
        int growNumber = 1;
        int sumOfSequence = 0;

        for (int i = 1; i <= n; i++){
            for (int j = 0; j <= n; j++) {
                growXInPow += Math.pow(x, j);
            }
            sumOfSequence += (growNumber * growXInPow);
            growNumber +=1;
        }
        return sumOfSequence;
    }




}
