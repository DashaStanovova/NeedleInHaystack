package com.company;

public class Main {

    public static void main(String[] args) {
        int[] haystack={1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37};
        int firstNeedle = 15;
        int secondNeedle = 5;
        System.out.println("1st needle's index is "+binarySearch(haystack, firstNeedle));
        System.out.println("2nd needle's index is "+binarySearch(haystack, secondNeedle));
    }
    public static int binarySearch(int[] haystack, int x){
        int lowBoundary=0;
        int highBoundary=haystack.length - 1;
        while (lowBoundary<=highBoundary){
            int middle = lowBoundary+(highBoundary-lowBoundary)/2;
            if (haystack[middle]==x){
                return middle;
            }
            if(x > haystack[middle]) {
                lowBoundary = middle+1;
            } else {
                highBoundary = middle-1;
            }
        }
        return -1;
    }
}
