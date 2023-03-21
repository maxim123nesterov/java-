package dz3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
public class task3 
{

    
    public static void main(String[] args) 
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random ran = new Random();
        double sum = 0;
        for (int i = 0; i < 10; i ++)
        {
            int x = ran.nextInt(10);  //Заполнение случайными числами
            arr.add(x);  
        }
        for (int i = 0; i < arr.size(); i++) 
        {
            sum = sum + arr.get(i);
        }    
        System.out.println(arr);
        System.out.println("Минимальный элемент массива: " + Collections.min(arr));
        System.out.println("Максимальный элемент массива: " + Collections.max(arr));
        System.out.println("Среднее арифметическое: " + sum/arr.size());
    } 
}
