package seminar1;

import java.util.Scanner;

/**
 * task1
 */
public class task1 {
    public static void main(String[] args) {
        System.out.println("Введите ваше имя");
        Scanner iscan = new Scanner(System.in, "Cp866");
        String name = iscan.nextLine();
        System.out.printf("Привет, %s", name);
        iscan.close();
    }
    
}

