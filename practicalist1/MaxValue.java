import java.util.*;
public class MaxValue
{
    public static void main(String[] args) 
{
        int[] numbers = {3, 7, 2, 11, 5}; 
        int max = findMax(numbers);
        System.out.println("The maximum value in the array is: " + max);
    }
    public static int findMax(int[] arr) 
{
        if (arr.length == 0) 
{
            return 0;
        }
        int max = arr[0]; 
        int index = 1;
        do 
{
            if (arr[index] > max) 
{
                max = arr[index]; 
            }
            index++;
        } while (index < arr.length);
        return max;
    }
}
