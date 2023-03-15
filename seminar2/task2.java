package seminar2;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class task2 
{
    public static void name(String N)
    {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char temp = N.charAt(0);
        sb.append(temp);
        for (int i = 1; i < N.length(); i++) 
        {
            if (temp != N.charAt(i))
            {
                //sb.append(count);
                
                if (count != 1)
                {
                    sb.append(count);
                    count = 1;
                }
                sb.append(N.charAt(i));
                temp = N.charAt(i);
            }
            else 
            {
                count+=1;
            }
        }
        if (count != 1)
        {
            sb.append(count);
        }
        
        System.out.println(sb.toString());
    }
    public static void main(String[] args) 
    {
        System.out.print("Введите строку: ");
        Scanner iScanner = new Scanner(System.in);
        String N = iScanner.nextLine();
        name(N);
        iScanner.close();
    }
}
