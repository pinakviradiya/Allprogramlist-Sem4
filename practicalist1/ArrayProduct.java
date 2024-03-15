import java.util.*;
public class ArrayProduct 
{
    public static void main(String[] args) 
{
        int[] numbers = {3, 7, 2, 4}; 
        int product = calculateProduct(numbers);
        System.out.println("The product of the elements in the array is: " + product);
    }
    public static int calculateProduct(int[] arr) 
{
        int product = 1;
        int index = 0;
        while (index < arr.length) 
{
            product *= arr[index];
            index++;
        }
        return product;
    }
}
