import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение  n ");
        int n = scanner.nextInt();
        System.out.print("Введите значение x ");
        int x = scanner.nextInt();
        double result=0;
        for (int j = 1; j <= n; j++) {

            double summa = 2*(1/((2*n+1)*Math.pow(x,2*n+1)));
            result = result + summa;

        }

        System.out.println(result);

    }

}