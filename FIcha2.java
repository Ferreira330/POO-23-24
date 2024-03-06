import java.time.LocalDate;

public class FIcha2     
{
    
    public FIcha2()
    {
        
    }
    int teste[] = {1,2,3,4,5,6,7,8,9,10};
    public int[] array_indices(int[] array, int a, int b)
    {
        int length = (b-a)+1;
        int[] result = new int[length];
        for(int i = 0; i < length; i++)
        {
            result[i] = array[a+i];
        }
        return result;

    }

    public boolean belongs(int a, int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == a)
            {
                return true;
            }
        }
        return false;
    }

    public int[] array_comum(int[] array1, int[] array2)
    {
        int length = array1.length;
        int c = 0;
        int[] result = new int[length];
        for(int i = 0; i< length; i++)
        {
            if (belongs(array1[i], array2) == true && !belongs(array1[i], result))
            {
                c++;
            }
        }
        int[] result2 = new int[c];
        c = 0;
        for(int i = 0; i< length; i++)
        {
            if (belongs(array1[i], array2) == true && !belongs(array1[i], result2))
            {
                result2[c] = array1[i];
                c++;
            }
        }

        return result2;
    }

    public void insereData(LocalDate data)
    {
        System.out.println(data);
    }

    public LocalDate dataMaisProxima(LocalDate[] data)
    {
        LocalDate now = LocalDate.now();
        LocalDate closest = data[0];
        for(int i = 0; i < data.length; i++)
        {
            if(data[i].isAfter(now) && data[i].isBefore(closest))
            {
                closest = data[i];
            }
        }
        return closest;
    }
    //public String toString()
    //{
        
    //}
    
}

// Path: FIcha2.java~
