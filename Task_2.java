// Вывести все простые числа от 1 до 1000 //

public class Task_2 {
    public static void main(String[] args) {
        System.out.println("Список простых чисел от 1 до 1000:");
        for (int i = 2; i < 1000 ; i++){
            if(simpleCheck(i))
                System.out.printf("%S ", i);
        }
    }
    public static boolean simpleCheck(int number){
        if (number <= 1)
            return false;
        else if (number <= 3)
            return true;
        else if (number % 2 == 0 || number % 3 ==0)
            return false;
        int n = 5;
        while (n*n <= number){
            if (number % n ==0 || number % (n+2) == 0)
                return false;
            n=n+6;
        }
        return true;
 }   
}
