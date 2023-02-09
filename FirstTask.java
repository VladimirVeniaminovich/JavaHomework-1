/**
 * FirstTask
 * Сумма чисел от 1 до n
import java.util.Scanner;
public class FirstTask {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число N: ");
        int N = iScanner.nextInt();
        int count = 0;
        for (int i = 1; i <= N; i++){
            count = count + i;
        }
        System.out.println(count);

    }
}
*/

import java.util.Scanner;
public class FirstTask {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число N: ");
        int N = iScanner.nextInt();
        int count = 1;
        for (int i = 1; i <= N; i++){
            count = count * i;
        }
        System.out.println(count);
        iScanner.close();
    }
}
