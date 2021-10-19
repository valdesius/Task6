package valdes.inc.com.company;

public class Main {

    public static void main(String[] args) {
//        pow(1);
//        calculateExpressionsModulo(5);
        xInPow(2, 3);
    }

    private static int pow(){
        double result = 0;
        for (int i = 0; i <= 6; i++) {
            System.out.println(result);
            result += 1;

        }
        return (int) result;

    }

    private static int calculateExpressionsModulo(int c){
        int result = 0;
        int startNum1 = 1;
        int startNum2 = 2;
        final int denominator = 2;

        for (int i = 1; i < 9; i++){
            result  = (startNum1 * startNum2) / denominator;
            System.out.println(result);
            startNum1 = startNum1 + 1;
            startNum2 = startNum1 + 1;
        }
        return result;

    }
    private static int xInPow(int x, int index){

        for (int i = 0; i< 6 ; i++){
            pow();
        }
        return x;
    }
}
