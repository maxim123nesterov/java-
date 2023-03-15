package seminar2;

import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class task1 
{
    public static String builders(String a, String b, int N) 
    {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N/2; i++)
        {
        sb.append(a);
        sb.append(b);
        }
        return sb.toString();
    }
    
    public static void main(String[] args) 
    {
    System.out.print("Введите число N: ");
    Scanner iScanner = new Scanner(System.in);
    int N = iScanner.nextInt();
    String a = "c1";
    String b = "c2";
    System.out.printf(builders(a, b, N));
    iScanner.close();
    }
}

