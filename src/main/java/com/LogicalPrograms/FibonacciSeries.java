package com.LogicalPrograms;
 import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args)
    {
        int n, firstNum = 0, secondNum = 0, nextTerm = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of n:");
        n = s.nextInt();
        System.out.print("Fibonacci Series:");
        for(int i = 1; i <= n; i++)
        {
            firstNum  = secondNum ;
            secondNum  = nextTerm ;
            nextTerm  = firstNum  + secondNum ;
            System.out.print(firstNum +" ");
        }
    }
}
