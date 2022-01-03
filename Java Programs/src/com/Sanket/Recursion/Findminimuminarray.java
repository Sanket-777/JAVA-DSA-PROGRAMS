package com.Sanket.Recursion;

import java.util.*;

public class Findminimuminarray {

    // function to return minimum element using recursion
    public static int findMinRec(int A[], int n)
    {
        // if size = 0 means whole array
        // has been traversed
        if(n == 1) {System.out.print(A[0]);
            return A[0];
        }

        return Math.min(A[n-1], findMinRec(A, n-1));
    }

    // Driver code
    public static void main(String args[])
    {
        int A[] = {1, 4, 45, 6, -50, 10, 2};
        int n = A.length;

        // Function calling
        System.out.println(findMinRec(A, n));
    }
}