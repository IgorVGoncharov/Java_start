// Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n) //

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите значение n: ");
        String val = iScanner.nextLine();
        int number = Integer.parseInt(val);
        System.out.printf("n-ое треугольное число = %S", sum(number));
        System.out.printf("\nn! = %S", factor(number));
        iScanner.close();

    }
    public static int sum(int num){
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
    public static int factor(int num){
        int factor = 1;
        for (int i = 1; i <= num; i++) {
            factor = factor * i;
        }
        return factor;
    }
}
