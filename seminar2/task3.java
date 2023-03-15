package seminar2;

import java.util.Scanner;

public class task3 
{
    public static boolean name(String N) 
    {
        for (int i = 0; i < N.length() / 2; i++) 
        {
            if (N.charAt(i) != N.charAt(N.length() - i - 1)) 
            {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) 
    {
        System.out.print("Введите строку: ");
        Scanner iScanner = new Scanner(System.in);
        String N = iScanner.nextLine();
        System.out.println(name(N));
        iScanner.close();

    }
}
