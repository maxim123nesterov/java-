package dz1;
import java.util.Scanner;
// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
public class task1 {
    public static void main(String[] args) 
    {
        System.out.print("Введите число - ");
        Scanner iscan = new Scanner(System.in);
        Integer num = iscan.nextInt();
        int figure = 1;
        int sum = 0;
        for (int i = 0; i < num; i++)
        {
            sum = sum + figure++;
        }
        System.out.println(sum);
    }
}



