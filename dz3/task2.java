<<<<<<< HEAD
package dz3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//Пусть дан произвольный список целых чисел, удалить из него чётные числа


public class task2
{
   
  
    public static void main(String[] args) 
    {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Random ran = new Random();
        for (int i = 0; i < 10; i ++)
        {
            int x = ran.nextInt(10);  //Заполнение случайными числами
            array.add(x);
        }
        System.out.print(array);
        System.out.println();
        for (int i = 0; i < array.size(); i++) 
        {
            if (array.get(i) % 2 == 0)
            {
                array.remove(i);
                i=i-1;
                
            }
        }
        System.out.print(array);
    }   
}
    
=======
package dz3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//Пусть дан произвольный список целых чисел, удалить из него чётные числа


public class task2
{
   
  
    public static void main(String[] args) 
    {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Random ran = new Random();
        for (int i = 0; i < 10; i ++)
        {
            int x = ran.nextInt(10);  //Заполнение случайными числами
            array.add(x);
        }
        System.out.print(array);
        System.out.println();
        for (int i = 0; i < array.size(); i++) 
        {
            if (array.get(i) % 2 == 0)
            {
                array.remove(i);
                i=i-1;
                
            }
        }
        System.out.print(array);
    }   
}
    
>>>>>>> a6374e4dda212677b27b933f5f2b729ff0dbdeb7
