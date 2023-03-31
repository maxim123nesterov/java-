package seminar4;

import java.util.ArrayList;
import java.util.LinkedList;

public class task1
{
    public static void main(String[] args) 
    {
        long timeStart = System.currentTimeMillis();
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < 100000; i++)
        {
            resultList.add(0, i);
        }
        long timeFinish = System.currentTimeMillis();
        System.out.printf("The time = %d \n" ,timeFinish - timeStart);
        long timeStart1 = System.currentTimeMillis();
        LinkedList<Integer> listLink = new LinkedList<>();
        for (int i = 0; i < 1000000; i++)
        {
            listLink.add(0, i);
        }
        long timeFinish1 = System.currentTimeMillis();
        System.out.printf("The time = %d" ,timeFinish1 - timeStart1);
    }
}