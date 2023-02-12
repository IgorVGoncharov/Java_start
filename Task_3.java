// Реализовать простой калькулятор //

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int firstNumber = Integer.parseInt(iScanner.nextLine());
        System.out.printf("Введите действие: ");
        char operation = iScanner.nextLine().charAt(0);
        System.out.printf("Введите второе число: ");
        int secNumber = Integer.parseInt(iScanner.nextLine());     
        iScanner.close();
        if (secNumber == 0 && operation == '/'){
            System.out.println("Ошибка! На ноль делить нельзя");
        }
        else if (operation != '+' && operation != '-' && operation != '*' && operation != '/'){
            System.out.println("Введено не верно действие");
        }
       else 
            System.out.printf("Результат = %S", calc(firstNumber, secNumber, operation));
    }
    public static int calc(int firstNumber, int secNumber, char operation){
        if (operation == '+'){
           return (firstNumber + secNumber);
        }
        else if (operation == '-'){
            return (firstNumber - secNumber);
        }
        else if (operation == '*'){
            return (firstNumber * secNumber);
        }
        else 
            return firstNumber / secNumber; 
    }
}
