package seminar1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class task3 
{
    public static void main(String[] args)
    {
        int[] nums = new int[] {3,2,2,3,4,5,3};
        int val = 3;
        int temp = 0;
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = 0; j < nums.length - 1; j++) 
            {
                if (nums[j] == val)
                {
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(nums));
    }
}
