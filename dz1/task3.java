package dz1;
import java.util.Scanner;
// 

import javax.swing.event.SwingPropertyChangeSupport;
public class task3 {
    public static void main(String[] args) 
    {
        System.out.print("Введите первое число: ");
        Scanner iscan1 = new Scanner(System.in);
        Integer num1 = iscan1.nextInt();
        System.out.print("Введите вычислительный знак: ");
        Scanner iscan2 = new Scanner(System.in);
        String sign = iscan2.nextLine();
        System.out.print("Введите второе число: ");
        Scanner iscan3 = new Scanner(System.in);
        Integer num2 = iscan3.nextInt();
        iscan2.close();
        switch (sign){
        case "+":
        {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            break;
        }
        case "-":
        {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            break;
        }
        case "*":
        {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            break;
        }
        case "/":
        {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            break;
        }
       
    }
            

    }
    
}
