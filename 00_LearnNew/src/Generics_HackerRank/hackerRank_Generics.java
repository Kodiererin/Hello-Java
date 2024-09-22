package Generics_HackerRank;

import java.util.*;

public class hackerRank_Generics 
{
    public static <T> void printArray(T[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            System.out.println(arr[i]);
            i++;
        }
    }
    public static void main(String[] args) 
    {
        // Generics Print Array
//    	System.out.println("Enter The Elements");
        Scanner sc = new Scanner(System.in );
        Integer[] arr = new Integer[3];
        for(int i=0 ; i<3 ; i++)
        {
            arr[i] = sc.nextInt();
        }
        String[] arr2 = new String[3];
        for(int j=0 ; j<3 ; j++)
        {
            arr2[j] = sc.next();
        }
        printArray(arr);
        printArray(arr2);
        sc.close();
    }
}