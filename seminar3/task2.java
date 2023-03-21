package seminar3;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class task2 {
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> ar = new ArrayList<String>(Arrays.asList("Sun", "Pluton", "Mercury", "Venus", "Earth","Saturn", "Mars", 
            "Jupiter", "Saturn", "Uranus", "Mercury","Neptune", "Pluton"));
        int count = 0;
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < ar.size(); i++) 
        {
            count = 0;
            if(!result.contains(ar.get(i)))
            {
                result.add(ar.get(i));
                for (int j = 0; j < ar.size(); j++) 
                {
                    if(ar.get(i) == ar.get(j))
                    {
                        count +=1;
                    }

                }
                System.out.println(count + " " + ar.get(i));
            }
            
        }
    }        
}
