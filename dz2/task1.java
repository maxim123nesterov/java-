package dz2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
//результат после каждой итерации запишите в лог-файл.


public class task1 
{
    public static void bubbleSort(int[] array) 
    {
        StringBuilder sb = new StringBuilder();
        final int len = array.length;
        for (int i = 0; i < len - 1; i++) 
        {
            for (int j = 0; j < len - i - 1; j++) 
            {
                if (array[j] > array[j + 1]) 
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    sb.append(" " + array[i]);
                }
            }
        }
    }        // fr.write(sb.toString());
    // fr.write("\n");
    // fr.close();

    
    public static void main(String[] args) 
    {
        File file = new File("array.txt");
        StringBuilder sb = new StringBuilder();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt(); 
        int array[] = new int[size]; 
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) 
        {
            
            array[i] = input.nextInt();
        }
        for (int i = 0; i < size; i++) 
        {
            bubbleSort(array);
            sb.append(" " + array[i]);
            
        }
        try
        {
        FileWriter fr = new FileWriter(file, true);
        
        fr.write(sb.toString());
        fr.write("\n");
        fr.close();
        }
        catch (IOException e)
        {
            System.out.println("ERROR");
        }
    }
}
