package dz2;

import java.util.Scanner;

public class task2 
{
    public static void EnterName() 
    {
        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.println("Введите фамилию ученика: ");
        String name = iScanner.next();
        System.out.println(name);
    }
    public static void EnterLess()
    {
        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.println("Введите предмет: ");
        String less = iScanner.nextLine();
        System.out.println(less);
    }
    public static void EnterVal()
    {
        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.println("Введите оценку: ");
        String val = iScanner.nextLine();
        System.out.println(val);
    }
    public static void main(String[] args) 
    {
        EnterName();
        EnterLess();
        EnterVal();
    }
}
