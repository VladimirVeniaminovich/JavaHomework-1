import java.util.Scanner;

public class ThirdTask{
    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in);
        System.out.println("Введите операцию\n" + 
        "'+'  - Сложение\n" +
        "'-'  - Вычитание\n" +
        "'*'  - Умножение\n" +
        "'/'  - Деление");
        String operation = numScan.nextLine();
        System.out.println("Введите первое число: ");
        int num1 = numScan.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = numScan.nextInt();
        if (operation.equals("+")) System.out.println(num1+num2);
        else if (operation.equals("-")) System.out.println(num1-num2);
        else if (operation.equals("*")) System.out.println(num1*num2);
        else if (operation.equals("/")) System.out.println(num1/num2);
        /*char operation = numScan.next().charAt(0);
        switch (operation){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break; 
        }*/
        numScan.close();
    }
}