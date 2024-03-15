import java.util.*;
public class ArraySumCalculator 
{
    public static void main(String[] args) 
{
        int[] numbers = {3, 7, 9, 2, 11, 5}; 
        int sum = calculateSum(numbers);
        System.out.println("The sum of the elements in the array is: " + sum);
    }
    public static int calculateSum(int[] arr) 
{
        int sum = 0;
        for (int i = 0; i < arr.length; i++) 
{
            sum += arr[i];
        }
        return sum;
    }
}
