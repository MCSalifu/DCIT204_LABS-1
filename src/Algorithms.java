public class Algorithm {

    public static int linearSearch(int[] array, int target){
        for (int i=0; i<array.length; i++)
        {
            if(target == array[i])
            {
                return i;
            }
        }
        return 0;
    }
    public static boolean ascend(int[] array)
    {
        for (int i=0; i<array.length; i++)
        {
            if(i<array.length - 1)
            {
                if (array[i]>array[i+1])
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static int findMiddle(int f, int l)
    {
        return (int) ((f + l) / 2);
    }
    public static int binarySearch(int[] array, int target){
        int mid;
        int firstNumber = 0;
        int lastNumber = array.length - 1;
        while (ascend(array))
        {
            mid = findMiddle(firstNumber, lastNumber);
            if (target == array[mid])
            {
                return mid;
            }
            else if (target < array[mid])
            {
                lastNumber = mid;              
            }
            else if (target > array[mid])
            {
                firstNumber = mid;              
            }
            else
            {
                if (firstNumber == lastNumber)
                {
                    System.out.println("Number not found");
                }
            }
        }
        while (!ascend(array))
        {
            mid = findMiddle(firstNumber, lastNumber);
            if (target == array[mid])
            {
                return mid;
            }
            else if (target > array[mid])
            {
                lastNumber = mid;              
            }
            else if (target < array[mid])
            {
                firstNumber = mid;              
            }
            else
            {
                if (firstNumber == lastNumber)
                {
                    System.out.println("Number not found");
                }
            }
        }
        return 0;
    }

}
